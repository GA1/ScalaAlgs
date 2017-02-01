
class TapeEquilibriumSolver {

  def solve1(a: Array[Int]): Int = {

    val accLeftSums: Array[Int] = a.scanLeft(0)(_ + _)
    val accRightSums: Array[Int] = a.scanRight(0)(_ + _)

    (1 until a.length).foldLeft(Int.MaxValue)((min, i) => {
      val diff = Math.abs(accLeftSums(i) - accRightSums(i))
      if (diff < min) diff else min
    })
  }

  def solve2(a: Array[Int]): Int = {

    val total = a.sum
    a.drop(1).foldLeft(Int.MaxValue, a(0))((acc, curr) => {
      val newDiff = Math.abs(acc._2 - (total - acc._2))
      (Math.min(acc._1,  newDiff), acc._2 + curr)
    })._1

  }


}
