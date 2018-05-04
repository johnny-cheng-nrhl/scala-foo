trait A
case class B() extends A
case class C() extends A

case class Pair(b: A, c: A)

def swap(x: Pair): Pair =  
  x match {
    case None => None
    case Pair(m:A, n:A) => Pair(n, m)
  }
