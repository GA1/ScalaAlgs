
object RemoveDuplicateSolution {

  def main(args: Array[String]) {
    val lines = for (line <- io.Source.stdin.getLines) yield (line)
    val solver = new RemoveDuplicatesSolver()
    println(solver.solve(lines.toList.head))
  }
}


class RemoveDuplicatesSolver {

  def solve(s: String): String = {
    s.foldLeft(new StringBuilder(), Set[Char]())((x, y) => (if (!x._2.contains(y)) (x._1.append(y), x._2 + y) else x))
      ._1.toString()
  }

}