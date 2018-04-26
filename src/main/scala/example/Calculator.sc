sealed trait Expression {
  def eval: Double = 
    this match {
      case Addition(l, r) => 
        l.eval match {
          case Failure(reason) => Failure(reason)
          case Success(r1) =>
            r.eval match {
              case Failure(reason) => Failure(reason)
              case Success(r2) => Success(r1 + r2) 
            }
        }
      case Subtraction(l, r) => l.eval - r.eval
      case Division(l, r) => l.eval / r.eval
      case SquareRoot(v) => v.eval * v.eval
      case Number(v) => v
    }
} 

final case class Addition(left: Expression, right:Expression) extends Expression

final case class Subtraction(left: Expression, right:Expression) extends Expression

final case class Division(left: Expression, right: Expression) extends Expression

final case class SquareRoot(value: Expression) extends Expression

final case class Number(value: Double) extends Expression

sealed trait Calculation

final case class Success(result: Double) extends Calculation
final case class Failure(result: String) extends Calculation
