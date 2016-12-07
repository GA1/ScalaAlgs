import org.scalatest.FunSuite

class StringSubtractorSolverTest extends FunSuite {

  val solver = new StringSubtractorSolver()

  test("'a' - ''") {
    assert(solver.solve("a", "") === "a")
  }

  test("'a' - 'a'") {
    assert(solver.solve("a", "a") === "")
  }

  test("'ab' - 'a'") {
    assert(solver.solve("ab", "a") === "b")
  }

  test("'abcd' - 'ac'") {
    assert(solver.solve("abcd", "ac") === "bd")
  }


}