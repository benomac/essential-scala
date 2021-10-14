//case class Cat(val colour: String, val food: String)
//val oswald = new Cat("Black", "Milk")
//val henderson = new Cat("Ginger", "Chips")
//val quentin = new Cat("Tabby and white", "Curry")

trait Feline {
  def colour: String
}

trait BigCat extends Feline {
  val sound: String = "Roar"
}

trait LittleCat extends Feline {
  val sound: String = "Meow"
}

case class Cat(colour: String,
               food: String
              ) extends Feline

case class Tiger(colour: String,
                  ) extends BigCat

case class Lion(colour: String,
                maneSize: Int
                 ) extends BigCat

case class Panthers(colour: String,
                    ) extends BigCat

val lion = Lion("Black", 10)
lion.sound
val sammie = Cat("Black", "Dreamies")

val tiger = Tiger("Orange and Black")
tiger.colour


