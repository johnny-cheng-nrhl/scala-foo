package example

sealed trait Shape {
  def sides: Double
  def perimeter: Double
  def area: Double
}

object Draw {
  def apply(shape:Shape):String = 
    shape match {
      case Circle(radius) => s"A circle of radius ${radius}cm"
      case Rectangle(width, height) => s"A rectangle of width {width} cm and height {height} cm"
      case Square(size) => s"A square of size ${size}cm"
    }
}

case class Circle(radius:Double) extends Shape {
  val sides = 0

  val perimeter = 2 * math.Pi * radius

  val area:Double = math.Pi * radius * radius
}

sealed trait Rectangular extends Shape {
  def width: Double
  def height: Double
  val sides = 4
  override val perimeter = 2 * (width + height)
  override val area = width * height
}

case class Rectangle(val width:Double, val height:Double) extends Rectangular 

case class Square(size:Double) extends Rectangular {
  val width = size 
  val height = size 
}

