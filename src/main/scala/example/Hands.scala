package example

class Hands(var left: Int = 0, var right: Int = 0) {
  def blcPosSub() = Math.max(left, right) - Math.min(left,right)
}


