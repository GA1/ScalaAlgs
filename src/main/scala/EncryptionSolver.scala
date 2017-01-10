

class EncryptionSolver {

  def solve(s: String): String= {
    val onlyLetters = s.toLowerCase

    var C = Math.floor(Math.sqrt(onlyLetters.length)).toInt
    var R = Math.floor(Math.sqrt(onlyLetters.length)).toInt

    if (C*R < s.length) C = C + 1
    if (C*R < s.length) R = R + 1

    val result = new StringBuilder()
    var i = 0
    while(i < C){
      var j = 0
      while (j < R) {
        if (j*C + i < s.length) result.append(s.charAt(j*C + i))
        j = j + 1
      }
      i = i + 1
      result.append(" ")
    }
    return result.toString().substring(0, result.length - 1)
  }

}
