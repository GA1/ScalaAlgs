import org.scalatest.FunSuite

class StringsTransposeSolverTest extends FunSuite {

  val solver = new StringsTransposeSolver()

  test("transpose of a") {
    assert(solver.solve(Array("a")) === Array("a"))
  }

  test("transpose of ab") {
    assert(solver.solve(Array("ab")) === Array("a", "b"))
  }

  test("transpose of aa b") {
    assert(solver.solve(Array("aa", "b")) === Array("ab", "a"))
  }

  test("transpose of aa bb") {
    assert(solver.solve(Array("aa", "bb")) === Array("ab", "ab"))
  }

  test("transpose of aaa bb c") {
    assert(solver.solve(Array("aaa", "bb", "c")) === Array("abc", "ab", "a"))
  }


}