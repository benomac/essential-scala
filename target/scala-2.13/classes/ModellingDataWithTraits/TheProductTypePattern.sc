//has-a and
//A "has" a B and a C, write
//known as a "product" type
trait A {
  def b: B
  def c: C
}

//////////////////////////////////

//is-a or
//A "is" a B or a C, write
//known as a "sum" type

sealed trait A
final case class B() extends A
final case class C() extends A

/////////////////////////////////////////

//is-a and
////A "is" a B and C
trait B
trait C
trait A extends B with C

//////////////////////////////////

//has-a or
//A "has" a B or a C

trait A {
  def d: D
}
sealed trait D
final case class B() extends D
final case class c() extends D

new D {}

sealed trait TrafficLight
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

sealed trait Calculator
case class Succeed(result: Int) extends Calculator
case class Fail(reason: String) extends Calculator



sealed trait SourcedFrom
case object Well extends SourcedFrom
case object Spring extends SourcedFrom
case object Tap extends SourcedFrom

case class BottledWater(size: Int, source: SourcedFrom, carbonated: Boolean)

val f = BottledWater(1, Well, carbonated = true)
f

