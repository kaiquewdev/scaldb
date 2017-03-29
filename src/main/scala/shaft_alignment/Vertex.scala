package shaft_alignment

trait VertexPoint {
  var value: Int
  def getValue(): Int
  def setValue(n: Int): Int
}

trait VertexMethods {
  def getPointValue(): Int
  def setPointValue(n: Int): Int
}

class Vertex extends Object {
  object point {
    var value: Int = 0
    def setValue(n: Int): Int = {
      point.value = n
      point.value
    }
    def getValue(): Int = point.value
  }
  def setPointValue(n: Int): Int = {
    point.value = n
    point.value
  }
  def getPointValue(): Int = point.value
}
