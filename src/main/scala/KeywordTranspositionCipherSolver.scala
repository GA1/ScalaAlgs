
object KeywordTranspositionCipherSolver {

  private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  private val removeDuplicatesSolver = new RemoveDuplicatesSolver()
  private val stringsTransposeSolver = new StringsTransposeSolver()
  private val stringSubtractorSolver = new StringSubtractorSolver()

}

class KeywordTranspositionCipherSolver {

  import KeywordTranspositionCipherSolver._



  def solve(key: String, cipheredMessage: String): String = {
    val cipher = getCipher(key)
    val decipher = getDecipher(cipher)
    cipheredMessage.foldLeft(StringBuilder.newBuilder)((acc, c) => if (c == ' ') acc.append(" ") else acc.append(decipher(c))).toString()
  }

  private def getDecipher(cipher: Char => Char): Char => Char = {
    val mapping = alphabet.foldLeft(List[(Char, Char)]())((acc, c) => (c, cipher(c)) :: acc)
    val inversedMapping = mapping.foldLeft(Map[Char, Char]()) ((acc, vk) => acc + (vk._2 -> vk._1))
    c => inversedMapping(c)
  }

  private def getCipher(key: String): Char => Char = {
    val keyWithoutDuplicates = removeDuplicatesSolver.solve(key)
    val N = keyWithoutDuplicates.length
    val lettersLeft = stringSubtractorSolver.solve(alphabet, keyWithoutDuplicates)
    val ordered: Array[String] = new Array[String](Math.ceil(alphabet.length / N.toDouble).toInt)
    for {
      i <- 0 until ordered.length
    } ordered(i) = (keyWithoutDuplicates + lettersLeft).substring(i*N, Math.min((i+1)*N, alphabet.length))
    val transposed = stringsTransposeSolver.solve(ordered)
    val cipheredAlphabet = (transposed sortBy (_.charAt(0))).fold("")(_ + _)
    (c) => cipheredAlphabet.charAt(alphabet.indexOf(c))
  }

}
