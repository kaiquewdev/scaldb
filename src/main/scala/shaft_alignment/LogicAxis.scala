package shaft_alignment

trait PointAxisMethods {
  def setX(v: Int): Int
  def setY(v: Int): Int
  def setZ(v: Int): Int
  def getX(): Int
  def getY(): Int
  def getZ(): Int
  def sum(args: Int*): Int
  def sub(args: Int*): Int
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
  def getX(): Int = x
  def getY(): Int = y
  def getZ(): Int = z
  def sum(args: Int*) = args.reduce((l,r) => l + r)
  def sub(args: Int*) = args.reduce((l,r) => l - r)
}
