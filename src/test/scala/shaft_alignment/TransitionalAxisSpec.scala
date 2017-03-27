package shaft_alignment

import org.scalatest._

class TransitionalAxisSpec extends FlatSpec with Matchers {
  "The transitional axis class" should "has incs and decs" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incX(10)
    transitionalAxis.getX() shouldEqual 10
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true

    transitionalAxis.decX(5)
    transitionalAxis.getX() shouldEqual 5
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true

    transitionalAxis.incY(15)
    transitionalAxis.getY() shouldEqual 15
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true

    transitionalAxis.decY(5)
    transitionalAxis.getY() shouldEqual 10
    transitionalAxis.getY().isInstanceOf[Int] shouldEqual true

    transitionalAxis.incZ(20)
    transitionalAxis.getZ() shouldEqual 20
    transitionalAxis.getZ().isInstanceOf[Int] shouldEqual true

    transitionalAxis.decZ(5)
    transitionalAxis.getZ() shouldEqual 15
    transitionalAxis.getZ().isInstanceOf[Int] shouldEqual true
  }
}
