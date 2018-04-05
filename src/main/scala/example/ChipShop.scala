package example

object ChipShop {
    def willServe(c: Cat): Boolean = {
      c match {
        case Cat(_, _, "Chips") => true
        case Cat(_,_,_) => false
      }
    }
}
