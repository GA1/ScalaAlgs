
class GreatestCommonMultipleSolver {

  def solve(a: BigInt, b: BigInt): BigInt = a * b / greatestCommonDivisor(a, b)

  private def greatestCommonDivisor(a: BigInt, b: BigInt): BigInt = if (a == 0) b else greatestCommonDivisor(b % a, a)

}
