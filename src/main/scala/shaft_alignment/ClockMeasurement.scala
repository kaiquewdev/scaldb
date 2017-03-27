package shaft_alignment

trait Clocks {
  val first: Clock
  val second: Clock
}

trait ClockMeasurementMethods {
  def distanceX(): Int
  def distanceY(): Int
  def distanceZ(): Int
}

class ComponentsClockMeasurement(
  val first: Clock = InitClock.instance,
  val second: Clock = InitClock.instance
) extends Object with Clocks {}

class ClockMeasurement() extends ComponentsClockMeasurement with ClockMeasurementMethods {
  def distanceX(): Int = HandsBlcPosSub.dis(first.x,second.x)
  def distanceY(): Int = HandsBlcPosSub.dis(first.y,second.y)
  def distanceZ(): Int = HandsBlcPosSub.dis(first.z,second.z)
}
