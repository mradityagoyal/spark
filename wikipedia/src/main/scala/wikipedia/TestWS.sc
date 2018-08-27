import wikipedia.WikipediaArticle

val text = """Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris vehicula fringilla nisi. Aliquam erat volutpat. Integer lacinia nisl nisi, sed malesuada est pellentesque quis. Vivamus sed pulvinar turpis. Phasellus sed est feugiat, vulputate ligula scelerisque, hendrerit velit. Proin consequat pellentesque semper. Maecenas in justo neque. Mauris eget diam eget est accumsan scelerisque a semper nunc. Phasellus ut ligula quis enim ultricies facilisis. Proin augue ligula, commodo eget tortor quis, dapibus scelerisque ex.
             |
             |Cras vestibulum sed mauris ac convallis. Cras tortor purus, imperdiet at placerat vitae, faucibus et ex. Ut consectetur dapibus porta. Phasellus elementum augue ac arcu vehicula, vitae tempus metus eleifend. Nullam a mattis tortor. Donec non egestas erat, sed mattis tortor. Nam dictum ultrices ante, sed pulvinar metus fermentum eget. Curabitur imperdiet eu diam vehicula scelerisque. Morbi eget ex eget ante tristique malesuada eu ut lorem. Sed fringilla mi in purus ultricies, at gravida augue luctus. Vivamus hendrerit velit sed elit sollicitudin dapibus. Vivamus mauris velit, tempus ac tellus eget, finibus iaculis lacus. Vestibulum sapien libero, convallis luctus luctus euismod, varius ut velit.
             |
             |Curabitur eget elit finibus, euismod erat a, faucibus risus. Maecenas vel efficitur ligula. Integer non dignissim erat, eget dignissim nisl. Etiam eget urna metus. Mauris a ornare velit. Etiam aliquam iaculis quam eget porta. Nunc dignissim viverra odio nec rhoncus. Donec id rutrum est. Vivamus sagittis vel enim sagittis posuere. Fusce in fermentum est. Proin augue nisl, luctus quis orci ut, placerat fermentum tortor. Morbi vel magna nec odio auctor sollicitudin. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices enim venenatis libero sagittis, vel bibendum eros venenatis."""

val words = List("vestibulum", "maurice")



val seqOp: (Int, WikipediaArticle) => Int = (count, article) => if (article.mentionsLanguage(lang)) count + 1
else count
val combineOp: (Int, Int) => Int = _ + _