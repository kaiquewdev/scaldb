package shaft_alignment

import rx.lang.scala.Observable

class DegreeRotation(var degree: Int = 0) extends Object {}

class LogicRotation() extends DegreeRotation {
  def setDeg(v: Int) = degree = v
  def getDeg() = degree
}

class TransationalRotation() extends LogicRotation {
  def incDeg(v: Int) = setDeg(getDeg() + v)
  def decDeg(v: Int) = setDeg(getDeg() - v)
}

class CompositionalRotation() extends TransationalRotation {
  def degNotEqZero() = degree != 0
}

class Rotation() extends CompositionalRotation {
  var increasedStates = List(degree)
  def observableIncreasedStates() = Observable.from(increasedStates)
  var decreasedStates = List(degree)
  def observableDecreasedStates() = Observable.from(decreasedStates)
  def increase(v: Int) = {
    if (degNotEqZero())
      increasedStates = increasedStates :+ degree
    incDeg(v)
  }
  def decrease(v: Int) = {
    if (degNotEqZero())
      decreasedStates = decreasedStates :+ degree
    decDeg(v)
  }
}
