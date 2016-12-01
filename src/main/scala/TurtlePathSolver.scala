import scala.collection.immutable.Queue

class TurtlePathSolver {

  def solution(a: Array[Int]): Int = {

    def solution(i: Int, last4: List[Int]): Int = {
      if (i == a.length) - 1
      else if (last4.length < 4) solution(i + 1, last4 :+ a.head)
      else if (a.head >= last4(2)) i
      else solution(i + 1, last4.tail :+ a.head)
    }
    solution(0, Nil)
  }

}

