

class RotateMatrixSolver {


  def solve(A: Array[Array[Int]], step: Int): Array[Array[Int]] = {
    val height = A.length
    val width = A(0).length
      0 until Math.min(height, width) foreach {
        depth => {
          val frame = getFrame(A, depth, width, height)
          val rotatedFrame = frame.slice(step, frame.length) ++ frame.slice(0, step)
          putFrameIntoArray(A, rotatedFrame, width, height, depth)
        }
      }
    A
  }

  def putFrameIntoArray(A: Array[Array[Int]], rotatedFrame: Array[Int], width: Int, height: Int, depth: Int): Unit = {
//    A(depth) = rotatedFrame.slice(0, width)
//    A(height - 1 - depth) = rotatedFrame.slice(width + height - 1, width + height - 2 + width).reverse

    (depth) until (width - depth) foreach {
      i => {
        A(depth)(i) = rotatedFrame(i)
        A(height - 1 - depth)(width - 1 - i) = rotatedFrame(width + height - 1 + i)
      }
    }


    (1 + depth) until (height - 1 - depth) foreach {
      i => {
        A(i)(width - 1) = rotatedFrame(width + i)
        A(height - 1 - i)(0) = rotatedFrame(width + height - 2 + width + i)
      }
    }
  }

  def getFrame(A: Array[Array[Int]], depth: Int, width: Int, height: Int): Array[Int] = {
    val horizontalRange: Range = (0 + depth) until (width - depth)
    val verticalRange: Range = (1 + depth) until (height - depth - 1)
    val top = horizontalRange map (A(depth)(_)) toArray
    val bottom = (horizontalRange reverse) map (A(height - 1 - depth)(_)) toArray
    val right = verticalRange map (i => A(i)(width - 1 - depth)) toArray
    val left = (verticalRange reverse) map (A(_)(depth)) toArray
    val frame = top ++ right ++ bottom ++ left
    return frame
  }
}
