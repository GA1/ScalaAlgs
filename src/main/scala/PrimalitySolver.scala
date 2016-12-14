
class PrimalitySolver {

  def solve(n: Int): Boolean = n != 1 && ((2 to Math.sqrt(n).toInt).toStream forall (n % _ != 0))

}

