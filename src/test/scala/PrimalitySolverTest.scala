import org.scalatest.FunSuite


class PrimalitySolverTest extends FunSuite {

  val sovler = new PrimalitySolver()

  test("solve for 1 ") {
    assert(sovler.solve(1) === false)
  }

  test("solve for 2") {
    assert(sovler.solve(2) === true)
  }

  test("solve for 3") {
    assert(sovler.solve(3) === true)
  }

  test("solve for 4") {
    assert(sovler.solve(2*2) === false)
  }

  test("solve for 5") {
    assert(sovler.solve(5) === true)
  }

  test("solve for 6") {
    assert(sovler.solve(2*3) === false)
  }

  test("solve for 13") {
    assert(sovler.solve(13) === true)
  }

  test("solve for 31*39") {
    assert(sovler.solve(31*39) === false)
  }

  test("solve for 961,748,941") {
    assert(sovler.solve(961748941) === true)
  }

}
