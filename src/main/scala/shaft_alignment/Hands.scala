package shaft_alignment

trait HandsAttrs {
  var left: Int
  var right: Int
}

class Hands(var left: Int = 0, var right: Int = 0) extends Object with HandsAttrs {
  def blcPosSub() = Math.max(left, right) - Math.min(left,right)
}


