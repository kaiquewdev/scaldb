package shaft_alignment

import rx.lang.scala.Observable

class HistoryAxis extends TransitionalAxis {
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
}

class Axis() extends HistoryAxis {
  var dX: Int = InitialPoint.value()
  var dY: Int = InitialPoint.value()
  var dZ: Int = InitialPoint.value()

  def setDx(v: Int) = dX = x
  def setDy(v: Int) = dY = y
  def setDz(v: Int) = dZ = z

  def getDx(v: Int) = dX
  def getDy(v: Int) = dY
  def getDz(v: Int) = dZ

  def vNotEqZero(v: Int) = v != 0

  // Group of methods to increase and decrease the x point with co-ligation with history
  def increaseX(v: Int) = {
    if (vNotEqZero(x)) 
      historyOfIncreasedX = historyOfIncreasedX :+ x
    incX(v)
  }
  def decreaseX(v: Int) = {
    setDx(x)
    decX(v)
    historyOfDecreasedX = historyOfDecreasedX :+ x
  }
  // Group of methods to increase and decrease the y point with co-ligation with history
  def increaseY(v: Int) = {
    if (vNotEqZero(y))
      historyOfIncreasedY = historyOfIncreasedY :+ y
    incY(v)
  }
  def decreaseY(v: Int) = {
    setDy(y)
    decY(v)
    historyOfDecreasedY = historyOfDecreasedY :+ y
  }
  // Group of methods to increase and decrease the z point with co-ligation with history
  def increaseZ(v: Int) = {
    if (vNotEqZero(z))
      historyOfIncreasedZ = historyOfIncreasedZ :+ z
    incZ(v)
  }
  def decreaseZ(v: Int) = {
    setDz(z)
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
