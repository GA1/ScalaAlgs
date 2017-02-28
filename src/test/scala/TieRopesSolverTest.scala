import org.scalatest.FunSuite

class TieRopesSolverTest extends FunSuite {

  val solver = new TieRopesSolver()

  test("Solve Tie Ropes for 7, (6)") {
    assert(solver.solve(7, Array(6)) === 0)
  }

  test("Solve Tie Ropes for 11, (17)") {
    assert(solver.solve(11, Array(17)) === 1)
  }

  test("Solve Tie Ropes for 11, (6, 6)") {
    assert(solver.solve(11, Array(6, 6)) === 1)
  }

  test("Solve Tie Ropes for 11, (11, 10)") {
    assert(solver.solve(11, Array(11, 10)) === 1)
  }

  test("Solve Tie Ropes for 11, (11, 11)") {
    assert(solver.solve(11, Array(11, 11)) === 2)
  }



  test("Solve Tie Ropes for 4, (1, 2, 3, 4, 1, 1, 3)") {
    assert(solver.solve(4, Array(1, 2, 3, 4, 1, 1, 3)) === 3)
  }

}