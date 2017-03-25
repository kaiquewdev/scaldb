package shaft_alignment

trait PointAxisAttrs {
  var x: Int
  var y: Int
  var z: Int
}

class PointAxis(
  var x: Int = InitialPoint.value(),
  var y: Int = InitialPoint.value(),
  var z: Int = InitialPoint.value()
) extends Object with PointAxisAttrs {}
