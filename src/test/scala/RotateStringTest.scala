import org.scalatest.FunSuite

class RotateStringTest extends FunSuite {

  val rotator = new RotateString()

  test("rotate 'a'") {
    assert(rotator.rotate("a") === List("a"))
  }

  test("rotate 'ab'") {
    assert(rotator.rotate("ab") === List("ba", "ab"))
  }

  test("rotate 'abc'") {
    assert(rotator.rotate("abc") === List("bca", "cab", "abc"))
  }

  test("rotate 'abcd'") {
    assert(rotator.rotate("abcd") === List("bcda", "cdab", "dabc", "abcd"))
  }


}