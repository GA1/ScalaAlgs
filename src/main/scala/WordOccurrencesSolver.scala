
class WordOccurrencesSolver {

  def solve(word: String, text: String): Int = {
    val n = word.length
    def solve(acc: Int, word: String, sb: String): Int = sb match {
      case _ if sb.length < n => acc
      case _ if sb.substring(0, n) == word => solve(acc + 1, word, sb.tail)
      case _ => solve(acc, word, sb.tail)
    }
    solve(0, word, text)
  }

}
