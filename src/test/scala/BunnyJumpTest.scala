import org.scalatest.FunSuite

class BunnyJumpTest extends FunSuite {

  val solver = new BunnyJumpSolver()

  test("solve gcd for 1, 2") {
    assert(solver.gcd(1, 2) === 1)
  }

  test("solve gcd for 2, 3") {
    assert(solver.gcd(2, 3) === 1)
  }

  test("solve gcd for 0, 3") {
    assert(solver.gcd(0, 3) === 3)
  }

  test("solve gcd for 2, 2") {
    assert(solver.gcd(2, 2) === 2)
  }

  test("solve gcd for 2, 4") {
    assert(solver.gcd(2, 4) === 2)
  }

  test("solve gcd for 6, 15") {
    assert(solver.gcd(6, 15) === 3)
  }

  test("solve gcm for 1, 1") {
    assert(solver.lcm(1, 1) === 1)
  }

  test("solve gcm for 1, 2") {
    assert(solver.lcm(1, 2) === 2)
  }

  test("solve gcm for 2, 2") {
    assert(solver.lcm(2, 2) === 2)
  }

  test("solve gcm for 2, 4") {
    assert(solver.lcm(2, 4) === 4)
  }

  test("solve gcm for 6, 9") {
    assert(solver.lcm(6, 9) === 18)
  }

  test("solve for 1, 2") {
    assert(solver.solve(Array(1, 2)) === 2)
  }

  test("solve for 1, 2, 3") {
    assert(solver.solve(Array(1, 2, 3)) === 6)
  }

  test("solve for 1, 2, 3, 4") {
    assert(solver.solve(Array(1, 2, 3, 4)) === 12)
  }

  test("solve for 2, 2") {
    assert(solver.solve(Array(2, 2)) === 2)
  }

  test("solve for 157 151 149 139 137 131 127 113") {
    assert(solver.solve(Array(157, 151, 149, 139, 137, 131, 127, 113)) === BigInt("126459568506372769"))
  }











  test("solve for 2, 3, 4") {
    assert(solver.solve(Array(2, 3, 4)) === 12)
  }

}