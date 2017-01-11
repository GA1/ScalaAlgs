import org.scalatest.FunSuite

class UnfairnessSolverTest extends FunSuite {

  private val solver = new UnfairnessSolver()

  test("test for 10, 100, 300, 200, 1000, 20, 30 and K = 3") {
    assert(solver.solve(Array(10, 100, 300, 200, 1000, 20, 30), 3) === 20)
  }

  test("test for 1, 2, 3, 4, 10, 20, 30, 40, 100, 200 and K = 4") {
    assert(solver.solve(Array(1, 2, 3, 4, 10, 20, 30, 40, 100, 200), 4) === 3)
  }



}