package shaft_alignment

import org.scalatest._

class ClockFeetMeasurementSpec extends FlatSpec with Matchers {
  "The clock feet measurement class" should "be flexible for clock and feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.x shouldEqual 0
    clockFeetMeasurement.first.y shouldEqual 0
    clockFeetMeasurement.first.z shouldEqual 0

    clockFeetMeasurement.second.x shouldEqual 0
    clockFeetMeasurement.second.y shouldEqual 0
    clockFeetMeasurement.second.z shouldEqual 0
  }

  "The clock feet measurement class" should "have a distance between both x axis point" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.increaseX(10)
    clockFeetMeasurement.first.x shouldEqual 10

    clockFeetMeasurement.second.increaseX(30)
    clockFeetMeasurement.second.x shouldEqual 30

    clockFeetMeasurement.distanceX() shouldEqual 20
  }

  "The clock feet measurement class" should "have a distance between both y axis point" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.increaseY(10)
    clockFeetMeasurement.first.y shouldEqual 10

    clockFeetMeasurement.second.increaseY(30)
    clockFeetMeasurement.second.y shouldEqual 30

    clockFeetMeasurement.distanceY() shouldEqual 20
  }

  "The clock feet measurement class" should "have a distance between both z axis point" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.increaseZ(10)
    clockFeetMeasurement.first.z shouldEqual 10

    clockFeetMeasurement.second.increaseZ(30)
    clockFeetMeasurement.second.z shouldEqual 30

    clockFeetMeasurement.distanceZ() shouldEqual 20
  }
}
