import org.scalatest.FunSuite

class RotateMatrixSolverTest extends FunSuite {

  private val solver = new RotateMatrixSolver()

  test("solve 1 2 | 3 4 with step = 1") {
    assert(solver.solve(Array(Array(1, 2), Array(3, 4)), 1) === Array(Array(2, 4), Array(1, 3)))
  }

  test("solve 1 2 | 3 4 with step = 2") {
    assert(solver.solve(Array(Array(1, 2), Array(3, 4)), 2) === Array(Array(4, 3), Array(2, 1)))
  }

  test("solve 1 2 | 3 4 with step = 4") {
    assert(solver.solve(Array(Array(1, 2), Array(3, 4)), 4) === Array(Array(1, 2), Array(3, 4)))
  }

  test("getFrame for 1 2 | 3 4 with depth = 0") {
    assert(solver.getFrame(Array(Array(1, 2), Array(3, 4)), 0, 2, 2) === Array(1, 2, 4, 3))
  }

  test("getFrame for 1 2 | 3 4 | 5 6 | 7 8 with depth = 0") {
    assert(solver.getFrame(Array(Array(1, 2), Array(3, 4), Array(5, 6), Array(7, 8)), 0, 2, 4) === Array(1, 2, 4, 6, 8, 7, 5, 3))
  }

  test("getFrame for 1 2 3 4 | 5 6 7 8 with depth = 0") {
    assert(solver.getFrame(Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8)), 0, 4, 2) === Array(1, 2, 3, 4, 8, 7, 6, 5))
  }

  test("getFrame for 1 2 3 4| 5 6 7 8 | 9 10 11 12 | 13 14 15 16 with depth = 0") {
    assert(solver.getFrame(Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12), Array(13, 14, 15, 16)), 0, 4, 4)
      === Array(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5))
  }

  test("getFrame for 1 2 3 4| 5 6 7 8 | 9 10 11 12 | 13 14 15 16 with depth = 1") {
    assert(solver.getFrame(Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12), Array(13, 14, 15, 16)), 1, 4, 4)
      === Array(6, 7, 11, 10))
  }

  test("put frame 1, 2, 3, 4 with depth = 1, width = 2, height = 2") {
    val frame = Array(1, 2, 4, 3)
    val A = Array.ofDim[Int](2, 2)
    solver.putFrameIntoArray(A, frame, 2, 2, 0)
    assert(A === Array(Array(1, 2), Array(3, 4)))
  }

  test("put frame 1, 2, 3, 4, 5, 6 with depth = 1, width = 2, height = 3") {
    val frame = Array(1, 2, 4, 6, 5, 3)
    val A = Array.ofDim[Int](2, 3)
    solver.putFrameIntoArray(A, frame, 3, 2, 0)
    assert(A === Array(Array(1, 2, 3), Array(4, 5, 6)))
  }

  test("put frame 1, 2, 3, 4, 5, 6 with depth = 1, , width = 3, height = 2") {
    val frame = Array(1, 2, 4, 6, 5, 3)
    val A = Array.ofDim[Int](3, 2)
    solver.putFrameIntoArray(A, frame, 2, 3, 0)
    assert(A === Array(Array(1, 2), Array(3, 4), Array(5, 6)))
  }


}