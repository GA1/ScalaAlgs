
class DigitShifterWithKeySolver {

  def solve(s: String, key: Int) = s.foldLeft("")((acc, c) => acc + ((c.asDigit + key) % 10).toString)

}
