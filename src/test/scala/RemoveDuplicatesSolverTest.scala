import org.scalatest.FunSuite

class RemoveDuplicatesSolverTest extends FunSuite {

  val solver = new RemoveDuplicatesSolver()

  test("remove duplicates for 'a'") {
    assert(solver.solve("a") === "a")
  }

  test("remove duplicates for 'aa'") {
    assert(solver.solve("aa") === "a")
  }

  test("remove duplicates for 'aab'") {
    assert(solver.solve("aab") === "ab")
  }

  test("remove duplicates for 'aabb'") {
    assert(solver.solve("aabb") === "ab")
  }

  test("remove duplicates for 'abab'") {
    assert(solver.solve("abab") === "ab")
  }



}