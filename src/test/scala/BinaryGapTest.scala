import org.scalatest.FunSuite

class BinaryGapTest extends FunSuite {

  test("binaryGap of 1") {
    val bg = new BinaryGap()
    assert(bg.of(1) === 0)
  }

  test("binaryGap of 2") {
    val bg = new BinaryGap()
    assert(bg.of(2) === 0)
  }

  test("binaryGap of 3") {
    val bg = new BinaryGap()
    assert(bg.of(3) === 0)
  }

  test("binaryGap of 4") {
    val bg = new BinaryGap()
    assert(bg.of(4) === 0)
  }

  test("binaryGap of 5") {
    val bg = new BinaryGap()
    assert(bg.of(5) === 1)
  }

  test("binaryGap of 529") {
    val bg = new BinaryGap()
    assert(bg.of(529) === 4)
  }

  test("binaryGap of 1041") {
    val bg = new BinaryGap()
    assert(bg.of(1041) === 5)
  }

}