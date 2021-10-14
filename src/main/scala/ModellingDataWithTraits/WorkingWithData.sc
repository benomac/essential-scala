sealed trait A {
  def foo: String
}

final case class B() extends A {
  override def foo: String =
    "It's B!"
}

final case class C() extends A {
  def foo: String =
    "It's C!"
}

val anA: A = B()

anA.foo

val anA2: A = C()

anA2.foo


//A complete example



sealed trait Feline
sealed trait Food
case object Antelope extends Food
case object TigerFood extends Food
case object Licorice extends Food
final case class CatFood(food: String) extends Food

//sealed trait Feline {
//  def dinner: Food =
//    this match {
//      case Lion() => Antelope
//      case Tiger() => TigerFood
//      case Panther() => Licorice
//      case Cat(favouriteFood) => CatFood(favouriteFood)
//    }
//}



final case class Lion() extends Feline {
//  override def dinner: Food =
//    Antelope
}
final case class Tiger() extends Feline {
//  override def dinner: Food =
//    TigerFood
}
final case class Panther() extends Feline {
//  override def dinner: Food = {
//    println("foof")
//    Licorice
//  }
}
final case class Cat(favouriteFood: String) extends Feline {
//  override def dinner: Food =
//    CatFood(favouriteFood)
}

//final case class Lion() extends Feline
//final case class Tiger() extends Feline
//final case class Panther() extends Feline
//final case class Cat(favouriteFood: String) extends Feline

object Diner {
  def dinner(feline: Feline): Food =
    feline match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Licorice
      case Cat(food) => CatFood(food)
    } }

val lion = new Lion
Diner.dinner(lion)