
package example

import rx.lang.scala.Observable

class Point(var value: Int = 0) {}

class Axis(var x: Int = (new Point()).value, var y: Int = (new Point()).value, var z: Int = (new Point()).value) {
  var dX: Int = (new Point()).value
  var dY: Int = (new Point()).value
  var dZ: Int = (new Point()).value

  // History of increased and decreased values for x
  var historyOfIncreasedX = List(x)
  var observableHistoryOfIncreasedX = Observable.from(historyOfIncreasedX)
  var historyOfDecreasedX = List(x)
  var observableHistoryOfDecreasedX = Observable.from(historyOfDecreasedX)

  // History of increased and decreased values for y
  var historyOfIncreasedY = List(y)
  var observableHistoryOfIncreasedY = Observable.from(historyOfIncreasedY)
  var historyOfDecreasedY = List(y)
  var observableHistoryOfDecreasedY = Observable.from(historyOfDecreasedY)

  // History of increased and decreased values for z
  var historyOfIncreasedZ = List(z)
  var observableHistoryOfIncreasedZ = Observable.from(historyOfIncreasedZ)
  var historyOfDecreasedZ = List(z)
  var observableHistoryOfDecreasedZ = Observable.from(historyOfDecreasedZ)

  // Group of methods to increase and decrease the x point with co-ligation with history
  def increaseX(v: Int) = {
    if (x > 0) {
      historyOfIncreasedX = historyOfIncreasedX :+ x
    }
    x += v
  }
  def decreaseX(v: Int) = {
    dX = x
    x -= v
    historyOfDecreasedX = historyOfDecreasedX :+ x
  }
  // Group of methods to increase and decrease the y point with co-ligation with history
  def increaseY(v: Int) = {
    if (y > 0) {
      historyOfIncreasedY = historyOfIncreasedY :+ y
    }
    y += v
  }
  def decreaseY(v: Int) = {
    dY = y
    y -= v
    historyOfDecreasedY = historyOfDecreasedY :+ y
  }
  // Group of methods to increase and decrease the z point with co-ligation with history
  def increaseZ(v: Int) = {
    if (z > 0) {
      historyOfIncreasedZ = historyOfIncreasedZ :+ z
    }
    z += v
  }
  def decreaseZ(v: Int) = {
    dZ = z
    z -= v
    historyOfDecreasedZ = historyOfDecreasedZ :+ z
  }
  // Divisions by the three ones
  def divX(v: Int = 2) = x/v
  def divY(v: Int = 2) = y/v
  def divZ(v: Int = 2) = z/v
  // Retrieve the increase and decrease history of x
  def increaseHistoryX() = historyOfIncreasedX
  def decreaseHistoryX() = historyOfDecreasedX
  // Retrieve the increase and decrease history of y
  def increaseHistoryY() = historyOfIncreasedY
  def decreaseHistoryY() = historyOfDecreasedY
  // Retrieve the increase and decrease history of z
  def increaseHistoryZ() = historyOfIncreasedZ
  def decreaseHistoryZ() = historyOfDecreasedZ
}

class Edge(var first: Axis = new Axis(), var last: Axis = new Axis()) extends Axis {}
class Face(var top: Edge = new Edge(), var left: Edge = new Edge(), var bottom: Edge = new Edge(), var right: Edge = new Edge()) extends Axis {
  val draw = new Draw()
  val drawFormatIndex = 0
  val drawFormatName = draw.choice(drawFormatIndex)
}

class Draw() {
  def choice(index: Int): String = index match {
    case 0 => "square"
    case 1 => "circle"
    case 2 => "triangle"
  }
}

class Rotation(var degree: Int = 0) {
  def increase(v: Int) = degree += v
  def decrease(v: Int) = degree -= v
}

class Clock(var rotation: Rotation = new Rotation()) extends Axis {}
