import scala.annotation._

sealed trait LinkedList[A] {
  
  def length: Int = 
    this match {
      case End() => 0
      case Pair(hd, tl) => 1 + tl.length
    }
}

final case class End[A]() extends LinkedList[A]
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
