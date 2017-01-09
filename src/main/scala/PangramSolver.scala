

object PangramSolver {
  val alphabet = "abcdefghijklmnopqrstuvwxyz".toSet
}

class PangramSolver {

  import PangramSolver.alphabet

  def solve(s: String): Boolean =
    (s map (_.toLower) filter (c => alphabet.contains(c)) distinct).length == 26


}
