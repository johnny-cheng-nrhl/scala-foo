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


trait Result[J] {
  def fold[K](isFailed: K, f: J => K): K = 
    _ match {
      case End => Success 
      case Pair(hd, tl) =>  
        fold(true, hd.toString :: tl)
    }
    
}

case class Success[J](result: J) extends Result[J]
case class Failure[J]() extends Result[J]

