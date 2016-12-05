import org.scalatest.FunSuite

class SavePrincessTest extends FunSuite {

  private val solver = new SavePrincessSolver()

  test("solve for mp") {
    val result = solver.solve(Array("mp"))
    assert(result.length === 1)
    assert(result.filter(_ == "RIGHT").length == 1)
  }

  test("solve for pm") {
    val result = solver.solve(Array("pm"))
    assert(result.length === 1)
    assert(result.filter(_ == "LEFT").length == 1)
  }

  test("solve for p m") {
    val result = solver.solve(Array("p","m"))
    assert(result.length === 1)
    assert(result.filter(_ == "UP").length == 1)
  }

  test("solve for m p") {
    val result = solver.solve(Array("m", "p"))
    assert(result.length === 1)
    assert(result.filter(_ == "DOWN").length == 1)
  }

}