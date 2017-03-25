package shaft_alignment

trait FeetMeasurements {
  val first: Feet
  val second: Feet
}

class ComponentsMeasurement(
  val first: Feet = InitFeet.instance,
  val second: Feet = InitFeet.instance
) extends Object with FeetMeasurements {}

class FeetMeasurement() extends ComponentsMeasurement {
  def distanceX() = HandsBlcPosSub.dis(first.x,second.x)
  def distanceY() = HandsBlcPosSub.dis(first.y,second.y)
  def distanceZ() = HandsBlcPosSub.dis(first.z,second.z)
}
