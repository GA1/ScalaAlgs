
class MinAbsSumOfTwoSolver {

  def solve(nums: Array[Int]): Int = {
    solve(nums.sorted, 0, nums.length - 1, Integer.MAX_VALUE)
  }

  private def solve(sorted: Array[Int], left: Int, right:Int, oldMinAbs: Int): Int = {
    if (left > right) oldMinAbs
    else {
      val sl = sorted(left)
      val sr = sorted(right)
      val tempMinAbs = Math.abs(sl + sr)
      val newMinAbs = if (tempMinAbs < oldMinAbs) tempMinAbs else oldMinAbs
      (sl, sr) match {
        case (sl, sr) if (sl < 0 && sr < 0) => solve(sorted, left + 1, right, newMinAbs)
        case (sl, sr) if (sl >= 0 && sr >= 0) => solve(sorted, left, right - 1, newMinAbs)
        case (sl, sr) if (sl < 0 && sr >= 0 && Math.abs(sl) > Math.abs(sr)) => solve(sorted, left + 1, right, newMinAbs)
        case (sl, sr) if (sl < 0 && sr >= 0) => solve(sorted, left, right - 1, newMinAbs)
      }
    }
  }

}
