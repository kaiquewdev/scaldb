package shaft_alignment

import org.scalatest._

class ClockMeasurementSpec extends FlatSpec with Matchers {
  "The clock measurement class" should "have a x axis point for first clock" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.isInstanceOf[ClockMeasurement] shouldEqual true

    clockMeasurement.first.x shouldEqual 0
    clockMeasurement.first.x.isInstanceOf[Int] shouldEqual true
  }

  "The clock measurement class" should "have a getter for x axis point for first clock" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.isInstanceOf[ClockMeasurement] shouldEqual true

    clockMeasurement.first.getX() shouldEqual 0
    clockMeasurement.first.getX().isInstanceOf[Int] shouldEqual true
  }

  "The clock measurement class" should "be flexible for clocks" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.isInstanceOf[ClockMeasurement] shouldEqual true

    clockMeasurement.first.x shouldEqual 0
    clockMeasurement.first.x.isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.getX() shouldEqual 0
    clockMeasurement.first.getX().isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.setX(1000)
    clockMeasurement.first.getX() shouldEqual 1000
    clockMeasurement.first.getX().isInstanceOf[Int]

    clockMeasurement.first.y shouldEqual 0
    clockMeasurement.first.y.isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.getY() shouldEqual 0
    clockMeasurement.first.getY().isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.setY(2000)
    clockMeasurement.first.getY() shouldEqual 2000
    clockMeasurement.first.getY().isInstanceOf[Int] shouldEqual true

    clockMeasurement.first.z shouldEqual 0
    clockMeasurement.first.z.isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.getZ() shouldEqual 0
    clockMeasurement.first.getZ().isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.setZ(3000)
    clockMeasurement.first.getZ() shouldEqual 3000
    clockMeasurement.first.getZ().isInstanceOf[Int] shouldEqual true

    clockMeasurement.first.rotation.degree shouldEqual 0
    clockMeasurement.first.rotation.degree.isInstanceOf[Int] shouldEqual true

    clockMeasurement.second.x shouldEqual 0
    clockMeasurement.second.x.isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.getX() shouldEqual 0
    clockMeasurement.second.getX().isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.setX(1000)
    clockMeasurement.second.getX() shouldEqual 1000
    clockMeasurement.second.getX().isInstanceOf[Int] shouldEqual true

    clockMeasurement.second.y shouldEqual 0
    clockMeasurement.second.y.isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.getY() shouldEqual 0
    clockMeasurement.second.getY().isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.setY(2000)
    clockMeasurement.second.getY() shouldEqual 2000
    clockMeasurement.second.getY().isInstanceOf[Int] shouldEqual true

    clockMeasurement.second.z shouldEqual 0
    clockMeasurement.second.z.isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.getZ() shouldEqual 0
    clockMeasurement.second.getZ().isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.setZ(3000)
    clockMeasurement.second.getZ() shouldEqual 3000
    clockMeasurement.second.getZ().isInstanceOf[Int] shouldEqual true

    clockMeasurement.second.rotation.degree shouldEqual 0
    clockMeasurement.second.rotation.setDeg(10)
    clockMeasurement.second.rotation.getDeg() shouldEqual 10
    clockMeasurement.second.rotation.getDeg().isInstanceOf[Int] shouldEqual true
  }

  "The clock measurement class" should "have a distance between both x axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.isInstanceOf[ClockMeasurement] shouldEqual true

    clockMeasurement.first.increaseX(10)
    clockMeasurement.first.x shouldEqual 10
    clockMeasurement.first.x.isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.getX() shouldEqual 10
    clockMeasurement.first.getX().isInstanceOf[Int] shouldEqual true

    clockMeasurement.second.increaseX(30)
    clockMeasurement.second.x shouldEqual 30
    clockMeasurement.second.x.isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.getX() shouldEqual 30
    clockMeasurement.second.getX().isInstanceOf[Int] shouldEqual true

    clockMeasurement.distanceX() shouldEqual 20
    clockMeasurement.distanceX().isInstanceOf[Int] shouldEqual true
  }

  "The clock measurement class" should "have a distance between both y axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.isInstanceOf[ClockMeasurement] shouldEqual true

    clockMeasurement.first.increaseY(10)
    clockMeasurement.first.y shouldEqual 10
    clockMeasurement.first.y.isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.getY() shouldEqual 10
    clockMeasurement.first.getY().isInstanceOf[Int] shouldEqual true

    clockMeasurement.second.increaseY(30)
    clockMeasurement.second.y shouldEqual 30
    clockMeasurement.second.y.isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.getY() shouldEqual 30
    clockMeasurement.second.getY().isInstanceOf[Int] shouldEqual true

    clockMeasurement.distanceY() shouldEqual 20
    clockMeasurement.distanceY().isInstanceOf[Int] shouldEqual true
  }

  "The clock measurement class" should "have a distance between both z axis point" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.isInstanceOf[ClockMeasurement] shouldEqual true

    clockMeasurement.first.increaseZ(10)
    clockMeasurement.first.z shouldEqual 10
    clockMeasurement.first.z.isInstanceOf[Int] shouldEqual true
    clockMeasurement.first.getZ() shouldEqual 10
    clockMeasurement.first.getZ().isInstanceOf[Int] shouldEqual true

    clockMeasurement.second.increaseZ(30)
    clockMeasurement.second.z shouldEqual 30
    clockMeasurement.second.z.isInstanceOf[Int] shouldEqual true
    clockMeasurement.second.getZ() shouldEqual 30
    clockMeasurement.second.getZ().isInstanceOf[Int] shouldEqual true

    clockMeasurement.distanceZ() shouldEqual 20
    clockMeasurement.distanceZ().isInstanceOf[Int] shouldEqual true
  }
}
