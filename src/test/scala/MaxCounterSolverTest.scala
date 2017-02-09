import org.scalatest.FunSuite

class MaxCounterSolverTest extends FunSuite {

  private val solver = new MaxCounterSolver()

  test("solve for n = 1 and Array(0)") {
    assert(solver.solve(1, Array(0)) === Array(1))
  }

  test("solve for n = 1 and Array(5)") {
    assert(solver.solve(1, Array(5)) === Array(0))
  }

  test("solve for n = 3 and Array(0) ") {
    assert(solver.solve(3, Array(0)) === Array(1, 0, 0))
  }

  test("solve for n = 3 and Array(2, 2, 2)") {
    assert(solver.solve(3, Array(2, 2, 2, 2)) === Array(0, 0, 4))
  }
  
  test("solve for n = 5 and Array(3, 4, 4, 6, 1, 4, 4)") {
    assert(solver.solve(5, Array(3, 4, 4, 6, 1, 4, 4)) === Array(3, 2, 2, 4, 2))
  }

}