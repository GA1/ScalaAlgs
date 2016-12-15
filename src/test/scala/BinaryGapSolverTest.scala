import org.scalatest.FunSuite

class BinaryGapSolverTest extends FunSuite {

  test("binaryGap of 1") {
    val bg = new BinaryGapSolver()
    assert(bg.solve(1) === 0)
  }

  test("binaryGap of 2") {
    val bg = new BinaryGapSolver()
    assert(bg.solve(2) === 0)
  }

  test("binaryGap of 3") {
    val bg = new BinaryGapSolver()
    assert(bg.solve(3) === 0)
  }

  test("binaryGap of 4") {
    val bg = new BinaryGapSolver()
    assert(bg.solve(4) === 0)
  }

  test("binaryGap of 5") {
    val bg = new BinaryGapSolver()
    assert(bg.solve(5) === 1)
  }

  test("binaryGap of 529") {
    val bg = new BinaryGapSolver()
    assert(bg.solve(529) === 4)
  }

  test("binaryGap of 1041") {
    val bg = new BinaryGapSolver()
    assert(bg.solve(1041) === 5)
  }

}