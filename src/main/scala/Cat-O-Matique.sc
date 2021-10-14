
  object Oswald {
    val colour: String = "Black"
    val food: String = "Milk"
    def printCatInfo(): Unit = {
      println(s"This cat is $colour and its fav food is $food")
    }
  }

  object Henderson {
    val colour: String = "Ginger"
    val food: String = "Chips"
    def printCatInfo(): Unit = {
      println(s"This cat is $colour and its fav food is $food")
    }
  }

  object Quentin {
    val colour: String = "Tabby and White"
    val food: String = "Curry"
    def printCatInfo(): Unit = {
      println(s"This cat is $colour and its fav food is $food")
    }
  }

  Quentin  .printCatInfo()
  Henderson.printCatInfo()
  Oswald   .printCatInfo()

