//wrong class NonEmpty(elem: Int, left: IntNode, right: IntNode) extends IntNode {
class NonEmpty(elem: Int, left: IntNode, right: IntNode) extends IntNode {
  def incl(x: Int): IntNode =
    if (x < elem)
      new NonEmpty(elem, left incl x, right)
    else if (x > elem)
      new NonEmpty(elem, left, right incl x)
    else
      this

  def contains(x: Int): Boolean =
    if (x < elem)
      left.contains(x)
    else if (x > elem)
      right.contains(x)
    else
      true

  override def toString: String = " { " + elem + right + " } "
}
//right

class NonEmpty(elem: Int, left: IntNode, right: IntNode) extends IntNode {

  def incl(x: Int): IntNode =
    if (x < elem)
      new NonEmpty(elem, left incl x, right)
    else if (x > elem)
      new NonEmpty(elem, left, right incl x)
    else
      this

  def contains(x: Int): Boolean =
    if (x < elem)
      left contains x
    else if (x > elem)
      right contains x
    else
      true

  override def toString: String = " { " + elem + right + " } "
}
