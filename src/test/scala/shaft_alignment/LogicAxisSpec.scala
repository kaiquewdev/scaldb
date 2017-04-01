package shaft_alignment

import org.scalatest._

class LogicAxisSpec extends FlatSpec with Matchers {
  "The logic axis class" should "has a setter for x point" in {
    val logicAxis = new LogicAxis()

    logicAxis.isInstanceOf[LogicAxis] shouldEqual true

    logicAxis.setX(10) shouldEqual 10
    logicAxis.setX(15).isInstanceOf[Int] shouldEqual true
  }

  "The logic axis class" should "has a getter for x point" in {
    val logicAxis = new LogicAxis()

    logicAxis.isInstanceOf[LogicAxis] shouldEqual true

    logicAxis.setX(10) shouldEqual 10
    logicAxis.getX() shouldEqual 10
  }

  "The logic axis class" should "has a setter for y point" in {
    val logicAxis = new LogicAxis()

    logicAxis.isInstanceOf[LogicAxis] shouldEqual true

    logicAxis.setY(10) shouldEqual 10
    logicAxis.setY(10).isInstanceOf[Int] shouldEqual true
  }

  "The logic axis class" should "has a getter for y point" in {
    val logicAxis = new LogicAxis()

    logicAxis.isInstanceOf[LogicAxis] shouldEqual true

    logicAxis.setY(10) shouldEqual 10
    logicAxis.getY() shouldEqual 10
    logicAxis.getY().isInstanceOf[Int] shouldEqual true
  }

  "The logic axis class" should "has a setter for z point" in {
    val logicAxis = new LogicAxis()

    logicAxis.isInstanceOf[LogicAxis] shouldEqual true

    logicAxis.setZ(10) shouldEqual 10
    logicAxis.setZ(10).isInstanceOf[Int] shouldEqual true
  }

  "The logic axis class" should "has a getter for z point" in {
    val logicAxis = new LogicAxis()

    logicAxis.isInstanceOf[LogicAxis] shouldEqual true

    logicAxis.setZ(10) shouldEqual 10
    logicAxis.getZ() shouldEqual 10
    logicAxis.getZ().isInstanceOf[Int] shouldEqual true
  }
}
