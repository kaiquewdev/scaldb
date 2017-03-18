package example

import rx.lang.scala.Observable

class Point(var value: Int = 0) extends Object {}

class Axis(var x: Int = (new Point()).value, var y: Int = (new Point()).value, var z: Int = (new Point()).value) extends Object {
  var dX: Int = (new Point()).value
  var dY: Int = (new Point()).value
  var dZ: Int = (new Point()).value

  // History of increased and decreased values for x
  var historyOfIncreasedX = List(x)
  def observableHistoryOfIncreasedX() = Observable.from(historyOfIncreasedX)
  var historyOfDecreasedX = List(x)
  def observableHistoryOfDecreasedX() = Observable.from(historyOfDecreasedX)

  // History of increased and decreased values for y
  var historyOfIncreasedY = List(y)
  def observableHistoryOfIncreasedY() = Observable.from(historyOfIncreasedY)
  var historyOfDecreasedY = List(y)
  def observableHistoryOfDecreasedY() = Observable.from(historyOfDecreasedY)

  // History of increased and decreased values for z
  var historyOfIncreasedZ = List(z)
  def observableHistoryOfIncreasedZ() = Observable.from(historyOfIncreasedZ)
  var historyOfDecreasedZ = List(z)
  def observableHistoryOfDecreasedZ() = Observable.from(historyOfDecreasedZ)

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
    if (y != 0) {
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
    if (z != 0) {
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

class Draw() extends Object {
  def choice(index: Int): String = index match {
    case 0 => "square"
    case 1 => "circle"
    case 2 => "triangle"
  }
}

class Rotation(var degree: Int = 0) extends Object {
  var increasedStates = List(degree)
  def observableIncreasedStates() = Observable.from(increasedStates)
  var decreasedStates = List(degree)
  def observableDecreasedStates() = Observable.from(decreasedStates)
  def increase(v: Int) = {
    if (degree != 0) {
      increasedStates = increasedStates :+ degree
    }
    degree += v
  }
  def decrease(v: Int) = {
    if (degree != 0) {
      decreasedStates = decreasedStates :+ degree
    }
    degree -= v
  }
}

class Clock(var rotation: Rotation = new Rotation()) extends Axis {}
class Feet() extends Axis {}

class ClockMeasurement(val first: Clock = (new Clock()), val second: Clock = (new Clock())) extends Object {
  def distanceX() = Math.max(first.x,second.x) - Math.min(first.x,second.x)
  def distanceY() = Math.max(first.y,second.y) - Math.min(first.y,second.y)
  def distanceZ() = Math.max(first.z,second.z) - Math.min(first.z,second.z)
}
class ClockFeetMeasurement(val first: Clock = (new Clock()), val second: Feet = (new Feet())) extends Object {}
class FeetMeasurement(val first: Feet = (new Feet()), val second: Feet = (new Feet())) extends Object {}
