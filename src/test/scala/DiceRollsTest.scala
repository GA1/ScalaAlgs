

import org.scalatest.FunSuite

class DiceRollsTest extends FunSuite {

  private val solver = new DiceRolls()

  test("""solve for 2""") {
    assert(solver.solve(2) === 2)
  }

  test("""solve for 3""") {
    assert(solver.solve(3) === 4)
  }

  test("""solve for 4""") {
    assert(solver.solve(4) === 8)
  }



}
