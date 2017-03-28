
bject SimpleJoin {
  
  def split_fileA(line: String): (String, Int) = line.split(",") match {
    case Array(key, count) => (key , count.toInt)
  }
  
  def split_fileB(line: String): (String, (String, Int)) = line.split(",") match {
    case Array(date_key, day_count) => date_key.split(" ") match {
      case Array(date, key) => (key, (date, day_count.toInt))
    }
  }
  
  val fileA = sc.txtFile("join1_fileA.txt")
  val fileB = sc.txtFile("join1_fileB.txt")
  
  val dataA = fileA.map(split_fileA)
  val dataB = fileB.map(split_fileB)
  
  val join = dataB.join(dataA)
    
}
