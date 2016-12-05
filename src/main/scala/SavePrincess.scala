
class SavePrincessSolver {

  def solve(grid: Array[String]): List[String] = {
    val princessRow = grid.indexWhere(_.indexWhere(_ == 'p') != -1)
    val princessColumn = grid(princessRow).indexWhere(_ == 'p')
    val marioRow = grid.indexWhere(_.indexWhere(_ == 'm') != -1)
    val marioColumn = grid(marioRow).indexWhere(_ == 'm')
    val (dx, dy) = (princessColumn - marioColumn, princessRow - marioRow)
    val l = List.fill(Math.abs(dx)) (if (dx < 0) "LEFT" else "RIGHT") ++ List.fill(Math.abs(dy)) (if (dy < 0) "UP" else "DOWN")
    if (!l.isEmpty) l.head
    l foreach println
    return l

  }

}
