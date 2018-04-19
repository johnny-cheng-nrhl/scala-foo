package example

import org.scalatest._

class IntListSpec extends FlatSpec with Matchers {

  def fixture = 
    new {
      val dVal:IntList = End
      val cVal:IntList = Pair(3, dVal)
      val bVal:IntList = Pair(2, cVal)
      val aVal:IntList = Pair(1, bVal)
    }

  "sum" should "calculate the total of the list" in {
    val f = fixture
    IntList.sum(f.aVal) should be(6)  
  }
/*
  "sum" should "calculate the tail of the list" in {
    IntList.sum(aVal.tail) should be(5)
  }
*/
  "sum" should "calculate the end of the list" in {
    val f = fixture
    IntList.sum(f.dVal) should be(0)
  }
  
  "length" should "return number of elements" in {
    val f = fixture
    f.aVal.length should be (3)
  }

}
