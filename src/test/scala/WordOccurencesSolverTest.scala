import org.scalatest.FunSuite

class WordOccurencesSolverTest extends FunSuite {

  private val solver = new WordOccurencesSolver()

  test("test a in aa") {
    assert(solver.solve("a", "aa") === 2)
  }


}