package example

case class Person(firstName:String, lastName:String)

/* Companion object like static util in Java */
object Person {
	def apply(name:String):Person = {
		val first = name.split(" ")(0)
		val last = name.split(" ")(1)
		apply(first, last)
	}
} 
