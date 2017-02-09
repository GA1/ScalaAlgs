
class MaxCounterSolver {

  //TODO improve performance O(N^2) -> (N)
  def solve(n: Int, A: Array[Int]): Array[Int] = {
    val res = new Array[Int](n)
    A foreach (a => if (a <= n) increase(a, res) else if (a == n + 1) maxCounter(res))
    res
  }

  private def maxCounter(res: Array[Int]) {
    val max = res.max
    (0 until res.length) foreach (i => res(i) = max)
  }

  private def increase(which: Int, A: Array[Int]) = A(which - 1) = A(which - 1) + 1

}