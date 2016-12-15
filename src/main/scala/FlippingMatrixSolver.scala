
class FlippingMatrixSolver {

  def solve(m: Array[Array[Int]], n: Int) = {
    var sum = 0
    var i = 0
    val bound = 2*n - 1
    while (i < n) {
      var j = 0
      while (j < n) {
        sum += Math.max(Math.max(m(i)(j), m(i)(bound - j)), Math.max(m(bound - i)(j), m(bound - i)(bound - j)))
        j += 1
      }
      i += 1
    }
    sum
  }

}