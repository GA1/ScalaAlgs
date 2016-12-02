/**
  * Created by kamil on 12/2/16.
  */
class MangoesSolver {
  def solve(mangoes: Int, hungers: Array[Int], happiness: Array[Int]) = {
    val N = hungers.length
    val indexes = 1 until N
    val notSatisfying = (hungers zip indexes).toStream.filter({

      p => {
        val realHungers = (hungers zip happiness) map (hh => hh._1 + hh._2 * (p._2 - 1))
        val sortedRealHungers = realHungers.sorted.reverse
        sortedRealHungers
        true
      }
    })

  }

}
