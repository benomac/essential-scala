sealed trait Calculation

final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation

object Calculator {
  def +(calculation: Calculation, i: Int): Calculation = calculation match {
    case Success(result) => Success(result + i)
    case Failure(reason) => Failure(reason)
  }
  def -(calculation: Calculation, i: Int): Calculation = calculation match {
    case Success(result) => Success(result - i)
    case Failure(reason) => Failure(reason)
  }
  def /(calculation: Calculation, i: Int): Calculation = (calculation, i) match {
    case (_: Success, 0) => Failure("Division by zero ERROR!")
    case (success: Success, i) => Success(success.result / i)
    case (failure: Failure, _) => Failure(failure.reason)
  }

  def *(calculation: Calculation, i: Int): Calculation = calculation match {
    case Success(result) => Success(result * i)
    case Failure(reason) => Failure(reason)
  }

  def exDiv(calculation: Calculation, i: Int): Calculation = calculation match {
    case Success(result) => i match {
      case 0 => Failure("Zero mofo!")
      case _ => Success(result / i)
    }
    case Failure(reason) => Failure(reason)
  }
}
Calculator.+(Success(1), 1)
Calculator.-(Success(1), 1)
Calculator.+(Failure("Badness"), 1)

Calculator./(Success(4), 2)
Calculator./(Success(4), 0)
Calculator./(Failure("Badness"), 0)

Calculator.exDiv(Success(4), 2)
Calculator.exDiv(Success(4), 0)
Calculator.exDiv(Failure("Badness"), 0)
Calculator.*(Success(10), 10)