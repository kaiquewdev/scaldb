package shaft_alignment

trait Drawing {
  val index: Int
  val repr: String
}

object Square extends Drawing {
  val index = 0
  val repr = "square"
}

object Circle extends Drawing {
  val index = 1
  val repr = "circle"
}

object Triangle extends Drawing {
  val index = 2
  val repr = "triangle"
}

class Draw() extends Object {
  def choice(index: Int): String = index match {
    case Square.index => Square.repr
    case Circle.index => Circle.repr
    case Triangle.index => Triangle.repr
  }
}
