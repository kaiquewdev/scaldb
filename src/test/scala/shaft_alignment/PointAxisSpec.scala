package shaft_alignment

import org.scalatest._

class PointAxisSpec extends FlatSpec with Matchers {
  "The point axis class" should "has points" in {
    val pointAxis = new PointAxis()

    pointAxis.isInstanceOf[PointAxis] shouldEqual true

    pointAxis.x shouldEqual 0
    pointAxis.x.isInstanceOf[Int] shouldEqual true
    pointAxis.y shouldEqual 0
    pointAxis.y.isInstanceOf[Int] shouldEqual true
    pointAxis.z shouldEqual 0
    pointAxis.z.isInstanceOf[Int] shouldEqual true
  }
}
