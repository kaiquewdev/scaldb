package shaft_alignment

import rx.lang.scala.Observable

trait VertexPoint {
  var value: Int
  def getValue(): Int
  def setValue(n: Int): Int
}

trait VertexMethods {
  def getPointValue(): Int
  def setPointValue(n: Int): Int
}

class Vertex(var pointsLen: Int = 2) extends Object {
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
  def getPoints(pointValues: Int*): List[Point] = {
    if (pointValues.length >= 2) {
      Observable.from(pointValues).map(v => (new Point(v))).toBlocking.toList
    } else {
      Observable.from(1 to pointsLen).map(v => (new Point())).toBlocking.toList
    }
  }
}
