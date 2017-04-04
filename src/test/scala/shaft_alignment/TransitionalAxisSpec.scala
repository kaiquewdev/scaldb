package shaft_alignment

import org.scalatest._

class TransitionalAxisSpec extends FlatSpec with Matchers {
  "The transitional axis class" should "increase the x axis point" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incX(10) shouldEqual 10
    transitionalAxis.incX(5) shouldEqual 5
    transitionalAxis.incX(20).isInstanceOf[Int] shouldEqual true
    transitionalAxis.getX() shouldEqual 35
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true
  }

  "The transitional axis class" should "decrease the x axis point" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incX(100) shouldEqual 100
    transitionalAxis.decX(50) shouldEqual 50
    transitionalAxis.decX(10).isInstanceOf[Int] shouldEqual true
    transitionalAxis.getX() shouldEqual 40
    transitionalAxis.getX().isInstanceOf[Int] shouldEqual true
  }

  "The transitional axis class" should "increase the y axis point" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incY(10) shouldEqual 10
    transitionalAxis.incY(8) shouldEqual 8
    transitionalAxis.getY() shouldEqual 18
    transitionalAxis.getY().isInstanceOf[Int] shouldEqual true
  }

  "The transitional axis class" should "decrease the y axis point" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incY(100) shouldEqual 100
    transitionalAxis.decY(20) shouldEqual 20
    transitionalAxis.decY(10).isInstanceOf[Int] shouldEqual true
    transitionalAxis.getY() shouldEqual 70
    transitionalAxis.getY().isInstanceOf[Int] shouldEqual true
  }

  "The transitional axis class" should "increase the z axis point" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incZ(15) shouldEqual 15
    transitionalAxis.incZ(30) shouldEqual 30
    transitionalAxis.getZ() shouldEqual 45
    transitionalAxis.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The transitional axis class" should "decrease the z axis point" in {
    val transitionalAxis = new TransitionalAxis()

    transitionalAxis.isInstanceOf[TransitionalAxis] shouldEqual true

    transitionalAxis.incZ(100) shouldEqual 100
    transitionalAxis.decZ(20) shouldEqual 20
    transitionalAxis.decZ(10).isInstanceOf[Int] shouldEqual true
    transitionalAxis.getZ() shouldEqual 70
    transitionalAxis.getZ().isInstanceOf[Int] shouldEqual true
  }
}
