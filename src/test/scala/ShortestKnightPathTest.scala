import org.scalatest.FunSuite

class ShortestKnightPathTest extends FunSuite {

  test("binaryGap of 1") {
    val bg = new BinaryGapSolver()
    assert(bg.of(1) === 0)
  }

}