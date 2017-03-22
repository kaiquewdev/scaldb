package shaft_alignment

import rx.lang.scala.Observable

class Axis() extends TransitionalAxis {
  var dX: Int = InitialPoint.value()
  var dY: Int = InitialPoint.value()
  var dZ: Int = InitialPoint.value()

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
    if (x != 0) 
      historyOfIncreasedX = historyOfIncreasedX :+ x
    incX(v)
  }
  def decreaseX(v: Int) = {
    dX = x
    decX(v)
    historyOfDecreasedX = historyOfDecreasedX :+ x
  }
  // Group of methods to increase and decrease the y point with co-ligation with history
  def increaseY(v: Int) = {
    if (y != 0)
      historyOfIncreasedY = historyOfIncreasedY :+ y
    incY(v)
  }
  def decreaseY(v: Int) = {
    dY = y
    decY(v)
    historyOfDecreasedY = historyOfDecreasedY :+ y
  }
  // Group of methods to increase and decrease the z point with co-ligation with history
  def increaseZ(v: Int) = {
    if (z != 0)
      historyOfIncreasedZ = historyOfIncreasedZ :+ z
    incZ(v)
  }
  def decreaseZ(v: Int) = {
    dZ = z
    decZ(v)
    historyOfDecreasedZ = historyOfDecreasedZ :+ z
  }
  def div(l: Int = 0, v: Int = 2) = l/v
  // Divisions by the three ones
  def divX(v: Int = 2) = div(x)
  def divY(v: Int = 2) = div(y)
  def divZ(v: Int = 2) = div(z)
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
