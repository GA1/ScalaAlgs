import org.scalatest.FunSuite

class RomanNumberConverterTest extends FunSuite {

  private val converter = new RomanNumberConverter()

  test("convert I") {
    assert(converter.convert("I") === 1)
  }

  test("convert II") {
    assert(converter.convert("II") === 2)
  }

  test("convert III") {
    assert(converter.convert("III") === 3)
  }

  test("convert V") {
    assert(converter.convert("V") === 5)
  }

  test("convert IV") {
    assert(converter.convert("IV") === 4)
  }

  test("convert XXXVIII") {
    assert(converter.convert("XXXVIII") === 38)
  }

  test("convert XXXIX") {
    assert(converter.convert("XXXIX") === 39)
  }

  test("convert XLI") {
    assert(converter.convert("XLI") === 41)
  }

  test("convert MMMCMXCIX") {
    assert(converter.convert("MMMCMXCIX") === 3999)
  }

  test("convert for final test") {
    assert(converter.convert("XIX") === 19)
    assert(converter.convert("XXXIII") === 33)
    assert(converter.convert("CXLVII") === 147)
    assert(converter.convert("CCCLXV") === 365)
    assert(converter.convert("XCIV") === 94)
    assert(converter.convert("CCLXXXIX") === 289)
    assert(converter.convert("MCMXCVII") === 1997)
    assert(converter.convert("DCCCXCVIII") === 898)
    assert(converter.convert("DCCLXIX") === 769)
    assert(converter.convert("MMMDXLVIII") === 3548)
    assert(converter.convert("MMCMLXXI") === 2971)
  }

}