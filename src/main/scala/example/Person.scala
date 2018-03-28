package example

class Person(val firstName:String, val lastName:String)

/* Companion object like static util in Java */
object Person {
	def apply(name:String) = {
		val first = name.split(" ")(0)
		val last = name.split(" ")(1)
		new Person(first, last)
	}
} 
