package example

class LogicAxis() extends PointAxis {
  def setX(v: Int) = x = v
  def setY(v: Int) = y = v
  def setZ(v: Int) = z = v
  def getX() = x
  def getY() = y
  def getZ() = z
  def sum(l: Int, r: Int) = r + l
  def sub(l: Int, r: Int) = l - r 
}
