import org.scalatest.FunSuite

class TurtlePathSolverTest extends FunSuite {

  val solver = new TurtlePathSolver()

  test("solve for 1") {
    assert(solver.solution(Array(1)) === -1)
  }

  test("solve for 1, 1") {
    assert(solver.solution(Array(1, 1)) === -1)
  }

  test("solve for 1, 1, 1") {
    assert(solver.solution(Array(1, 1, 1)) === -1)
  }

  test("solve for 1, 1, 1, 1") {
    assert(solver.solution(Array(1, 1, 1, 1)) === 4)
  }

  test("solve for 5, 4, 3, 2") {
    assert(solver.solution(Array(5, 4, 3, 2)) === -1)
  }

  test("solve for, 10, 10, 9, 1, 1000000") {
    assert(solver.solution(Array(10, 10, 9, 1, 1000000)) === 5)
  }

  test("solve for, 10, 10, 9, 1, 9") {
    assert(solver.solution(Array(10, 10, 9, 1, 9)) === 5)
  }

  test("solve for, 10, 10, 9, 8, 7, 8") {
    assert(solver.solution(Array(10, 10, 9, 8, 7, 8)) === 6)
  }

  test("solve for 1, 3, 2,  5, 4, 4, 1000, 3, 2") {
    assert(solver.solution(Array(1, 3, 2, 5, 4, 4, 1000, 3, 2)) === 7)
  }

}