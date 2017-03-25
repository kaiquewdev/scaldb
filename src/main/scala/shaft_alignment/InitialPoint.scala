package shaft_alignment

trait PointInitialization {
  def value(): Int
}

object InitialPoint extends PointInitialization {
  def value(): Int = (new Point()).value
}
