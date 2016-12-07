import scala.math.BigInt

class FactorialSolver {

  def solve(N: BigInt): BigInt = {
    def solve(acc: BigInt, n: BigInt): BigInt = {
      n match {
        case b: BigInt if b == BigInt(0) => acc
        case b => solve(acc * b, b - 1)
      }
    }
    solve(1, N)
  }
}
