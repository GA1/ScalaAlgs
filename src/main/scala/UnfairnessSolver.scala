
class UnfairnessSolver {

  def solve(nums: Array[Int], K: Int) = {
    val N = nums.length
    val sorted = nums.sorted
    (0 until N - K + 1).foldLeft(Integer.MAX_VALUE)((acc, i) => Math.min(acc, sorted(i + K - 1) - sorted(i)))
  }

}
