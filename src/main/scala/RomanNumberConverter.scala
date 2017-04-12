
class RomanNumberConverter {

  private val toArabic = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

  // assume that correct roman number is provided
  def convert(romanNumber: String): Int = {
    def convert(rn: StringBuilder, lastDecimal: Int, acc: Int): Int = {
      if (rn.isEmpty) acc
      else {
        val thisDecimal = toArabic(rn.head)
        if (thisDecimal > lastDecimal) convert(rn.tail, thisDecimal, acc + thisDecimal - lastDecimal - lastDecimal)
        else convert(rn.tail, thisDecimal, acc + thisDecimal)
      }
    }

    val sb = new StringBuilder(romanNumber)
    convert(sb.tail, toArabic(sb.head), toArabic(sb.head))
  }

}

