import org.scalatest.FunSuite

class StartsWithSolverTest extends FunSuite {


  private val solver = new StartsWithSolver()

  test("startsWith for \"\", b") {
    assert(solver.solve("", "b") === false)
  }

  test("startsWith for b, b") {
    assert(solver.solve("b", "b") === true)
  }

  test("startsWith for A, b") {
    assert(solver.solve("A", "b") === false)
  }

  test("startsWith for Ab, b") {
    assert(solver.solve("Ab", "A") === true)
  }

  test("startsWith for Ab, b, A") {
    assert(solver.solve("Ab", "b", "A") === true)
  }

  test("startsWith for \"\", \"\"") {
    assert(solver.solve("", "") === true)
  }

  test("startsWith for c, \"\"") {
    assert(solver.solve("c", "") === true)
  }


}
