package example

import org.scalatest._

class TransitionalAxisSpec extends FlatSpec with Matchers {
  "The transitional axis class" should "has incs and decs" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.incX(10)
    transitionalAxis.getX() shouldEqual 10
    transitionalAxis.decX(5)
    transitionalAxis.getX() shouldEqual 5

    transitionalAxis.incY(15)
    transitionalAxis.getY() shouldEqual 15
    transitionalAxis.decY(5)
    transitionalAxis.getY() shouldEqual 10

    transitionalAxis.incZ(20)
    transitionalAxis.getZ() shouldEqual 20
    transitionalAxis.decZ(5)
    transitionalAxis.getZ() shouldEqual 15
  }
}
