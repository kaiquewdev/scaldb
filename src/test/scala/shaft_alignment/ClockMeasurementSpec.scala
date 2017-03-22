package shaft_alignment

import org.scalatest._

class ClockMeasurementSpec extends FlatSpec with Matchers {
  "The clock measurement class" should "be flexible for clocks" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.x shouldEqual 0
    clockMeasurement.first.y shouldEqual 0
    clockMeasurement.first.z shouldEqual 0
    clockMeasurement.first.rotation.degree shouldEqual 0

    clockMeasurement.second.x shouldEqual 0
    clockMeasurement.second.y shouldEqual 0
    clockMeasurement.second.z shouldEqual 0
    clockMeasurement.second.rotation.degree shouldEqual 0
  }

  "The clock measurement class" should "have a distance between both x axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.increaseX(10)
    clockMeasurement.first.x shouldEqual 10
    
    clockMeasurement.second.increaseX(30)
    clockMeasurement.second.x shouldEqual 30

    clockMeasurement.distanceX() shouldEqual 20
  }

  "The clock measurement class" should "have a distance between both y axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.increaseY(10)
    clockMeasurement.first.y shouldEqual 10

    clockMeasurement.second.increaseY(30)
    clockMeasurement.second.y shouldEqual 30

    clockMeasurement.distanceY() shouldEqual 20
  }

  "The clock measurement class" should "have a distance between both z axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.increaseZ(10)
    clockMeasurement.first.z shouldEqual 10

    clockMeasurement.second.increaseZ(30)
    clockMeasurement.second.z shouldEqual 30

    clockMeasurement.distanceZ() shouldEqual 20
  }


}
