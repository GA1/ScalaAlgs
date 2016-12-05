
class SecurityInvolutionSolver {

  def solve(function: List[Int]): Boolean = {
    function == inverse(function)
  }

  private def inverse(function: List[Int]): List[Int] = {
    val N = function.length
    val inversed = new Array[Int](N)
    (function zip (1 to N)) foreach (x => inversed(x._1 - 1) = x._2)
    inversed.toList
  }

}
