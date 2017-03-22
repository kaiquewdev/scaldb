package example

class ClockFeetMeasurement(val first: Clock = (new Clock()), val second: Feet = (new Feet())) extends Object {
  def distanceX() = (new Hands(first.x,second.x)).blcPosSub()
  def distanceY() = (new Hands(first.y,second.y)).blcPosSub()
  def distanceZ() = (new Hands(first.z,second.z)).blcPosSub()
}
