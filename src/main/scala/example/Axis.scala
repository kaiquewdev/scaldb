
package example

import rx.lang.scala.Observable

class Point(var value: Int = 0) {}

class Axis(var x: Int = (new Point()).value, var y: Int = (new Point()).value, var z: Int = (new Point()).value) {
  var dX: Int = (new Point()).value
  var dY: Int = (new Point()).value
  var dZ: Int = (new Point()).value
  // History of increased and decreased values for x
  var historyOfIncreasedX = List(x)
  var historyOfDecreasedX = List(x)
  // History of increased and decreased values for y
  var historyOfIncreasedY = List(y)
  var historyOfDecreasedY = List(y)
  // History of increased and decreased values for z
  var historyOfIncreasedZ = List(z)
  var historyOfDecreasedZ = List(z)

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
