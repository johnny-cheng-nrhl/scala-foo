package example

import org.scalatest._

class TreeOpsSpec extends FlatSpec with Matchers {

  def fixture = 
    new {
      val e:Tree = Leaf(3)
      val d:Tree = Leaf(5)
      val c:Tree = Leaf(4)
      val b:Tree = Node(d, c)
      val root:Tree = Node(b,e)
      
    }

  "sum" should "calculate the total of tree" in {
    val f = fixture
    TreeOps.sum(f.root) should be(11)
  }
}
