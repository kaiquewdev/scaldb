package shaft_alignment

trait PointAttr {
  var value: Int
}

class Point(var value: Int = 0) extends Object with PointAttr {}
