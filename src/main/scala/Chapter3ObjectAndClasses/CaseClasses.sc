case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}
object Person {
  def apply(name: String): Person = {
    val parts = name.split(" ")
    apply(parts(0), parts(1))
  }
}
val be = Person("ben mcallister")
val ben = Person("ben", "mcallister")
be
