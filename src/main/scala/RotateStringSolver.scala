
class RotateStringSolver {

  def rotate(s: String): IndexedSeq[String] = {
    val N = s.length
    (1 to (N)).scanLeft(s)((x, y) =>x.substring(1, N) + x.charAt(0)).tail
  }

  private def printRotations(rotations: IndexedSeq[String]): Unit = println(rotations.mkString(" "))

  def rotateAndPrint(s: String): Unit = printRotations(rotate(s))
}


object RotateStringSolution {

  def main(args: Array[String]) {
    val lines = for (line <- io.Source.stdin.getLines) yield (line)
    val solver = new RotateStringSolver()
    val ss = lines.toList.tail
    ss foreach {solver.rotateAndPrint(_)}
  }

}
