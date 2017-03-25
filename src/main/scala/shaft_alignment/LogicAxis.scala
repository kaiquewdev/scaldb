package shaft_alignment

trait PointAxisMethods {
  def setX(v: Int)
  def setY(v: Int)
  def setZ(v: Int)
  def getX(): Int
  def getY(): Int
  def getZ(): Int
  def sum(l: Int, r: Int): Int
  def sub(l: Int, r: Int): Int
}

class LogicAxis() extends PointAxis with PointAxisMethods {
  def setX(v: Int) = x = v
  def setY(v: Int) = y = v
  def setZ(v: Int) = z = v
  def getX() = x
  def getY() = y
  def getZ() = z
  def sum(l: Int, r: Int) = r + l
  def sub(l: Int, r: Int) = l - r
}
