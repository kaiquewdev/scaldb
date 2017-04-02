package shaft_alignment

import org.scalatest._

class ClockFeetMeasurementSpec extends FlatSpec with Matchers {
  "The clock feet measurement class" should "have x axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.x shouldEqual 0
    clockFeetMeasurement.first.x.isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have x axis point for feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.second.x shouldEqual 0
    clockFeetMeasurement.second.x.isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a getter for x axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.getX() shouldEqual 0
    clockFeetMeasurement.first.getX().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a getter for x axis point for feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.second.getX() shouldEqual 0
    clockFeetMeasurement.second.getX().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a setter for x axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.setX(10) shouldEqual 10
    clockFeetMeasurement.first.setX(15).isInstanceOf[Int] shouldEqual true
    clockFeetMeasurement.first.getX() shouldEqual 15
  }

  "The clock feet measurement class" should "have a setter for x axis point for feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.second.setX(10) shouldEqual 10
    clockFeetMeasurement.second.getX() shouldEqual 10
    clockFeetMeasurement.second.getX().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a distance between both x axis point" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.increaseX(10) shouldEqual 10
    clockFeetMeasurement.first.x shouldEqual 10
    clockFeetMeasurement.first.getX() shouldEqual 10

    clockFeetMeasurement.second.increaseX(30) shouldEqual 30
    clockFeetMeasurement.second.x shouldEqual 30
    clockFeetMeasurement.second.getX() shouldEqual 30

    clockFeetMeasurement.distanceX() shouldEqual 20
    clockFeetMeasurement.distanceX().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have y axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.y shouldEqual 0
    clockFeetMeasurement.first.y.isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have y axis point for feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.second.y shouldEqual 0
    clockFeetMeasurement.second.y.isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a getter for y axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.getY() shouldEqual 0
    clockFeetMeasurement.first.getY().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a getter for y axis point for feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.second.getY() shouldEqual 0
    clockFeetMeasurement.second.getY().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a distance between both y axis point" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.increaseY(10) shouldEqual 10
    clockFeetMeasurement.first.y shouldEqual 10
    clockFeetMeasurement.first.getY() shouldEqual 10

    clockFeetMeasurement.second.increaseY(30) shouldEqual 30
    clockFeetMeasurement.second.y shouldEqual 30
    clockFeetMeasurement.second.getY() shouldEqual 30

    clockFeetMeasurement.distanceY() shouldEqual 20
    clockFeetMeasurement.distanceY().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a z axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.z shouldEqual 0
    clockFeetMeasurement.first.z.isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a z axis point for feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.second.z shouldEqual 0
    clockFeetMeasurement.second.z.isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a getter for z axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.getX() shouldEqual 0
    clockFeetMeasurement.first.getX().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a getter for z axis point for feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.second.getX() shouldEqual 0
    clockFeetMeasurement.second.getX().isInstanceOf[Int] shouldEqual true
  }

  "The clock feet measurement class" should "have a setter for z axis point for clock" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.isInstanceOf[ClockFeetMeasurement] shouldEqual true

    clockFeetMeasurement.first.setX(10) shouldEqual 10
    clockFeetMeasurement.first.setX(15).isInstanceOf[Int] shouldEqual true
    clockFeetMeasurement.first.getX() shouldEqual 15
  }

  "The clock feet measurement class" should "have a distance between both z axis point" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.increaseZ(10) shouldEqual 10
    clockFeetMeasurement.first.z shouldEqual 10
    clockFeetMeasurement.first.getZ() shouldEqual 10

    clockFeetMeasurement.second.increaseZ(30) shouldEqual 30
    clockFeetMeasurement.second.z shouldEqual 30
    clockFeetMeasurement.second.getZ() shouldEqual 30

    clockFeetMeasurement.distanceZ() shouldEqual 20
    clockFeetMeasurement.distanceZ().isInstanceOf[Int] shouldEqual true
  }
}
