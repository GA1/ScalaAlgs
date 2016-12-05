
import org.scalatest.FunSuite

class InverseFunctionSolverTest extends FunSuite {

  private val solver = new InverseFunctionSolver()

  test("solve inverse function for 1->1") {
    assert(solver.solve(List(1)) === List(1))
  }

  test("solve inverse function for 1->1, 2->2") {
    assert(solver.solve(List(1, 2)) === List(1, 2))
  }

  test("solve inverse function for 1->2, 2->1") {
    assert(solver.solve(List(2, 1)) === List(2, 1))
  }

  test("solve inverse function for 1->2, 2->3, 3->1") {
    assert(solver.solve(List(2, 3, 1)) === List(3, 1, 2))
  }

  test("solve inverse function for 1->3, 2->4, 3->1, 4->2") {
    assert(solver.solve(List(3, 4, 1, 2)) === List(3, 4, 1, 2))
  }

  test("inverse of inverse should be identity") {
    assert(solver.solve(solver.solve(List(3, 2, 7, 8, 9, 5, 4, 1, 6))) === List(3, 2, 7, 8, 9, 5, 4, 1, 6))
  }

}
