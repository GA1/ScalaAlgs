
class CountTrianglesSolver {


  def solve(sides: Array[Int]): Int = {
    val N: Int = sides.length
    (for {
      p <- 0 until N
      q <- 0 until N
      r <- 0 until N
      if (p < q && q < r && canBeTriangle(sides(p), sides(q), sides(r)))
    } yield 1).length
  }

  private def canBeTriangle(a: Int, b: Int, c: Int): Boolean = a + b > c && a + c > b && b + c > a

}
