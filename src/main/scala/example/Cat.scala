package example

trait Feline {
  def colour: String
  def sound: String
}

trait BigCat extends Feline {
  def food: String
}

case class Lion(colour: String, food: String, maneSize: Int) extends BigCat{
  val sound = "roar"
}

case class Tiger(colour: String, food: String, maneSize: Int) extends BigCat{
  val sound = "roar"
}

case class Cat(name:String, colour: String, food: String) extends BigCat {
  val sound = "meow"
}
