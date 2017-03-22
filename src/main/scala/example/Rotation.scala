package example

import rx.lang.scala.Observable

class Rotation(var degree: Int = 0) extends Object {
  var increasedStates = List(degree)
  def observableIncreasedStates() = Observable.from(increasedStates)
  var decreasedStates = List(degree)
  def observableDecreasedStates() = Observable.from(decreasedStates)
  def increase(v: Int) = {
    if (degree != 0)
      increasedStates = increasedStates :+ degree
    degree += v
  }
  def decrease(v: Int) = {
    if (degree != 0)
      decreasedStates = decreasedStates :+ degree
    degree -= v
  }
}
