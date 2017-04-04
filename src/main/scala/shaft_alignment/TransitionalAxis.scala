package shaft_alignment

trait TransitionalAxisMethods {
  def incX(v: Int): Int
  def incY(v: Int): Int
  def incZ(v: Int)
  def decX(v: Int)
  def decY(v: Int)
  def decZ(v: Int)
}

class TransitionalAxis() extends LogicAxis with TransitionalAxisMethods {
  def incX(v: Int): Int = {
    setX(sum(getX(),v))
    v
  }
  def incY(v: Int): Int = {
    setY(sum(getY(),v))
    v
  }
  def incZ(v: Int) = setZ(sum(getZ(),v))
  def decX(v: Int) = setX(sub(getX(),v))
  def decY(v: Int) = setY(sub(getY(),v))
  def decZ(v: Int) = setZ(sub(getZ(),v))
}
