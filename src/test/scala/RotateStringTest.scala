import org.scalatest.FunSuite

class RotateStringTest extends FunSuite {

  val solver = new RotateStringSolver()

  test("rotate 'a'") {
    assert(solver.rotate("a") === List("a"))
  }

  test("rotate 'ab'") {
    assert(solver.rotate("ab") === List("ba", "ab"))
  }

  test("rotate 'abc'") {
    assert(solver.rotate("abc") === List("bca", "cab", "abc"))
  }

  test("rotate 'abcd'") {
    assert(solver.rotate("abcd") === List("bcda", "cdab", "dabc", "abcd"))
  }


}