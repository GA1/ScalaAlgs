
import org.scalatest.FunSuite

class GreatestCommonMultipleSolverTest extends FunSuite {

  private val solver = new GreatestCommonMultipleSolver()

  test("solve gcm for 1, 1") {
    assert(solver.solve(1, 1) === 1)
  }

  test("solve gcm for 1, 2") {
    assert(solver.solve(1, 2) === 2)
  }

  test("solve gcm for 2, 2") {
    assert(solver.solve(2, 2) === 2)
  }

  test("solve gcm for 2, 4") {
    assert(solver.solve(2, 4) === 4)
  }

  test("solve gcm for 6, 9") {
    assert(solver.solve(6, 9) === 18)
  }
}
