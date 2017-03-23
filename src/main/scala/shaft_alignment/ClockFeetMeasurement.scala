package shaft_alignment

object InitClock {
  def instance() = (new Clock())
}

object InitFeet {
  def instance() = (new Feet())
}

object HandsBlcPosSub {
  def dis(firstAxis: Int, secondAxis: Int) = (new Hands(firstAxis,secondAxis)).blcPosSub()
}

class ComponentsClockFeetMeasurement(
  val first: Clock = InitClock.instance,
  val second: Feet = InitFeet.instance
) extends Object {}

class ClockFeetMeasurement() extends ComponentsClockFeetMeasurement {
  def distanceX() = HandsBlcPosSub.dis(first.x,second.x)
  def distanceY() = HandsBlcPosSub.dis(first.y,second.y)
  def distanceZ() = HandsBlcPosSub.dis(first.z,second.z)
}
