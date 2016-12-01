import org.scalatest.FunSuite

class TurtlePathSolverTest extends FunSuite {

  val solver = new TurtlePathSolver()

  test("solve for 5, 4, 3, 100") {
    assert(solver.solution(Array(5, 4, 3, 100)) === 4)
  }

//  test("solve for 5, 4, 3, 2") {
//    assert(solver.solution(Array(5, 4, 3, 2)) === -1)
//  }

//  test("solve for 1, 3, 2,  5, 4, 4, 6, 3, 2") {
//    assert(solver.solution(Array(1, 3, 2,  5, 4, 4, 6, 3, 2)) === 7)
//  }

}