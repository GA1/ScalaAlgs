class DiceRolls {


  def solve(n: Int): Int = {
    def count(n: Int, acc: Int): Int = acc match {
      case _ if acc == n => 1
      case _ if acc > n => 0
      case _ if acc < n => count(n, acc + 1) + count(n, acc + 2) + count(n, acc + 3) + count(n, acc + 4) + count(n, acc + 5) + count(n, acc + 6)
    }
    count(n, 0)
  }

}
