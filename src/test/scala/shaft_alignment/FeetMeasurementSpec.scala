package shaft_alignment

import org.scalatest._

class FeetMeasurementSpec extends FlatSpec with Matchers {
  "The feet measurement class" should "be flexible for feets" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.x shouldEqual 0
    feetMeasurement.first.getX() shouldEqual 0
    feetMeasurement.first.setX(1000)
    feetMeasurement.first.getX() shouldEqual 1000

    feetMeasurement.first.y shouldEqual 0
    feetMeasurement.first.getY() shouldEqual 0
    feetMeasurement.first.setY(2000)
    feetMeasurement.first.getY() shouldEqual 2000

    feetMeasurement.first.z shouldEqual 0
    feetMeasurement.first.getZ() shouldEqual 0
    feetMeasurement.first.setZ(3000)
    feetMeasurement.first.getZ() shouldEqual 3000

    feetMeasurement.second.x shouldEqual 0
    feetMeasurement.second.getX() shouldEqual 0
    feetMeasurement.second.setX(4000)
    feetMeasurement.second.getX() shouldEqual 4000

    feetMeasurement.second.y shouldEqual 0
    feetMeasurement.second.getY() shouldEqual 0
    feetMeasurement.second.setY(5000)
    feetMeasurement.second.getY() shouldEqual 5000

    feetMeasurement.second.z shouldEqual 0
    feetMeasurement.second.getZ() shouldEqual 0
    feetMeasurement.second.setZ(6000)
    feetMeasurement.second.getZ() shouldEqual 6000
  }

  "The feet measurement class" should "have a distance between both x axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.increaseX(10)
    feetMeasurement.first.x shouldEqual 10
    feetMeasurement.first.getX() shouldEqual 10

    feetMeasurement.second.increaseX(30)
    feetMeasurement.second.x shouldEqual 30
    feetMeasurement.second.getX() shouldEqual 30

    feetMeasurement.distanceX() shouldEqual 20
  }

  "The feet measurement class" should "have a distance between both y axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.increaseY(10)
    feetMeasurement.first.y shouldEqual 10
    feetMeasurement.first.getY() shouldEqual 10

    feetMeasurement.second.increaseY(30)
    feetMeasurement.second.y shouldEqual 30
    feetMeasurement.second.getY() shouldEqual 30

    feetMeasurement.distanceY() shouldEqual 20
  }

  "The feet measurement class" should "have a distance between both z axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.increaseZ(10)
    feetMeasurement.first.z shouldEqual 10
    feetMeasurement.first.getZ() shouldEqual 10

    feetMeasurement.second.increaseZ(30)
    feetMeasurement.second.z shouldEqual 30
    feetMeasurement.second.getZ() shouldEqual 30

    feetMeasurement.distanceZ() shouldEqual 20
  }
}
