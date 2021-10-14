

sealed trait Colour {
  def red: Double
  def green: Double
  def blue: Double
  def isLight = (red + green + blue) / 3.0 > 0.5
  def isDark = !isLight
}

case object Red extends Colour {
  override def red = 1.0
  override def green = 0.0
  override def blue = 0.0
}

case object Green extends Colour {
  override def red = 0.0
  override def green = 1.0
  override def blue = 0.0
}

case object Blue extends Colour {
  override def red = 0.0
  override def green = 0.0
  override def blue = 1.0
}

case class CustomColour(red: Double, green: Double, blue: Double) extends Colour

sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
  def colour: Colour
}

final case class Circle(radius: Double, colour: Colour) extends Shape {
  override val sides = 1
  override val perimeter = 2 * math.Pi * radius
  override val area = math.Pi * radius * radius
}


sealed trait Rectangular extends Shape {
  def width: Double
  def height: Double
  val sides = 4
  override val perimeter = 2 * width + 2 * height
  override val area = width * height
}

case class Square(size: Double, colour: Colour) extends Rectangular {
  override val width = size
  override val height = size
}
case class Rectangle(
                      override val width: Double,
                      override val height: Double,
                      override val colour: Colour
                    ) extends Rectangular




object Draw {
  def apply(color: Colour): String = color match {
    // We deal with each of the predefined Colors with special cases: case Red => "red"
    case Red => "yellow"
    case Green => "pink"
    case Blue => "Blue"
    case color => if(color.isLight) "light" else "dark"
  }

  def apply(shape: Shape): String = shape match {
    case Circle(radius, colour) =>
      s"A ${Draw(colour)} circle of radius ${radius}cm"
    case Square(size, colour) =>
      s"A ${Draw(colour)} square of size ${size}cm"
    case Rectangle(width, height, colour) =>
      s"A ${Draw(colour)} rectangle of width ${width}cm and height ${
        height}cm"
  }



}
val d = Square(4, Green)
val e = Rectangle(3, 4, CustomColour(0.3, 1.0, 0.0))
Draw(Square(4, Green))