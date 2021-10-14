import scala.annotation.tailrec

sealed trait IntList

case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends  IntList

val fooList = Pair(1, Pair(2, Pair(3, End)))
val newList = Pair(2, fooList)
val d = End
val c = Pair(3, d)
val b = Pair(2, c)
val a = Pair(1, b)

//Add together all elements of an IntList

def sum(list: IntList): Int = list match {
  case End => 0
  case Pair(head, tail) => head + sum(tail)
}

@tailrec
def sumTail(list: IntList, acc: Int = 0): Int = list match {
  case End => acc
  case Pair(head, tail) => sumTail(tail, acc + head)
}

val example: Pair = Pair(1, Pair(2, Pair(3, End)))

sum(example) == 6
sum(example.tail) == 5
sum(End) == 0

sumTail(example) == 6
sumTail(example.tail) == 5
sumTail(End) == 0

val d: IntList = new Pair(1, End)
d.getClass