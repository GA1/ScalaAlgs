/**
  * Created by kamil on 12/7/16.
  */
class BasicCryptoAnalysisSolver {



}

object BasicCryptoAnalysisSolver {

  def main(args: Array[String]) {
    discoverer
    val stringtoDecode = Console.readLine
    stringtoDecode.foreach(c => print(decodeChar(c)))
  }

  def decodeChar(c: Char) = {
    if (c == ' ') ' '
    else if (c == 'l') 's'
    else if (c == 'e') 'e'
    else if (c == 'y') 'n'
    else if (c == 's') 'r'
    else if (c == 't') 'i'
    else if (c == 'j') 'o'
    else if (c == 'f') 'a'
    else if (c == 'g') 'c'
    else if (c == 'm') 'p'
    else if (c == 'c') 't'
    else if (c == 'o') 'l'
    else if (c == 'r') 'd'
    else if (c == 'q') 'g'
    else if (c == 'p') 'u'
    else if (c == 'd') 'b'
    else if (c == 'v') 'h'
    else if (c == 'a') 'w'
    else if (c == 'z') 'm'
    else if (c == 'w') 'f'
    else if (c == 'h') 'k'
    else if (c == 'x') 'y'
    else if (c == 'n') 'v'
    else if (c == 'b') 'z'
    else ""
  }

  def discoverer: Unit = {
    val s = """lhpohes gvjhe ztytwojmmtel lgsfcgver segpsltjyl vftstelc djfl rml catrroel jscvjqjyfo mjlesl lcjmmfqe egvj gsfyhtyq sjfgver csfaotyq lfxtyq gjywplesl lxljm dxcel mpyctyq ztytwojmmtelel mfcgv spres mjm psgvty bfml ofle mjlc dtc tygfycfctjy dfsyl zpygvel csfao yealqsjpml atyl lgsjql qyfsotelc fseyf ojllel gjzmselltyq wpyhtelc zpltgl weygel afyher rstnesl aefleo rtyhes mvflel yphe rstnes qojder dtwwer lojml mfcgvel reocfl djzder djpygtyq gstmmoeafsel reg cpdel qspyqe mflctel csflvtyq vfcl avfghtyq vftsdfool mzer rsjye wjjol psol mplvtyq catrroe mvfqe lgseey leqzeycer wjseqsjpyrer lmjtoes msjwtoel docl djpyger cjpstlcl goefy gojddesl mjrl qjddoe gjy gpdtyql lyftotyq rjayojfr swgl vjle atrqec gjzmfgces frfl qotcgver gspzd zftodjzdl lyfsh"""
    val N = s.length
    val occurrences: List[(Char, Int)] = s.toList.groupBy(x => x) map { case (c, cc) => (c, cc.size) } toList
    val frequencies = occurrences.foldLeft(List[(Char, Double)]())((acc, c) => (c._1, (c._2 / N.toDouble * 100.0)) :: acc).sortBy((x) => x._2).reverse
    frequencies foreach (x => println(x._1 + "  ---  " + ((x._2 * 100.0).round) / 100.0))

    println(s)
    s.foreach(x => {
      if (x == ' ') print(' ')
      else if (x == 'l') print('s') // discovered with minifloppies being the 1st  word
      else if (x == 'e') print('e') // discovered with minifloppies being the 1st  word
      else if (x == 'y') print('n') // discovered with minifloppies being the 1st  word
      else if (x == 's') print('r') // discovered with posers       being the 2nd  word
      else if (x == 't') print('i') // discovered with minifloppies being the 1st  word
      else if (x == 'j') print('o') // discovered with minifloppies being the 1st  word
      else if (x == 'f') print('a') // discovered with harriest     being the 5th  word
      else if (x == 'g') print('c') // discovered with recursions   being the 4th  word
      else if (x == 'm') print('p') // discovered with minifloppies being the 1st  word
      else if (x == 'c') print('t') // discovered with harriest     being the 5th  word
      else if (x == 'o') print('l') // discovered with minifloppies being the 1st  word  (ztytwojmmtel)
      else if (x == 'r') print('d') // discovered with roached      being the 8th  word
      else if (x == 'q') print('g') // discovered with stoppage     being the 7th  word
      else if (x == 'p') print('u') // discovered with skulker(s)   being the 3rd  word
      else if (x == 'd') print('b') // discovered with boas         being the 6th  word
      else if (x == 'v') print('h') // discovered with harriest     being the 5th  word
      else if (x == 'a') print('w') // discovered with trawling     being the 9th  word
      else if (x == 'z') print('m') // discovered with minifloppies being the 1st  word
      else if (x == 'w') print('f') // discovered with minifloppies being the 1st  word
      else if (x == 'h') print('k') // discovered with skulker(s)   being the 3rd  word
      else if (x == 'x') print('y') // discovered with sysop        being the 10th word
      else if (x == 'n') print('v') // The only remaining letter
      else if (x == 'b') print('z') // discovered with zaps         being the 11th word
      else print('.')
    })

    s.split(" ").foldLeft(Set[String]())((acc, x) => {
      if (acc.contains(x)) {
        println(x)
        acc
      } else acc + x
    })
  }
}
