package shaft_alignment

trait Components {
  val first: Clock
  val second: Feet
}

trait Measurements {
  def distanceX(): Int
  def distanceY(): Int
  def distanceZ(): Int
}

class ComponentsClockFeetMeasurement(
  val first: Clock = InitClock.instance,
  val second: Feet = InitFeet.instance
) extends Object with Components {}

class ClockFeetMeasurement() extends ComponentsClockFeetMeasurement with Measurements {
  def distanceX() = HandsBlcPosSub.dis(first.x,second.x)
  def distanceY() = HandsBlcPosSub.dis(first.y,second.y)
  def distanceZ() = HandsBlcPosSub.dis(first.z,second.z)
}
