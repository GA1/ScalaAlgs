
class BinaryGapSolver {

  def of(i: Int): Int = {
    val binary = i.toBinaryString
    binary.toList.foldLeft((0, 0))(
      (x, y) =>
        if (y == '0') (x._1, x._2 + 1)
        else
          if (x._1 < x._2) (x._2, 0)
          else (x._1, 0)
    )._1
  }
}