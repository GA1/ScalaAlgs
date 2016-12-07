import org.scalatest.FunSuite

class KeywordTranspositionCipherSolverTest extends FunSuite {

  val solver = new KeywordTranspositionCipherSolver()

  test("with SPORT as key") {
    assert(solver.solve("SPORT", "LDXTW KXDTL NBSFX BFOII LNBHG ODDWN BWK") === "ILOVE SOLVI NGPRO GRAMM INGCH ALLEN GES")
  }

  test("with SECRET as key") {
    assert(solver.solve("SECRET", "JHQSU XFXBQ") === "CRYPT OLOGY")
  }

  test("with SECRET as key no2") {
    assert(solver.solve("SECRET", "CDJOW EBINV RFKPX SAHMUZ TGLQY") === "ABCDE FGHIJ KLMNO PQRSTU VWXYZ")
  }


}