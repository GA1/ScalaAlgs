
class BunnyJumpSolver {

  def solve(jumps: Array[BigInt]): BigInt = {
    return jumps.foldLeft(BigInt("1"))(leastCommonMultiple(_, _))
  }

  private def greatestCommonDivisor(a: BigInt, b: BigInt): BigInt = {
    if (a == 0) b else greatestCommonDivisor(b % a, a)
  }

  private def leastCommonMultiple(a: BigInt, b: BigInt): BigInt = {
    a * b / greatestCommonDivisor(a, b)
  }

}

object BunnyJumpSolver {

  def main(args: Array[String]) {
    val lines = for (line <- io.Source.stdin.getLines) yield (line)
    val solver = new BunnyJumpSolver()
    val jumpsInStrings = lines.toList(1)
    print(solver.solve(jumpsInStrings.split(" ") map (BigInt(_))))
  }

}
