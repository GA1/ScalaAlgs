
class TieRopesSolver {

  def solve(K: Int, A: Array[Int]): Int = {
    (0 until A.length).foldLeft((0, 0))
    {(acc, i) => if (acc._2 + A(i) >= K) (acc._1 + 1, 0) else (acc._1, acc._2 + A(i))}._1
  }

}