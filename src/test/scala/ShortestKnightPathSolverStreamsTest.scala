
class ShortestKnightPathSolverStreamsTest extends ShortestKnightPathTest{

  override def createSolver(chessBoard: Array[Array[Int]]) = new ShortestKnightPathSolverStreams(chessBoard)
}
