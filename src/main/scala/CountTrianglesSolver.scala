
class CountTrianglesSolver {

  def solve(sides: Array[Int]): Int = {
    val sortedSides = sides.sorted
    var numberOfPossibleTriangles = 0
    val N = sides.length
    var a = 0
    while (a < N) {
      var b = a + 1
      var c = a + 2
      while (b < N - 1) {
        while (c < N && sortedSides(a) + sortedSides(b) > sortedSides(c)) {
          c += 1
        }
        numberOfPossibleTriangles += (c - b - 1)
        b += 1
      }
      a += 1
    }
    return numberOfPossibleTriangles
  }
}
