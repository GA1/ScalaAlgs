
class FlippingMatrixSolver {

  def solve(m: Array[Array[Int]], n: Int): Int = {
    val bound = 2*n - 1
    (for (
      i <- 0 until n;
      j <- 0 until n
    ) yield List(m(i)(j), m(i)(bound - j), m(bound - i)(j), m(bound - i)(bound - j)).max
    ).sum
  }

}