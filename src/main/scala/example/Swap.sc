sealed trait A
case object B extends A
case object C extends A
// Create a Pair such that a Pair has an A _AND_ B
final case class Pair(fst: A, snd: A)
// Use pattern matching to swap the order of the two As in Pair
// val swap: Pair => Pair = ???
val swap: Pair => Pair = _ match {
  case Pair(a, b) => Pair(b, a)
}
val orig = Pair(B, C)
val swapped = swap(orig)
println(s"orig: $orig, swapped: $swapped")
//orig: Pair(B,C), swapped: Pair(C,B)