class Person(val firstName: String, val lastName: String)
object Person {
  def apply(name: String): Person = {
    val parts = name.split(" ")
    new Person(parts(0), parts(1))
  }
}
Person("ben Mac").firstName
Person("ben Mac").lastName

val ben = new Person("ben", "Mcallister")
ben.firstName
object alien {
  def greet(p: Person) =
    "Greetings, " + p.firstName.capitalize + " " + p.lastName.capitalize

  def greet2(citizen: String = "friend", firstName: String = "Some", lastName: String = "Body") =
    "Greetings, " + " " + citizen + " " + firstName + " " + lastName + "!"
  }

alien.greet(ben)
ben.firstName
ben.firstName

//Default and keyword parameters



alien.greet2(firstName = "ben")

def badness = throw new Exception("Error")
// badness: Nothing
def otherbadness = null
// otherbadness: Null
val bar = if(true) 123 else badness
// bar: Int = 123
val baz = if(false) "it worked" else otherbadness
// baz: String = null

case class Cat(val colour: String, val food: String)
val oswald = new Cat("Black", "Milk")
val henderson = new Cat("Ginger", "Chips")
val quentin = new Cat("Tabby and white", "Curry")

object ChipShop {
  def willServe(cat: Cat): Boolean = cat match {
    case Cat(_, "Chips") => true
    case Cat(_, _) => false
  }
}
ChipShop.willServe(henderson)

