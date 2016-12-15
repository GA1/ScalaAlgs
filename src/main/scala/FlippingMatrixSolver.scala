
class FlippingMatrixSolver {

  def solve(m: Array[Array[Int]], n: Int) = {
    var sum = 0
    val bound = 2*n - 1
    for (i <- 0 until n)
      for (j <- 0 until n)
        sum += List(m(i)(j), m(i)(bound - j), m(bound - i)(j), m(bound - i)(bound - j)).max
    sum
  }

}