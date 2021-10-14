println("Welcome to the scala worksheet!")

1+1
if(20 > 10)"left" else "right"

println("the ultimate answer is " + 42)

"hello world".toUpperCase()
List(9, 6, 3, 5, 6, 4).max

"foo" take 1

1.+(2.+(3))
1.+(2).+(3)

object Test2 {
  def name: String = "Probably the best object ever"
}
Test2

object Test3 {
  def hello(name: String): String = {
    "hello " + name
  }
}
Test2.name
Test3.hello("ben")

object Test4 {
  val name: String = "ben"
  def hello(other: String): String =
    name + " says hi to " + other
}
Test4.hello("dawn")

object Test7 {
  val simpleField = {
    println("Evaluating simpleField")
    42 }
  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  } }
Test7
Test7.simpleField

object calc {
  def square(a: Double): Double = {
    a * a
  }

  def cube(a: Double): Double = {
    a * square(a)
  }
}
calc.square(2)
calc.square(3)

object calc2 {
  //"square" and "cube" have been "OVERLOADED" to accept either "Int" or "Double" "types"
  def square(value: Double) = value * value
  def cube(value: Double) = value * square(value)

  def square(value: Int) = value * value
  def cube(value: Int) = value * square(value)
}

calc2.square(2.0)
calc2.square(2)

object argh {
  def a = {
    println("a")
    1 }
  val b = { println("b")
    a+2
  }
  def c = {
    println("c")
    a
    b + "c" }
}
argh.c + argh.b + argh.a

object Person {
  val firstName: String = "Ben"
  val lastName: String = "Mcallister"
}
object Alien {
  def greet(person: Person.type): Unit = {
    println(s"Greetings human ${person.firstName} ${person.lastName}")
  }
}
val d = Alien.greet(Person)