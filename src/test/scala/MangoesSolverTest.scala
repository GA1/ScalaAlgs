import org.scalatest.FunSuite

class MangoesSolverTest extends FunSuite {

  val solver = new MangoesSolver()

  test("solve no1") {
    assert(solver.solve(200, Array(2, 5, 3, 2, 4), Array(30, 40, 10, 20, 30)) === 3)
  }

  test("solve no2") {
    assert(solver.solve(100, Array(3, 4), Array(1, 2)) === 2)
  }


}