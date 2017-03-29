package shaft_alignment

import org.scalatest._

class LogicAxisSpec extends FlatSpec with Matchers {
  "The logic axis class" should "has getters and setters" in {
    val logicAxis = new LogicAxis()

    logicAxis.isInstanceOf[LogicAxis] shouldEqual true

    logicAxis.setX(10)
    logicAxis.getX() shouldEqual 10
    logicAxis.getX().isInstanceOf[Int] shouldEqual true

    logicAxis.setY(15)
    logicAxis.getY() shouldEqual 15
    logicAxis.getY().isInstanceOf[Int] shouldEqual true

    logicAxis.setZ(20)
    logicAxis.getZ() shouldEqual 20
    logicAxis.getZ().isInstanceOf[Int] shouldEqual true
  }
}
