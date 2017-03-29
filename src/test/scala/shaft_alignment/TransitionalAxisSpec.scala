package shaft_alignment

import org.scalatest._

class TransitionalAxisSpec extends FlatSpec with Matchers {
  "The transitional axis class" should "has incs and decs" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incX(10)
    transitionalAxis.getX() shouldEqual 10
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true
    transitionalAxis.setX(20)
    transitionalAxis.getX() shouldEqual 20
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true

    transitionalAxis.decX(5)
    transitionalAxis.getX() shouldEqual 15
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true

    transitionalAxis.incY(15)
    transitionalAxis.getY() shouldEqual 15
    transitionalAxis.getY().isInstanceOf[Int] shouldEqual true
    transitionalAxis.setY(30)
    transitionalAxis.getY().isInstanceOf[Int] shouldEqual true

    transitionalAxis.decY(5)
    transitionalAxis.getY() shouldEqual 25
    transitionalAxis.getY().isInstanceOf[Int] shouldEqual true

    transitionalAxis.incZ(20)
    transitionalAxis.getZ() shouldEqual 20
    transitionalAxis.getZ().isInstanceOf[Int] shouldEqual true
    transitionalAxis.setZ(70)
    transitionalAxis.getZ().isInstanceOf[Int] shouldEqual true

    transitionalAxis.decZ(5)
    transitionalAxis.getZ() shouldEqual 65
    transitionalAxis.getZ().isInstanceOf[Int] shouldEqual true
  }
}
