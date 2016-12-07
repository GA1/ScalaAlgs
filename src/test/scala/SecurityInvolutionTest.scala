import org.scalatest.FunSuite

class SecurityInvolutionTest extends FunSuite {

  private val solver = new SecurityInvolutionSolver()

  test("solve security involution for 1->1") {
    assert(solver.solve(List(1)))
  }

  test("solve security involution for 1->1, 2->2") {
    assert(solver.solve(List(1, 2)))
  }

  test("solve security involution for 1->2, 2->1") {
    assert(solver.solve(List(2, 1)))
  }

  test("solve security involution for 1->2, 2->3, 3->1") {
    assert(!solver.solve(List(2, 3, 1)))
  }

  test("solve security involution for 1->3, 2->4, 3->1, 4->2") {
    assert(solver.solve(List(3, 4, 1, 2)))
  }

}
