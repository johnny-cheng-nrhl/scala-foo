// Fold.sc
sealed trait Result[J] {
  def map[K](f: J => K): Result[K] = this match {
    case Failure() => Failure()
    case Success(j) => Success(f(j)) // Result[K]
  }
  
  def flatMap[K](f:J => Result[K]): Result[K] = 
    this match {
      case Failure() => Failure()
      case Success(j) => f(j) 
    }

  def fold[K](default: K, f: J => K): K = this match {
    case Failure() => default // K
    case Success(j) => f(j)   // K
  }
}
final case class Success[J](j: J) extends Result[J]
final case class Failure[J]() extends Result[J]
