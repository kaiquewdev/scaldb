package shaft_alignment

import rx.lang.scala.Observable

trait DegreeRotationAttr {
  var degree: Int
}

trait LogicRotationMethods {
  def setDeg(v: Int)
  def getDeg(): Int
}

trait TransitionalRotationMethods {
  def incDeg(v: Int)
  def decDeg(v: Int)
}

trait CompositionalRotationMethod {
  def degNotEqZero(): Boolean
}

class DegreeRotation(var degree: Int = 0) extends Object with DegreeRotationAttr {}

class LogicRotation() extends DegreeRotation with LogicRotationMethods {
  def setDeg(v: Int) = degree = v
  def getDeg() = degree
}

class TransitionalRotation() extends LogicRotation with TransitionalRotationMethods {
  def incDeg(v: Int) = setDeg(getDeg() + v)
  def decDeg(v: Int) = setDeg(getDeg() - v)
}

class CompositionalRotation() extends TransitionalRotation with CompositionalRotationMethod {
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
