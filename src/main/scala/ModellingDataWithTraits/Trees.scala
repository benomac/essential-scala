package ModellingDataWithTraits

trait IntNode {
  def incl(x: Int): IntNode

  def contains(x: Int): Boolean
}

class Empty extends IntNode {
  override def incl(x: Int): IntNode = new NonEmpty(x, new Empty, new Empty)

  override def contains(x: Int): Boolean = false

  override def toString = " . "
}

class NonEmpty(elem: Int, left: IntNode, right: IntNode) extends IntNode {
  override def incl(x: Int): IntNode =
    if (x < elem)
      new NonEmpty(elem, left incl x, right)
    else if (x > elem)
      new NonEmpty(elem, left, right incl x)
    else
      this

  override def contains(x: Int): Boolean =
    if (x < elem)
      left.contains(x)
    else if (x > elem)
      right.contains(x)
    else
      true

  override def toString: String = " { " + left + elem + right + " } "
}

object Trees extends App {

  val test = new NonEmpty(1, new Empty, new Empty)

  def addToTree(list: List[Int], tree: IntNode = new Empty): IntNode = {
    if (list.isEmpty) tree
    else addToTree(list.tail, tree.incl(list.head))

  }
  val list = List(20, 4, 1, 3, 5, 2, 7, 0)
  val list2 = List(4, 1, 20, 5, 7, 2, 0, 3)
  println(addToTree(list))
  println(addToTree(list2))

}
