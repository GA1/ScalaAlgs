import org.scalatest.FunSuite


class PangramsSolverTest extends FunSuite {

  val sovler = new PangramsSolver()

  test("solve for empty frase") {
    assert(sovler.solve("") === false)
  }

}
