package example

import scala.annotation._

sealed trait IntList {
  
  def length: Int = 
    this match {
      case End => 0
      case Pair(hd, tl) => 1 + tl.length
    }

  def product: Int = 
    this match {
      case End => 0
      case Pair(hd, tl) => hd * tl.product
    }
}
case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

object IntList {
	@tailrec
	def sum(list: IntList, total: Int = 0): Int =
	  list match {
	    case End => total
	    case Pair(hd, tl) => sum(tl, total + hd)
	  }
}
