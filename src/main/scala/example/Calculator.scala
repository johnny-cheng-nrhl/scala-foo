package example

sealed trait Expression {
  def eval: Double = 
    this match {
      case Addition(l, r) => l.eval + r.eval
      case Subtraction(l, r) => l.eval - r.eval
      case Division(l, r) => l.eval / r.eval
      case SquareRoot(l, r) => l.eval ^ r.eval
      case Number(v) => v
    }
} 

final case class Addition(left: Expression, right:Expression) extends Expression

final case class Subtraction(left: Expression, right:Expression) extends Expression

final case class Division(left: Expression, right: Expression) extends Expression

final case class SquareRoot(left: Expression, right: Expression) extends Expression

final case class Number(value: Double) extends Expression


sealed trait Calculation

final case class Success(result: Double) extends Calculation
final case class Failure(result: String) extends Calculation
