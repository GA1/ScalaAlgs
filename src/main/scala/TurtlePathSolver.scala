import scala.collection.immutable.Queue

class TurtlePathSolver {

  def solution(a: Array[Int]): Int = {

    def solutionForClosedCase(i: Int, last3: List[Int]): Int = {
      if (i == a.length) -1
      else if (a(i) >= last3(2)) i + 1
      else solutionForClosedCase(i + 1, last3.tail :+ a(i))
    }

    def findWhenClosed(i: Int): Int = {
      assert(i > 2)
      if (i == a.length) -1
      else if (a(i) <= a(i - 2)) i
      else findWhenClosed(i + 1)
    }

    if (a.length <= 3) return -1
    else {
      val closedIndex = findWhenClosed(3)
      if (closedIndex == -1) - 1
      else solutionForClosedCase(closedIndex + 1, List(a(closedIndex - 2), a(closedIndex - 1), a(closedIndex)))
    }
  }

}

