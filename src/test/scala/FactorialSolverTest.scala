import org.scalatest.FunSuite

class FactorialSolverTest extends FunSuite{

  private val solver = new FactorialSolver()

  test("0!") {
    assert(solver.solve(0) === 1)
  }

  test("1!") {
    assert(solver.solve(1) === 1)
  }

  test("2!") {
    assert(solver.solve(2) === 2)
  }

  test("3!") {
    assert(solver.solve(3) === 6)
  }

  test("4!") {
    assert(solver.solve(4) === 24)
  }

  test("20!") {
    assert(solver.solve(20) === BigInt("2432902008176640000"))
  }

}
