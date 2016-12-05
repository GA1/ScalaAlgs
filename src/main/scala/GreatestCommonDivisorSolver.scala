

class GreatestCommonDivisorSolver {

  def solve(a: BigInt, b: BigInt): BigInt = if (a == 0) b else solve(b % a, a)

}
