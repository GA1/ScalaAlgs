
object CaptainPrimeSolver {

  private val PrimalitySolver = new PrimalitySolver()

  abstract class PersonFate
  case object CENTRAL extends PersonFate
  case object LEFT extends PersonFate
  case object RIGHT extends PersonFate
  case object DEAD extends PersonFate

  def isPrime(n: Int): Boolean = PrimalitySolver.solve(n)

  def containsZero(n: Int): Boolean = !n.toString.toList.find(_ == '0').isEmpty

  def getNumbersFromRight(number: Int): List[Int] = {
    val numInString = number.toString
    val length = numInString.length
    (1 until length).foldLeft(List[Int]())((acc, i) => numInString.substring(0, length - i).toInt :: acc)
  }

  def getNumbersFromLeft(n: Int): List[Int] = {
    val numInString = n.toString
    val length = numInString.length
    (1 until length).foldLeft(List[Int]())((acc, i) => numInString.substring(i).toInt :: acc)
  }

}

class CaptainPrimeSolver {
  import CaptainPrimeSolver._

  def solve(n: Int): PersonFate = {
    if (!isPrime(n) || containsZero(n)) DEAD
    else {
      (getNumbersFromLeft(n).forall(isPrime(_)), getNumbersFromRight(n).forall(isPrime(_))) match {
        case (true, true) => CENTRAL
        case (true, false) => LEFT
        case (false, true) => RIGHT
        case _ => DEAD
      }
    }
  }
}
