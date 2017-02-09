import org.scalatest.FunSuite


class TapeEquilibriumSolverTest extends FunSuite {

  private val solver = new TapeEquilibriumSolver()

  test("solve for 1, 2") {
    assert(solver.solve1(Array(1, 2)) === 1)
    assert(solver.solve2(Array(1, 2)) === 1)
  }

  test("solve for 1, 1") {
    assert(solver.solve1(Array(1, 1)) === 0)
    assert(solver.solve2(Array(1, 1)) === 0)
  }

  test("solve for 1, -1") {
    assert(solver.solve1(Array(1, -1)) === 2)
    assert(solver.solve2(Array(1, -1)) === 2)
  }

  test("solve for 1, 1, 2") {
    assert(solver.solve1(Array(1, 1, 2)) === 0)
    assert(solver.solve2(Array(1, 1, 2)) === 0)
  }

  test("solve for 1, 2, 3, 6") {
    assert(solver.solve1(Array(1, 2, 3, 6)) === 0)
    assert(solver.solve2(Array(1, 2, 3, 6)) === 0)
  }

  test("solve for 3, 1, 2, 4, 3") {
    assert(solver.solve1(Array(3, 1, 2, 4, 3)) === 1)
    assert(solver.solve2(Array(3, 1, 2, 4, 3)) === 1)
  }

}