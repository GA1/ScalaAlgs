import CaptainPrimeSolver.{CENTRAL, DEAD, LEFT, RIGHT}
import org.scalatest.FunSuite


class CaptainPrimeSolverTest extends FunSuite {

  private val solver = new CaptainPrimeSolver()

  test("containsZero") {
    assert(CaptainPrimeSolver.containsZero(1) === false)
    assert(CaptainPrimeSolver.containsZero(19) === false)
    assert(CaptainPrimeSolver.containsZero(10) === true)
    assert(CaptainPrimeSolver.containsZero(1234567890) === true)
  }

  test("isPrime") {
    assert(CaptainPrimeSolver.isPrime(1) === false)
    assert(CaptainPrimeSolver.isPrime(2) === true)
    assert(CaptainPrimeSolver.isPrime(19) === true)
    assert(CaptainPrimeSolver.isPrime(10) === false)
    assert(CaptainPrimeSolver.isPrime(101) === true)
    assert(CaptainPrimeSolver.isPrime(1234567890) === false)
  }

  test("getNumberFromRight for 1") {
    assert(CaptainPrimeSolver.getNumbersFromRight(1) === Stream[Int]())
  }

  test("getNumberFromRight for 12") {
    assert(CaptainPrimeSolver.getNumbersFromRight(12) === Stream[Int](1))
  }

  test("getNumberFromRight for 123") {
    assert(CaptainPrimeSolver.getNumbersFromRight(123) === Stream[Int](1, 12))
  }

  test("getNumberFromRight for 1234") {
    assert(CaptainPrimeSolver.getNumbersFromRight(1234) === Stream[Int](1, 12, 123))
  }

  test("getNumberFromLeft for 1") {
    assert(CaptainPrimeSolver.getNumbersFromLeft(1) === Stream[Int]())
  }

  test("getNumberFromLeft for 12") {
    assert(CaptainPrimeSolver.getNumbersFromLeft(12) === Stream[Int](2))
  }

  test("getNumberFromLeft for 123") {
    assert(CaptainPrimeSolver.getNumbersFromLeft(123) === Stream[Int](3, 23))
  }

  test("getNumberFromLeft for 1234") {
    assert(CaptainPrimeSolver.getNumbersFromLeft(1234) === Stream[Int](4, 34, 234))
  }

  test("solve for 1") {
    assert(solver.solve(1) === DEAD)
  }

  test("solve for 2") {
    assert(solver.solve(2) === CENTRAL)
  }

  test("solve for 4") {
    assert(solver.solve(4) === DEAD)
  }

  test("solve for 3137") {
    assert(solver.solve(3137) === CENTRAL)
  }
  test("solve for 1367") {
    assert(solver.solve(1367) === LEFT)
  }

  test("solve for 2333") {
    assert(solver.solve(2333) === RIGHT)
  }

  test("solve for 101") {
    assert(solver.solve(101) === DEAD)
  }

  test("solve for 12") {
    assert(solver.solve(12) === DEAD)
  }

  test("solve for 43") {
    assert(solver.solve(43) === LEFT)
  }

  test("solve for 23") {
    assert(solver.solve(23) === CENTRAL)
  }

  test("solve for 66") {
    assert(solver.solve(66) === DEAD)
  }

  test("solve for 29") {
    assert(solver.solve(29) === RIGHT)
  }

}