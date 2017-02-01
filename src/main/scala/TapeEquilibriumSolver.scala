
class TapeEquilibriumSolver {

  def solve(a: Array[Int]): Int = {

    val accLeftSums: Array[Int] = a.scanLeft(0)(_ + _)
    val accRightSums: Array[Int] = a.scanRight(0)(_ + _)

    (0 to a.length).foldLeft(Int.MaxValue)((min, i) => {
      val diff = Math.abs(accLeftSums(i) - accRightSums(i))
      if (diff < min) diff else min
    })
  }

}
