import org.scalatest.FunSuite

abstract class ShortestKnightPathTest extends FunSuite {

  def createSolver(chessBoard: Array[Array[Int]]): ShortestKnightPathSolver

  test("ShortestKnightPath of [0] - solved") {
    val chessBoard = Array.fill[Int](1, 1) { 0 }
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 0)
  }

  test("ShortestKnightPath of 3x2 - solved") {
    val chessBoard = Array.fill[Int](3, 2) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 1)
  }

  test("ShortestKnightPath of 2x3 - solved") {
    val chessBoard = Array.fill[Int](2, 3) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 1)
  }

  test("ShortestKnightPath of 2x5 - no solution") {
    val chessBoard = Array.fill[Int](2, 5) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === -1)
  }

  test("ShortestKnightPath of 4x4 - solved") {
    val chessBoard = Array.fill[Int](4, 4) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 2)
  }

  test("ShortestKnightPath of 4x4 with obstruction - no solution") {
    val chessBoard = Array.fill[Int](4, 4) {0}
    chessBoard(1)(2) = 1
    chessBoard(2)(1) = 1
    val solver = createSolver(chessBoard)
    assert(solver.solve() === -1)
  }

  test("ShortestKnightPath of 3x5 - solved") {
    val chessBoard = Array.fill[Int](3, 5) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 2)
  }

  test("ShortestKnightPath of 3x5 with obstruction - solved") {
    val chessBoard = Array.fill[Int](3, 5) {0}
    chessBoard(1)(2) = 1
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 6)
  }

  test("ShortestKnightPath of 4x7 with obstruction - solved") {
    val chessBoard = Array.fill[Int](4, 7) {0}
    chessBoard(1)(2) = 1
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 5)
  }

  test("ShortestKnightPath of 5x3 - solved") {
    val chessBoard = Array.fill[Int](5, 3) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 2)
  }

  test("ShortestKnightPath of 7x4 - solved") {
    val chessBoard = Array.fill[Int](7, 4) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 3)
  }

  test("ShortestKnightPath of 7x4 with obstruction - solved") {
    val chessBoard = Array.fill[Int](7, 4) {0}
    chessBoard(2)(1) = 1
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 5)
  }

  test("ShortestKnightPath of 7x4 with obstruction - no solution") {
    val chessBoard = Array.fill[Int](7, 4) {0}
    chessBoard(4)(2) = 1
    chessBoard(5)(1) = 1
    val solver = createSolver(chessBoard)
    assert(solver.solve() === -1)
  }

  test("ShortestKnightPath of 4x7 with obstruction - no solution") {
    val chessBoard = Array.fill[Int](4, 7) {0}
    chessBoard(2)(4) = 1
    chessBoard(1)(5) = 1
    val solver = createSolver(chessBoard)
    assert(solver.solve() === -1)
  }

  test("ShortestKnightPath of 5x3 with obstruction - solved") {
    val chessBoard = Array.fill[Int](5, 3) {0}
    chessBoard(2)(1) = 1
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 6)
  }

  test("ShortestKnightPath of 50x99 - solved") {
    val chessBoard = Array.fill[Int](50, 99) {0}
    val solver = createSolver(chessBoard)
    assert(solver.solve() === 49)
  }

  // These tests are too slow for ShortestKnightPathSolverStreams

//  test("ShortestKnightPath of 200x396 - solved") {
//    val chessBoard = Array.fill[Int](201, 396) {0}
//    val solver = createSolver(chessBoard)
//    assert(solver.solve() === 199)
//  }
//
//  test("ShortestKnightPath of 499x999 - solved") {
//    val chessBoard = Array.fill[Int](500, 999) {0}
//    val solver = createSolver(chessBoard)
//    assert(solver.solve() === 499)
//  }

}