package example

class Draw() extends Object {
  def choice(index: Int): String = index match {
    case 0 => "square"
    case 1 => "circle"
    case 2 => "triangle"
  }
}
