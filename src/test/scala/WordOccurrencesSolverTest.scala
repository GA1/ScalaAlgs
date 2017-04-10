import org.scalatest.FunSuite

class WordOccurrencesSolverTest extends FunSuite {

  private val solver = new WordOccurrencesSolver()

  test("solve for a in a") {
    assert(solver.solve("a", "a") === 1)
  }

  test("solve for b in a") {
    assert(solver.solve("b", "a") === 0)
  }

  test("solve for a in aa") {
    assert(solver.solve("a", "aa") === 2)
  }

  test("solve for b in ab") {
    assert(solver.solve("b", "ab") === 1)
  }

  test("solve for ab in ab") {
    assert(solver.solve("ab", "ab") === 1)
  }

  test("solve for ab in abab") {
    assert(solver.solve("ab", "abab") === 2)
  }

  test("solve for aa in aaa") {
    assert(solver.solve("aa", "aaa") === 2)
  }
}