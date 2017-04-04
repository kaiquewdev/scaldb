package shaft_alignment

trait TransitionalAxisMethods {
  def incX(v: Int): Int
  def incY(v: Int): Int
  def incZ(v: Int): Int
  def decX(v: Int): Int
  def decY(v: Int): Int
  def decZ(v: Int): Int
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
  def incZ(v: Int): Int = {
    setZ(sum(getZ(),v))
    v
  }
  def decX(v: Int): Int = {
    setX(sub(getX(),v))
    v
  }
  def decY(v: Int): Int = {
    setY(sub(getY(),v))
    v
  }
  def decZ(v: Int): Int = {
    setZ(sub(getZ(),v))
    v
  }
}
