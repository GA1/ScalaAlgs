//package algorithms

//import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner



//@RunWith(classOf[JUnitRunner])
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

//class BinaryGap {
//
//  def of(i: Int): Int = {
//    val binary = i.toBinaryString
//    binary.toList.foldLeft((0, 0))(
//      (x, y) =>
//        if (y == '0') (x._1, x._2 + 1)
//        else
//          if (x._1 < x._2) (x._2, 0)
//          else (x._1, 0)
//    )._1
//  }
//}