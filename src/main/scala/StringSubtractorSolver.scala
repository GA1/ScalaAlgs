
class StringSubtractorSolver {

  def solve(minuend: String, subtrahend: String): String = {
    require(minuend.length == minuend.toList.toSet.size)
    require(subtrahend.toSet subsetOf minuend.toSet)
    val forbidden = subtrahend.toSet
    minuend.foldLeft(StringBuilder.newBuilder)((acc, x) => if(!forbidden.contains(x)) acc + x else acc).toString()
  }
}
