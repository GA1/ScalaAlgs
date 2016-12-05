
class DoublePermutationSolver {

  def solve(permutation: List[Int]): List[Int] = {
    val N = permutation.length
    val doublePerm = new Array[Int](N)
    permutation zip (1 to N) foreach (x => doublePerm(x._2 - 1) = permutation(permutation(x._2 - 1) - 1))
    return doublePerm.toList
  }

}
