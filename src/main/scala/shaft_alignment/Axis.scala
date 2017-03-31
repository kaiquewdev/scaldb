package shaft_alignment

import rx.lang.scala.Observable

trait LinearityMethod {
  def sequence(v: Int = 0): List[Int]
}

trait HistoryAxisProperties {
  var historyOfIncreasedX: List[Int]
  var historyOfDecreasedX: List[Int]

  var historyOfIncreasedY: List[Int]
  var historyOfDecreasedY: List[Int]

  var historyOfIncreasedZ: List[Int]
  var historyOfDecreasedZ: List[Int]
}

trait DimensionAxisProperties {
  var dX: Int
  var dY: Int
  var dZ: Int
}

trait HighLogicAxisMethods {
  def setDx(v: Int)
  def setDy(v: Int)
  def setDz(v: Int)

  def getDx(v: Int): Int
  def getDy(v: Int): Int
  def getDz(v: Int): Int
}

trait ComposableHighLogicAxisMethods {
  def vNotEqZero(v: Int): Boolean
  def increaseX(v: Int): Int
  def decreaseX(v: Int): Int
  def increaseY(v: Int): Int
  def decreaseY(v: Int): Int
  def increaseZ(v: Int): Int
  def decreaseZ(v: Int): Int
}

trait OperationsAxisMethods {
  def div(l: Int = 0, v: Int = 2): Int
  def divX(v: Int = 2): Int
  def divY(v: Int = 2): Int
  def divZ(): Int
}

trait AxisMethods {
  def increaseHistoryX(): List[Int]
  def decreaseHistoryX(): List[Int]
  def increaseHistoryY(): List[Int]
  def decreaseHistoryY(): List[Int]
  def increaseHistoryZ(): List[Int]
  def decreaseHistoryZ(): List[Int]
}

object Linearity { def sequence(v: Int = 0): List[Int] = List(v) }

class HistoryAxis extends TransitionalAxis with HistoryAxisProperties {
  // History of increased and decreased values for x
  var historyOfIncreasedX = Linearity.sequence()
  def observableHistoryOfIncreasedX() = Observable.from(historyOfIncreasedX)
  var historyOfDecreasedX = Linearity.sequence()
  def observableHistoryOfDecreasedX() = Observable.from(historyOfDecreasedX)

  // History of increased and decreased values for y
  var historyOfIncreasedY = Linearity.sequence()
  def observableHistoryOfIncreasedY() = Observable.from(historyOfIncreasedY)
  var historyOfDecreasedY = Linearity.sequence()
  def observableHistoryOfDecreasedY() = Observable.from(historyOfDecreasedY)

  // History of increased and decreased values for z
  var historyOfIncreasedZ = Linearity.sequence()
  def observableHistoryOfIncreasedZ() = Observable.from(historyOfIncreasedZ)
  var historyOfDecreasedZ = Linearity.sequence()
  def observableHistoryOfDecreasedZ() = Observable.from(historyOfDecreasedZ)

  def appendHistoryOfIncreasedX() = historyOfIncreasedX = historyOfIncreasedX :+ x
  def appendHistoryOfDecreasedX() = historyOfDecreasedX = historyOfDecreasedX :+ x

  def appendHistoryOfIncreasedY() = historyOfIncreasedY = historyOfIncreasedY :+ y
  def appendHistoryOfDecreasedY() = historyOfDecreasedY = historyOfDecreasedY :+ y

  def appendHistoryOfIncreasedZ() = historyOfIncreasedZ = historyOfIncreasedZ :+ z
  def appendHistoryOfDecreasedZ() = historyOfDecreasedZ = historyOfDecreasedZ :+ z
}

class DimensionAxis() extends HistoryAxis with DimensionAxisProperties {
  var dX: Int = InitialPoint.value()
  var dY: Int = InitialPoint.value()
  var dZ: Int = InitialPoint.value()
}

class HighLogicAxis() extends DimensionAxis with HighLogicAxisMethods {
  def setDx(v: Int) = dX = x
  def setDy(v: Int) = dY = y
  def setDz(v: Int) = dZ = z

  def getDx(v: Int) = dX
  def getDy(v: Int) = dY
  def getDz(v: Int) = dZ
}

class ComposableHighLogicAxis() extends HighLogicAxis with ComposableHighLogicAxisMethods {
  def vNotEqZero(v: Int) = v != 0

  // Group of methods to increase and decrease the x point with co-ligation with history
  def increaseX(v: Int): Int = {
    if (vNotEqZero(x))
      appendHistoryOfIncreasedX()
    incX(v)
    v
  }

  def decreaseX(v: Int): Int = {
    setDx(x)
    decX(v)
    appendHistoryOfDecreasedX()
    v
  }

  // Group of methods to increase and decrease the y point with co-ligation with history
  def increaseY(v: Int): Int = {
    if (vNotEqZero(y))
      appendHistoryOfIncreasedY()
    incY(v)
    v
  }

  def decreaseY(v: Int): Int = {
    setDy(y)
    decY(v)
    appendHistoryOfDecreasedY()
    v
  }

  // Group of methods to increase and decrease the z point with co-ligation with history
  def increaseZ(v: Int) = {
    if (vNotEqZero(z))
      appendHistoryOfIncreasedZ()
    incZ(v)
    v
  }

  def decreaseZ(v: Int): Int = {
    setDz(z)
    decZ(v)
    appendHistoryOfDecreasedZ()
    v
  }
}

class OperationsAxis extends ComposableHighLogicAxis with OperationsAxisMethods {
  def div(l: Int = 0, v: Int = 2): Int = l/v
  // Divisions by the three ones
  def divX(v: Int = 2) = div(x,v)
  def divY(v: Int = 2) = div(y,v)
  def divZ() = div(z)
}

class Axis() extends OperationsAxis with AxisMethods {
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
