
class RotateStringSolver {

  def rotate(s: String): IndexedSeq[String] = {
    val N = s.length
    (1 to (N)).scanLeft(s)((x, y) =>x.substring(1, N) + x.charAt(0)).tail
  }

  def printRotations(rotations: IndexedSeq[String]): Unit = {
    rotations foreach {x => print(x + " ")}
    println()
  }

  def rotateAndPrint(s: String): Unit = {
    printRotations(rotate(s))
  }
}


object RotateStringSolution {

  def main(args: Array[String]) {
    val lines = for (line <- io.Source.stdin.getLines) yield (line)
    val rotator = new RotateStringSolver()
    val ss = lines.toList.tail
    ss foreach {rotator.rotateAndPrint(_)}
  }

}
