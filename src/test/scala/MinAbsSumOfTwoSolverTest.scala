import org.scalatest.FunSuite

class MinAbsSumOfTwoSolverTest extends FunSuite {

  private val solver = new MinAbsSumOfTwoSolver()

  test("solve for (7) should be |7 + 7| = 14") {
    assert(solver.solve(Array(7)) === 14)
  }

  test("solve for (-11) should be |-11 + (-11)| = 22") {
    assert(solver.solve(Array(-11)) === 22)
  }

  test("solve for (1, 2) should be |1 + 1| = 1") {
    assert(solver.solve(Array(1, 2)) === 2)
  }

  test("solve for (2, 1) should be |1 + 1| = 1") {
    assert(solver.solve(Array(1, 2)) === 2)
  }

  test("solve for (1, 4, -3) should be |4 - (-3)| = 1") {
    assert(solver.solve(Array(1, 4, -3)) === 1)
  }

  test("solve for (-4, 3) should be |4 - (-3)| = 1") {
    assert(solver.solve(Array(1, 4, -3)) === 1)
  }

  test("solve for (-4, -3) should be |-3 + (-3)| = 6") {
    assert(solver.solve(Array(-4, -3)) === 6)
  }

  test("solve for (0, 0) should be |0 + 0| = 0") {
    assert(solver.solve(Array(0, 0)) === 0)
  }

  test("solve for (0, 7) should be |0 + 0| = 0") {
    assert(solver.solve(Array(0, 7)) === 0)
  }

  test("solve for (-5, 0) should be |0 + 0| = 0") {
    assert(solver.solve(Array(5, 0)) === 0)
  }

  test("solve for (-5, 1, 5) should be |5 + (-5)| = 0") {
    assert(solver.solve(Array(-5, 1, 5)) === 0)
  }

  test("solve for (-5, 0, 11) should be |0 + 0| = 0") {
    assert(solver.solve(Array(-5, 0, 11)) === 0)
  }

  test("solve for (-5, -3, 5, 7) should be |-5 + 5| = 0") {
    assert(solver.solve(Array(-5, -3, 5, 7)) === 0)
  }

  test("solve for (-5, 0, 0, 11) should be |0 + 0| = 0") {
    assert(solver.solve(Array(-5, 0, 0, 11)) === 0)
  }

  test("solve for (-5, -2, 0, 7, 11) should be |0 + 0| = 0") {
    assert(solver.solve(Array(-5, -2, 0, 7, 11)) === 0)
  }

  test("solve for (-8, 4, 5, -10, 3) should be |(-8) + 3| = 3") {
    assert(solver.solve(Array(-8, 4, 5, -10, 3)) === 3)
  }

  test("solve for (-5, -2, 0, 0, 7, 11) should be |0 + 0| = 0") {
    assert(solver.solve(Array(-5, -2, 0, 0, 7, 11)) === 0)
  }

  test("solve for (1000000000) should be |1000000000 + 1000000000| = 2000000000") {
    assert(solver.solve(Array(1000000000, 1000000000)) === 2000000000)
  }


}