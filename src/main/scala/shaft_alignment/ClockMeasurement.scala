package shaft_alignment

class ClockMeasurement(val first: Clock = (new Clock()), val second: Clock = (new Clock())) extends Object {
  def distanceX() = (new Hands(first.x,second.x)).blcPosSub()
  def distanceY() = (new Hands(first.y,second.y)).blcPosSub()
  def distanceZ() = (new Hands(first.z,second.z)).blcPosSub()
}
