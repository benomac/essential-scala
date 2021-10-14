class Adder(val amount: Int) {
  def apply(in: Int) = in + amount
}
val newAdder = new Adder(3)

case class Counter(val count: Int = 0) {
  def dec = copy(count = count - 1)
  def inc = copy(count = count + 1)

  def adjust(ad: Adder): Counter = {
    new Counter(ad(count))
  }
}

val a = new Counter(10)
a.inc.dec.inc.inc.adjust(newAdder).count
val f = Counter().inc


//class Adder2(val amount: Int)
//
//object Adder2 {
//  def apply(in: Int, amount: Int): Adder =
//    new Adder(in + amount)
//}
//
//
//class Counter2(val count: Int) {
//  def inc: Counter2 = inc()
//  def dec: Counter2 = dec()
//  def inc(i: Int = 1): Counter2 = new Counter2(count + i)
//  def dec(i: Int = 1): Counter2 = new Counter2(count - i)
//
//  def adjust(): Counter2 = {
//    new Counter2(Adder2(3, count).amount)
//  }
//}
//
//val a = new Counter2(10)
//a.inc.dec.inc(50).inc.adjust().count
//
//
//
//
//
//
//class Timestamp(val secs: Long)
//
//object Timestamp {
//  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
//    new Timestamp(hours*60*60 + minutes*60 + seconds/* secs value */)
//}
//Timestamp(1, 1, 1).secs
//new Timestamp(1)