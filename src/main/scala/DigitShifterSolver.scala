
class DigitShifterSolver {

  def solve(s: String) = s.foldLeft("")((acc, c) => acc + ((c.asDigit + 1) % 10).toString)

}
