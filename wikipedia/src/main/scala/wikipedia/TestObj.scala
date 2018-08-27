package wikipedia

object TestObj extends App {

//  val lang = "g"
//  val seqOp: (Int, String) => Int = (count, article) => if (article.contains(lang)) count + 1
//  else count
//  val combineOp: (Int, Int) => Int = _ + _
//
//
//  val text = List("Aditya", "goyal", "working", "spark")
//
//  val count = text.aggregate(0)(seqOp, combineOp)
//
//  println(count)



  val ranks = WikipediaRanking.timed("ranking", WikipediaRanking.rankLangs(WikipediaRanking.langs, WikipediaRanking.wikiRdd))

  val ranks2 = WikipediaRanking.timed(
    label = "rankingByIndex",
    code = WikipediaRanking.rankLangsUsingIndex(WikipediaRanking.makeIndex(WikipediaRanking.langs, WikipediaRanking.wikiRdd))
  )
  println(WikipediaRanking.timing)
}
