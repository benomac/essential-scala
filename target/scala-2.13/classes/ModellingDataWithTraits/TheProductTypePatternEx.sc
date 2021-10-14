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
