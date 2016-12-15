
import org.scalatest.FunSuite

class FlippingMatrixSolverTest extends FunSuite {

  private val solver = new FlippingMatrixSolver()

  test("solve matrix n = 1") {
    assert(solver.solve(Array(Array(4, 3), Array(2, 1)), 1) === 4)
  }

  test("solve n = 2") {
    assert(solver.solve(Array(Array(112, 42, 83, 119), Array(56, 125, 56, 49), Array(15, 78, 101, 43), Array(62, 98, 114, 108)), 2) === 414)
  }

}
