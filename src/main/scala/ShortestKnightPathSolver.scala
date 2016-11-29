//package streams
//
//
//package streams
//
///**
//  * This trait represents the layout and building blocks of the game
//  *
//  * @TODO: SHOULD RENAME `x` and `y` in class Pos to `row` and `col`. It's
//  * confusing to have `x` being the vertical axis.
//  */
//trait GameDef {
//
//  val startPos: Pos
//  val goal: Pos
//
//  type Terrain = Pos => Boolean
//  val terrain: Terrain
//
//  sealed abstract class Move
//    case object LeftDown  extends Move
//    case object LeftUp  extends Move
//    case object RightDown extends Move
//    case object RightUp extends Move
//    case object UpLeft extends Move
//    case object UpRight extends Move
//    case object DownLeft extends Move
//    case object DownRight extends Move
//
//  def startBlock: Pos = new Pos(0, 0)
//
//  case class Pos(i: Int, j: Int) {
//    def neighbors: List[Pos] = List(Pos(i-1, j-2), Pos(i+1, j-2), Pos(i-1, j+2), Pos(i+1, j+2), Pos(i-2, j-1), Pos(i-2, j+1), Pos(i+2, j-1), Pos(i+2, j+1))
//    def legalNeighbors: List[Pos] = neighbors filter (_.isLegal)
//    def isLegal: Boolean = terrain(this)
//  }
//}
//
//
//trait Solver extends GameDef {
//
//  def done(p: Pos): Boolean = p == goal
//
//  def neighborsWithHistory(b: Pos, distance: Int): Stream[(Pos, Int)] = {
//    //    (b.legalNeighbors map (p => (p._1, p._2::history))).toStream
//    b.legalNeighbors.toStream map (p => (p, distance + 1))
//  }
//
//  def newNeighborsOnly(neighbors: Stream[(Pos, Int)], explored: Set[Pos]): Stream[(Pos, Int)] =
//  neighbors filter((x => !explored.contains(x._1)))
//  //    neighbors filter((explored.contains(_._1)))  // WHY IT DOESN'T WORK?
//
//  def from(initial: Stream[(Pos, Int)], explored: Set[Pos]): Stream[Pos] = {
//    if (initial.isEmpty) Stream()
//    else {
//      val newNeighbors: Stream[Pos] = newNeighborsOnly(neighborsWithHistory(initial.head._1, initial.head._2), explored)
//      initial.head #:: from(initial.tail #::: newNeighbors, newNeighbors.foldLeft(explored)(_ + _))
//    }
//  }
//
//  lazy val pathsFromStart: Stream[(Pos, List[Move])] = from(Stream(Pos(0, 0), 0), Set())
//
//  lazy val pathsToGoal: Stream[Pos] = pathsFromStart filter (x => done(x._1))
//  //    pathsFromStart filter (done(_._1))  // WHY IT DOESN'T WORK?
//
//  lazy val solution: Int = {
//    val ptg = pathsToGoal
//    if (ptg.isEmpty) Nil else ptg.head._2
//  }
//}
