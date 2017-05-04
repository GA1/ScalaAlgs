/**
  * Created by kamil on 5/2/17.
  */
class StartsWithSolver {

  def solve(s: String, prefixes: String*): Boolean = prefixes.exists(p => s.startsWith(p))

}
