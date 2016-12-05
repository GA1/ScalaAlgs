
import org.scalatest.FunSuite

class DigitShifterWithKeySolverTest extends FunSuite {

  private val solver = new DigitShifterWithKeySolver()

  test("solve digit shift for 1") {
    assert(solver.solve("1", 1) === "2")
  }

  test("solve digit shift for 2") {
    assert(solver.solve("1", 1) === "2")
  }

  test("solve digit shift for 9") {
    assert(solver.solve("9", 1) === "0")
  }

  test("solve digit shift for 12") {
    assert(solver.solve("12", 1) === "23")
  }

  test("solve digit shift for 123456789") {
    assert(solver.solve("123456789", 1) === "234567890")
  }

  test("solve digit shift for 1 and key 2") {
    assert(solver.solve("1", 2) === "3")
  }

  test("solve digit shift for 2 and key 3") {
    assert(solver.solve("1", 3) === "4")
  }

  test("solve digit shift for 9 and key 4") {
    assert(solver.solve("9", 4) === "3")
  }

  test("solve digit shift for 12 and key 5") {
    assert(solver.solve("12", 5) === "67")
  }

  test("solve digit shift for 123456789 and key 2") {
    assert(solver.solve("123456789", 2) === "345678901")
  }
}
