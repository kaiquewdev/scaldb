package shaft_alignment

import org.scalatest._

class FeetMeasurementSpec extends FlatSpec with Matchers {
  "The feet measurement class" should "be flexible for feets" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.isInstanceOf[FeetMeasurement] shouldEqual true

    feetMeasurement.first.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.first.x shouldEqual 0
    feetMeasurement.first.x.isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.getX() shouldEqual 0
    feetMeasurement.first.getX().isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.setX(1000)
    feetMeasurement.first.getX() shouldEqual 1000
    feetMeasurement.first.getX().isInstanceOf[Int] shouldEqual true

    feetMeasurement.first.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.first.y shouldEqual 0
    feetMeasurement.first.y.isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.getY() shouldEqual 0
    feetMeasurement.first.getY().isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.setY(2000)
    feetMeasurement.first.getY() shouldEqual 2000
    feetMeasurement.first.getY().isInstanceOf[Int] shouldEqual true

    feetMeasurement.first.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.first.z shouldEqual 0
    feetMeasurement.first.z.isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.getZ() shouldEqual 0
    feetMeasurement.first.getZ().isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.setZ(3000)
    feetMeasurement.first.getZ() shouldEqual 3000
    feetMeasurement.first.getZ().isInstanceOf[Int] shouldEqual true

    feetMeasurement.second.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.second.x shouldEqual 0
    feetMeasurement.second.x.isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.getX() shouldEqual 0
    feetMeasurement.second.getX().isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.setX(4000)
    feetMeasurement.second.getX() shouldEqual 4000
    feetMeasurement.second.getX().isInstanceOf[Int] shouldEqual true

    feetMeasurement.second.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.second.y shouldEqual 0
    feetMeasurement.second.y.isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.getY() shouldEqual 0
    feetMeasurement.second.getY().isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.setY(5000)
    feetMeasurement.second.getY() shouldEqual 5000
    feetMeasurement.second.getY().isInstanceOf[Int] shouldEqual true

    feetMeasurement.second.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.second.z shouldEqual 0
    feetMeasurement.second.z.isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.getZ() shouldEqual 0
    feetMeasurement.second.getZ().isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.setZ(6000)
    feetMeasurement.second.getZ() shouldEqual 6000
    feetMeasurement.second.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The feet measurement class" should "have a distance between both x axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.isInstanceOf[FeetMeasurement] shouldEqual true

    feetMeasurement.first.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.first.increaseX(10)
    feetMeasurement.first.x shouldEqual 10
    feetMeasurement.first.x.isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.getX() shouldEqual 10
    feetMeasurement.first.getX().isInstanceOf[Int] shouldEqual true

    feetMeasurement.second.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.second.increaseX(30)
    feetMeasurement.second.x shouldEqual 30
    feetMeasurement.second.x.isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.getX() shouldEqual 30
    feetMeasurement.second.getX().isInstanceOf[Int] shouldEqual true

    feetMeasurement.distanceX() shouldEqual 20
    feetMeasurement.distanceX().isInstanceOf[Int] shouldEqual true
  }

  "The feet measurement class" should "have a distance between both y axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.isInstanceOf[FeetMeasurement] shouldEqual true

    feetMeasurement.first.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.first.increaseY(10)
    feetMeasurement.first.y shouldEqual 10
    feetMeasurement.first.y.isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.getY() shouldEqual 10
    feetMeasurement.first.getY().isInstanceOf[Int] shouldEqual true

    feetMeasurement.second.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.second.increaseY(30)
    feetMeasurement.second.y shouldEqual 30
    feetMeasurement.second.y.isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.getY() shouldEqual 30
    feetMeasurement.second.getY().isInstanceOf[Int] shouldEqual true

    feetMeasurement.distanceY() shouldEqual 20
    feetMeasurement.distanceY().isInstanceOf[Int] shouldEqual true
  }

  "The feet measurement class" should "have a distance between both z axis point" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.isInstanceOf[FeetMeasurement] shouldEqual true

    feetMeasurement.first.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.first.increaseZ(10)
    feetMeasurement.first.z shouldEqual 10
    feetMeasurement.first.z.isInstanceOf[Int] shouldEqual true
    feetMeasurement.first.getZ() shouldEqual 10
    feetMeasurement.first.getZ().isInstanceOf[Int] shouldEqual true

    feetMeasurement.second.isInstanceOf[Axis] shouldEqual true
    feetMeasurement.second.increaseZ(30)
    feetMeasurement.second.z shouldEqual 30
    feetMeasurement.second.z.isInstanceOf[Int] shouldEqual true
    feetMeasurement.second.getZ() shouldEqual 30
    feetMeasurement.second.getZ().isInstanceOf[Int] shouldEqual true

    feetMeasurement.distanceZ() shouldEqual 20
    feetMeasurement.distanceZ().isInstanceOf[Int] shouldEqual true
  }
}
