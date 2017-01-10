
class StringsTransposeSolver {

  def solve(rows: Array[String]): Array[String] = {
    require(rows.length > 0)
    val R = rows(0).size
    val transposed = Array.fill(R)(StringBuilder.newBuilder)
    for {
      i <- 0 until rows.size
      j <- 0 until rows(i).length
    } transposed(j).append(rows(i).charAt(j))
    transposed map (_.toString())
  }

}
