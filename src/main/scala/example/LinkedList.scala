package example

import scala.annotation._

sealed trait LinkedList[A] {
  
  def length: Int = 
    this match {
      case End() => 0
      case Pair(hd, tl) => 1 + tl.length
    }

  def product: Int = 
    this match {
      case End() => 0
      case Pair(hd, tl) => hd * tl.product
    }
  
  def double: LinkedList[A] =
    this match {
      case End() => End[A]
      case Pair(hd, tl) => Pair[A](hd * 2, tl.double)
    }
}

final case class End[A]() extends LinkedList[A]
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

object LinkedList {
	@tailrec
	def sum(list: LinkedList[_], total: Int = 0): Int =
	  list match {
	    case End() => total
	    case Pair(hd, tl) => sum(tl, total + hd)
	  }
}
