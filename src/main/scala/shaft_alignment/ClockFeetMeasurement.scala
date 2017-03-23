package shaft_alignment

class ComponentsClockFeetMeasurement(
  val first: Clock = InitClock.instance,
  val second: Feet = InitFeet.instance
) extends Object {}

class ClockFeetMeasurement() extends ComponentsClockFeetMeasurement {
  def distanceX() = HandsBlcPosSub.dis(first.x,second.x)
  def distanceY() = HandsBlcPosSub.dis(first.y,second.y)
  def distanceZ() = HandsBlcPosSub.dis(first.z,second.z)
}
