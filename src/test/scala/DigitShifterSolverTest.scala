
import org.scalatest.FunSuite

class DigitShifterSolverTest extends FunSuite {

  private val solver = new DigitShifterSolver()

  test("solve digit shift for 1") {
    assert(solver.solve("1") === "2")
  }

  test("solve digit shift for 2") {
    assert(solver.solve("1") === "2")
  }

  test("solve digit shift for 9") {
    assert(solver.solve("9") === "0")
  }

  test("solve digit shift for 12") {
    assert(solver.solve("12") === "23")
  }

  test("solve digit shift for 123456789") {
    assert(solver.solve("123456789") === "234567890")
  }

}
