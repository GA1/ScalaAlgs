
class MaxCounterSolver {

  def solve(n: Int, A: Array[Int]): Array[Int] = {
    val result = new Array[Int](n)
    A map (a => if (a < n) increase(a, result) else maxCounter(A) )
    result
  }

  private def maxCounter(A: Array[Int]) {
    val max = A.max
    (0 until A.length) foreach (i => A(i) = max)
  }

  private def increase(which: Int, A: Array[Int]) = A(which) = A(which) + 1
}