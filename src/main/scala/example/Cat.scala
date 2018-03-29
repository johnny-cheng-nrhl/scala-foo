package example

case class Cat(name: String, color: String, food: String) extends Greeting {
    def greet() = greeting + " " + name
}
