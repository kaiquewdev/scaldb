package example

import org.scalatest._

class PointAxisSpec extends FlatSpec with Matchers {
  "The point axis class" should "has points" in {
    val pointAxis = new PointAxis()
    pointAxis.x shouldEqual 0
    pointAxis.y shouldEqual 0
    pointAxis.z shouldEqual 0
  }
}
