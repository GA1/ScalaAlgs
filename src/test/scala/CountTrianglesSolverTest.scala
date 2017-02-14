import org.scalatest.FunSuite


class CountTrianglesSolverTest extends FunSuite {

  val sovler = new CountTrianglesSolver()

  test("solve for 1, 2, 3") {
    assert(sovler.solve(Array(1, 2, 3)) === 0)
  }

  test("solve for 2, 2, 3") {
    assert(sovler.solve(Array(2, 2, 3)) === 1)
  }

  test("solve for 10, 2, 5, 1, 8, 12") {
    assert(sovler.solve(Array(10, 2, 5, 1, 8, 12)) === 4)
  }

}
