package example

import org.scalatest._

class PersonSpec extends FlatSpec with Matchers {

	"Name with space between" should "apply as first and last name" in {
		val name = "John Smith"
		Person(name).firstName shouldEqual "John"
		Person(name).lastName shouldEqual "Smith"
	}

	/*	
	"Name three name" should "apply as first, middle and last name" in {
		(pending)
		val name = "John Smith"
		Person(name).firstName should eq "John"
		Person(name).lastName should eq "Smith"
	}
	*/
}
