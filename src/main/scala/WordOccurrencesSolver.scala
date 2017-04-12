
class WordOccurrencesSolver {

  def solve(word: String, text: String): Int = text.sliding(word.length).count(window => window == word)

}
