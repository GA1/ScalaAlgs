import CaptainPrimeSolver.{CENTRAL, DEAD, LEFT, RIGHT}
import org.scalatest.FunSuite


class PrimalitySolverTest extends FunSuite {

  val sovler = new PrimalitySolver()

  test("solve for 1 ") {
    assert(CaptainPrimeSolver.isPrime(1) === false)
  }

  test("solve for 2") {
    assert(CaptainPrimeSolver.isPrime(2) === true)
  }

  test("solve for 3") {
    assert(CaptainPrimeSolver.isPrime(3) === true)
  }

  test("solve for 4") {
    assert(CaptainPrimeSolver.isPrime(2*2) === false)
  }

  test("solve for 5") {
    assert(CaptainPrimeSolver.isPrime(5) === true)
  }

  test("solve for 6") {
    assert(CaptainPrimeSolver.isPrime(2*3) === false)
  }

  test("solve for 13") {
    assert(CaptainPrimeSolver.isPrime(13) === true)
  }

  test("solve for 31*39") {
    assert(CaptainPrimeSolver.isPrime(31*39) === false)
  }

  test("solve for 961,748,941") {
    assert(CaptainPrimeSolver.isPrime(961748941) === true)
  }

}
