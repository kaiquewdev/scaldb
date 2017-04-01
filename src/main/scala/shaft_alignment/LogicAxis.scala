package shaft_alignment

trait PointAxisMethods {
  def setX(v: Int): Int
  def setY(v: Int): Int
  def setZ(v: Int): Int
  def getX(): Int
  def getY(): Int
  def getZ(): Int
  def sum(l: Int, r: Int): Int
  def sub(l: Int, r: Int): Int
}

class LogicAxis() extends PointAxis with PointAxisMethods {
  def setX(v: Int): Int = {
    x = v
    x
  }
  def setY(v: Int): Int = {
    y = v
    y
  }
  def setZ(v: Int) = {
    z = v
    z
  }
  def getX() = x
  def getY() = y
  def getZ() = z
  def sum(l: Int, r: Int) = r + l
  def sub(l: Int, r: Int) = l - r
}
