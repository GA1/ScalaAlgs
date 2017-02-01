import org.scalatest.FunSuite


class TapeEquilibriumSolverTest extends FunSuite {

  private val solver = new TapeEquilibriumSolver()

  test("solve for 1, 2") {
    assert(solver.solve(Array(1, 2)) === 1)
  }

  test("solve for 1, 1, 2") {
    assert(solver.solve(Array(1, 1, 2)) === 0)
  }


}