import org.scalatest.FunSuite

class DoublePermutationSolverTest extends FunSuite {

  private val solver = new DoublePermutationSolver()

  test("solve double permutation for 1->1") {
    assert(solver.solve(List(1)) === List(1))
  }

  test("solve double permutation for 1->1, 2->2") {
    assert(solver.solve(List(1, 2)) === List(1, 2))
  }

  test("solve double permutation for 1->2, 2->1") {
    assert(solver.solve(List(2, 1)) === List(1, 2))
  }

  test("solve double permutation for 1->2, 2->3, 3->1") {
    assert(solver.solve(List(2, 3, 1)) === List(3, 1, 2))
  }

  test("solve double permutation for 1->3, 2->4, 3->1, 4->2") {
    assert(solver.solve(List(3, 4, 1, 2)) === List(1, 2, 3, 4))
  }

}
