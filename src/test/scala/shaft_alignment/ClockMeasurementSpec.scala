package shaft_alignment

import org.scalatest._

class ClockMeasurementSpec extends FlatSpec with Matchers {
  "The clock measurement class" should "be flexible for clocks" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.x shouldEqual 0
    clockMeasurement.first.getX() shouldEqual 0
    clockMeasurement.first.setX(1000)
    clockMeasurement.first.getX() shouldEqual 1000

    clockMeasurement.first.y shouldEqual 0
    clockMeasurement.first.getY() shouldEqual 0
    clockMeasurement.first.setY(2000)
    clockMeasurement.first.getY() shouldEqual 2000

    clockMeasurement.first.z shouldEqual 0
    clockMeasurement.first.getZ() shouldEqual 0
    clockMeasurement.first.setZ(3000)
    clockMeasurement.first.getZ() shouldEqual 3000

    clockMeasurement.first.rotation.degree shouldEqual 0

    clockMeasurement.second.x shouldEqual 0
    clockMeasurement.second.getX() shouldEqual 0
    clockMeasurement.second.setX(1000)
    clockMeasurement.second.getX() shouldEqual 1000

    clockMeasurement.second.y shouldEqual 0
    clockMeasurement.second.getY() shouldEqual 0
    clockMeasurement.second.setY(2000)
    clockMeasurement.second.getY() shouldEqual 2000

    clockMeasurement.second.z shouldEqual 0
    clockMeasurement.second.getZ() shouldEqual 0
    clockMeasurement.second.setZ(3000)
    clockMeasurement.second.getZ() shouldEqual 3000

    clockMeasurement.second.rotation.degree shouldEqual 0
  }

  "The clock measurement class" should "have a distance between both x axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.increaseX(10)
    clockMeasurement.first.x shouldEqual 10
    clockMeasurement.first.getX() shouldEqual 10

    clockMeasurement.second.increaseX(30)
    clockMeasurement.second.x shouldEqual 30
    clockMeasurement.second.getX() shouldEqual 30

    clockMeasurement.distanceX() shouldEqual 20
  }

  "The clock measurement class" should "have a distance between both y axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.increaseY(10)
    clockMeasurement.first.y shouldEqual 10
    clockMeasurement.first.getY() shouldEqual 10

    clockMeasurement.second.increaseY(30)
    clockMeasurement.second.y shouldEqual 30
    clockMeasurement.second.getY() shouldEqual 30

    clockMeasurement.distanceY() shouldEqual 20
  }

  "The clock measurement class" should "have a distance between both z axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.increaseZ(10)
    clockMeasurement.first.z shouldEqual 10
    clockMeasurement.first.getZ() shouldEqual 10

    clockMeasurement.second.increaseZ(30)
    clockMeasurement.second.z shouldEqual 30
    clockMeasurement.second.getZ() shouldEqual 30

    clockMeasurement.distanceZ() shouldEqual 20
  }
}
