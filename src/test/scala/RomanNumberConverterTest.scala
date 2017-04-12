import org.scalatest.FunSuite

class RomanNumberConverterTest extends FunSuite {

  test("convert I") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("I") === 1)
  }

  test("convert II") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("II") === 2)
  }

  test("convert III") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("III") === 3)
  }

  test("convert V") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("V") === 5)
  }

  test("convert IV") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("IV") === 4)
  }

  test("convert XXXVIII") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("XXXVIII") === 38)
  }

  test("convert XXXIX") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("XXXIX") === 39)
  }

  test("convert XLI") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("XLI") === 41)
  }

  test("convert MMMCMXCIX") {
    val converter = new RomanNumberConverter()
    assert(converter.convert("MMMCMXCIX") === 3999)
  }

}