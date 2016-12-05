import org.scalatest.FunSuite

class BunnyJumpSolverTest extends FunSuite {

  private val solver = new BunnyJumpSolver()

  test("solve for 1, 2") {
    assert(solver.solve(Array(1, 2)) === 2)
  }

  test("solve for 1, 2, 3") {
    assert(solver.solve(Array(1, 2, 3)) === 6)
  }

  test("solve for 1, 2, 3, 4") {
    assert(solver.solve(Array(1, 2, 3, 4)) === 12)
  }

  test("solve for 2, 2") {
    assert(solver.solve(Array(2, 2)) === 2)
  }

  test("solve for 157 151 149 139 137 131 127 113") {
    assert(solver.solve(Array(157, 151, 149, 139, 137, 131, 127, 113)) === BigInt("126459568506372769"))
  }

  test("solve for 2, 3, 4") {
    assert(solver.solve(Array(2, 3, 4)) === 12)
  }

}