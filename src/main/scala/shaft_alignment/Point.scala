package shaft_alignment

trait PointAttr {
  var value: Int
  def setValue(n: Int): Int
  def getValue(): Int
}

class Point(var value: Int = 0) extends Object with PointAttr {
  def setValue(n: Int): Int = {
    value = n
    value
  }
  def getValue(): Int = value
}
