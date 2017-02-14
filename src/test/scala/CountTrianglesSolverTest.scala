import org.scalatest.FunSuite


class PangramSolverTest extends FunSuite {

  val sovler = new PangramSolver()

  test("solve for empty frase") {
    assert(sovler.solve("") === false)
  }

  test("solve for full english alphabet") {
    assert(sovler.solve("a b c d e f g h i j k l m n o p q r s t u v w x y z") === true)
  }

  test("""solve for a sentece: "We promptly judged antique ivory buckles for the next prize"""") {
    assert(sovler.solve("We promptly judged antique ivory buckles for the next prize") === true)
  }

}
