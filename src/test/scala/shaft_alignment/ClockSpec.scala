package shaft_alignment

import org.scalatest._

class ClockSpec extends FlatSpec with Matchers {
  "The clock class" should "have default points" in {
    val clock = new Clock()

    clock.isInstanceOf[Clock] shouldEqual true

    clock.x shouldEqual 0
    clock.x.isInstanceOf[Int] shouldEqual true
    clock.getX() shouldEqual 0
    clock.getX().isInstanceOf[Int] shouldEqual true
    clock.setX(1000)
    clock.getX() shouldEqual 1000
    clock.getX().isInstanceOf[Int] shouldEqual true

    clock.y shouldEqual 0
    clock.y.isInstanceOf[Int] shouldEqual true
    clock.getY() shouldEqual 0
    clock.getY().isInstanceOf[Int] shouldEqual true
    clock.setY(2000)
    clock.getY() shouldEqual 2000
    clock.getY().isInstanceOf[Int] shouldEqual true

    clock.z shouldEqual 0
    clock.z.isInstanceOf[Int] shouldEqual true
    clock.getZ() shouldEqual 0
    clock.getZ().isInstanceOf[Int] shouldEqual true
    clock.setZ(3000)
    clock.getZ() shouldEqual 3000
    clock.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The clock class" should "have a degree for a rotation" in {
    val clock = new Clock()

    clock.isInstanceOf[Clock] shouldEqual true

    clock.rotation.degree shouldEqual 0
    clock.rotation.degree.isInstanceOf[Int] shouldEqual true
    clock.rotation.getDeg() shouldEqual 0
    clock.rotation.getDeg().isInstanceOf[Int] shouldEqual true

    clock.rotation.setDeg(75)
    clock.rotation.getDeg() shouldEqual 75
    clock.rotation.getDeg().isInstanceOf[Int] shouldEqual true
  }
}
