package shaft_alignment

class ComponentsClockMeasurement(
  val first: Clock = InitClock.instance,
  val second: Clock = InitClock.instance
) extends Object {}

class ClockMeasurement() extends ComponentsClockMeasurement {
  def distanceX() = HandsBlcPosSub.dis(first.x,second.x)
  def distanceY() = HandsBlcPosSub.dis(first.y,second.y)
  def distanceZ() = HandsBlcPosSub.dis(first.z,second.z)
}
