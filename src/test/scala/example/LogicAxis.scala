package example

import org.scalatest._

class LogicAxisSpec extends FlatSpec with Matchers {
  "The logic axis class" should "has getters and setters" in {
    val logicAxis = new LogicAxis()
    logicAxis.setX(10)
    logicAxis.getX() shouldEqual 10
    logicAxis.setY(15)
    logicAxis.getY() shouldEqual 15
    logicAxis.setZ(20)
    logicAxis.getZ() shouldEqual 20
  }
}
