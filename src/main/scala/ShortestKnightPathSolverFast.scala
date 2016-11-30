import scala.collection.immutable.Queue

private object ShortestKnightPathSolverFast {
  private val startPos = Pos(0, 0)

  case class Pos(i: Int, j: Int) {
    def neighbors: List[Pos] = List(Pos(i-1, j-2), Pos(i+1, j-2), Pos(i-1, j+2), Pos(i+1, j+2), Pos(i-2, j-1), Pos(i-2, j+1), Pos(i+2, j-1), Pos(i+2, j+1))
    def legalNeighbors(chessBoard: Array[Array[Int]]): List[Pos] = neighbors filter (_.isLegal(chessBoard))
    def isLegal(chessBoard: Array[Array[Int]]): Boolean = chessBoard.isDefinedAt(i) && chessBoard(i).isDefinedAt(j) && chessBoard(i)(j) != 1
  }

}

class ShortestKnightPathSolverFast(chessBoard: Array[Array[Int]]) extends ShortestKnightPathSolver {

  import ShortestKnightPathSolverFast._

  private val goal = Pos(chessBoard.length - 1, chessBoard(0).length - 1)

  private def neighborsWithDistance(b: Pos, distance: Int): List[(Pos, Int)] = {
    val newDistance = distance + 1
    b.legalNeighbors(chessBoard) map (p => (p, newDistance))
  }

  private def newNeighborsOnly(neighbors: List[(Pos, Int)], explored: Set[Pos]): List[(Pos, Int)] =
    neighbors filter(x => !explored.contains(x._1))

  def solve(): Int = {
    def solve(notVisited: Queue[(Pos, Int)], visited: Set[Pos]): Int = {
      if (notVisited.isEmpty) -1
      else {
        val (temp, newNotVisited) = notVisited.dequeue
        if (temp._1 == goal)
          return temp._2
        val newNeighbors: List[(Pos, Int)] = newNeighborsOnly(neighborsWithDistance(temp._1, temp._2), visited)
        solve(newNeighbors.foldLeft(newNotVisited)(_ enqueue _), newNeighbors.foldLeft(visited)(_ + _._1))
      }
    }
    solve(collection.immutable.Queue[(Pos, Int)]((startPos, 0)), Set[Pos]())
  }
}
