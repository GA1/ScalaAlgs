
import org.scalatest.FunSuite

class EncryptionSolverTest extends FunSuite {

  private val solver = new EncryptionSolver()

  test("""solve digit shift for "a" """) {
    assert(solver.solve("a") === "a")
  }

  test("""solve digit shift for "abc" """) {
    assert(solver.solve("abc") === "ac b")
  }

  test("""solve digit shift for "abcd" """) {
    assert(solver.solve("abcd") === "ac bd")
  }

  test("""solve digit shift for "abcde" """) {
    assert(solver.solve("abcde") === "ad be c")
  }

  test("""solve digit shift for "abcdef" """) {
    assert(solver.solve("abcdef") === "ad be cf")
  }

  test("""solve digit shift for "abcdefg" """) {
    assert(solver.solve("abcdefg") === "adg be cf")
  }

  test("""solve digit shift for "abcdefgh" """) {
    assert(solver.solve("abcdefgh") === "adg beh cf")
  }

  test("""solve digit shift for "haveaniceday" """) {
    assert(solver.solve("haveaniceday") === "hae and via ecy")
  }

  test("""solve digit shift for "feedthedog" """) {
    assert(solver.solve("feedthedog") === "fto ehg ee dd")
  }

}
