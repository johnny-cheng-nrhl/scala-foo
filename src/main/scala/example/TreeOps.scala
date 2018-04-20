package example

sealed trait Tree
final case class Node(l: Tree, r: Tree) extends Tree
final case class Leaf(x: Int) extends Tree
final object Empty extends Tree

object TreeOps {
  def sum(tree: Tree): Int =
    tree match {
      case Leaf(elt) => elt
      case Node(l, r) => sum(l) + sum(r)
    }

  def double(tree: Tree): Tree =
    tree match {
      case Leaf(elt) => Leaf(elt * 2)
      case Node(l, r) => Node(double(l), double(r))
    }
}


