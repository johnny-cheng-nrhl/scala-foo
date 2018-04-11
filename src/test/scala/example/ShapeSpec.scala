package example

import org.scalatest._

class ShapeSpec extends FlatSpec with Matchers {

  "Draw shape of circle" should "print circlei and its radius"in {
      Draw(Circle(10)) should (include("circle") and include ("10.0cm")) 
  }

}
