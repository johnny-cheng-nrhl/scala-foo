package example

import scala.annotation._

sealed trait IntList {
  
  def length: Int = 
    this match {
      case IntEnd => 0
      case IntPair(hd, tl) => 1 + tl.length
    }

  def product: Int = 
    this match {
      case IntEnd => 0
      case IntPair(hd, tl) => hd * tl.product
    }
}
case object IntEnd extends IntList
final case class IntPair(head: Int, tail: IntList) extends IntList

object IntList {
	@tailrec
	def sum(list: IntList, total: Int = 0): Int =
	  list match {
	    case IntEnd => total
	    case IntPair(hd, tl) => sum(tl, total + hd)
	  }
}
