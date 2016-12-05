
import org.scalatest.FunSuite

class GreatestCommonDivisorSolverTest extends FunSuite {

  private val solver = new GreatestCommonDivisorSolver()

  test("solve gcd for 1, 2") {
    assert(solver.solve(1, 2) === 1)
  }

  test("solve gcd for 2, 3") {
    assert(solver.solve(2, 3) === 1)
  }

  test("solve gcd for 0, 3") {
    assert(solver.solve(0, 3) === 3)
  }

  test("solve gcd for 2, 2") {
    assert(solver.solve(2, 2) === 2)
  }

  test("solve gcd for 2, 4") {
    assert(solver.solve(2, 4) === 2)
  }

  test("solve gcd for 6, 15") {
    assert(solver.solve(6, 15) === 3)
  }

}
