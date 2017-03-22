package shaft_alignment

import org.scalatest._

class FeetMeasurementSpec extends FlatSpec with Matchers {
  "The feet measurement class" should "be flexible for feets" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.x shouldEqual 0
    feetMeasurement.first.y shouldEqual 0
    feetMeasurement.first.z shouldEqual 0

    feetMeasurement.second.x shouldEqual 0
    feetMeasurement.second.y shouldEqual 0
    feetMeasurement.second.z shouldEqual 0
  }

  "The feet measurement class" should "have a distance between both x axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.increaseX(10)
    feetMeasurement.first.x shouldEqual 10

    feetMeasurement.second.increaseX(30)
    feetMeasurement.second.x shouldEqual 30

    feetMeasurement.distanceX() shouldEqual 20
  }

  "The feet measurement class" should "have a distance between both y axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.increaseY(10)
    feetMeasurement.first.y shouldEqual 10

    feetMeasurement.second.increaseY(30)
    feetMeasurement.second.y shouldEqual 30

    feetMeasurement.distanceY() shouldEqual 20
  }

  "The feet measurement class" should "have a distance between both z axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.increaseZ(10)
    feetMeasurement.first.z shouldEqual 10

    feetMeasurement.second.increaseZ(30)
    feetMeasurement.second.z shouldEqual 30

    feetMeasurement.distanceZ() shouldEqual 20
  }
}
