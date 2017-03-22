package shaft_alignment

class TransitionalAxis() extends LogicAxis {
  def incX(v: Int) = setX(sum(getX(),v))
  def incY(v: Int) = setY(sum(getY(),v))
  def incZ(v: Int) = setZ(sum(getZ(),v))
  def decX(v: Int) = setX(sub(getX(),v))
  def decY(v: Int) = setY(sub(getY(),v))
  def decZ(v: Int) = setZ(sub(getZ(),v))
}
