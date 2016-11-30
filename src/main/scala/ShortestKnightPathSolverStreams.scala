private object ShortestKnightPathSolverStreams {
  private val startPos = Pos(0, 0)

  case class Pos(i: Int, j: Int) {
    def neighbors: List[Pos] = List(Pos(i-1, j-2), Pos(i+1, j-2), Pos(i-1, j+2), Pos(i+1, j+2), Pos(i-2, j-1), Pos(i-2, j+1), Pos(i+2, j-1), Pos(i+2, j+1))
    def legalNeighbors(chessBoard: Array[Array[Int]]): List[Pos] = neighbors filter (_.isLegal(chessBoard))
    def isLegal(chessBoard: Array[Array[Int]]): Boolean = chessBoard.isDefinedAt(i) && chessBoard(i).isDefinedAt(j) && chessBoard(i)(j) != 1
  }

}

class ShortestKnightPathSolverStreams(chessBoard: Array[Array[Int]]) extends ShortestKnightPathSolver {

  import ShortestKnightPathSolverStreams._

  private val goal = Pos(chessBoard.length - 1, chessBoard(0).length - 1)

  private def done(p: Pos): Boolean = p == goal

  private def neighborsWithDistance(b: Pos, distance: Int): Stream[(Pos, Int)] = {
    val newDistance = distance + 1
    b.legalNeighbors(chessBoard).toStream map (p => (p, newDistance))
  }

  private def newNeighborsOnly(neighbors: Stream[(Pos, Int)], explored: Set[Pos]): Stream[(Pos, Int)] =
    neighbors filter(x => !explored.contains(x._1))

  private def from(initial: Stream[(Pos, Int)], explored: Set[Pos]): Stream[(Pos, Int)] =
    if (initial.isEmpty) Stream()
    else {
      val newNeighbors: Stream[(Pos, Int)] = newNeighborsOnly(neighborsWithDistance(initial.head._1, initial.head._2), explored)
      initial.head #:: from(initial.tail #::: newNeighbors, newNeighbors.foldLeft(explored)(_ + _._1))
    }

  private lazy val pathsFromStart: Stream[(Pos, Int)] = from(Stream((startPos, 0)), Set())

  private lazy val pathsToGoal: Stream[(Pos, Int)] = pathsFromStart filter (x => done(x._1))

  def solve(): Int = {
    val ptg = pathsToGoal
    if (ptg.isEmpty) -1 else ptg.head._2
  }
}
