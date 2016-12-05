
class InverseFunctionSolver {
  def solve(s: String) = ???


  def solve(function: List[Int]): List[Int] = {
    val N = function.length
    val inversed = new Array[Int](N)
    (function zip (1 to N)) foreach (x => inversed(x._1 - 1) = x._2)
    inversed.toList
  }

}
