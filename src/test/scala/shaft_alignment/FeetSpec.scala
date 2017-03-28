package shaft_alignment

import org.scalatest._

class FeetSpec extends FlatSpec with Matchers {
  "The feet class" should "have axis points" in {
    val feet = new Feet()

    feet.isInstanceOf[Feet] shouldEqual true

    feet.x shouldEqual 0
    feet.x.isInstanceOf[Int] shouldEqual true
    feet.getX() shouldEqual 0
    feet.getX().isInstanceOf[Int] shouldEqual true
    feet.setX(1000)
    feet.getX() shouldEqual 1000
    feet.getX().isInstanceOf[Int] shouldEqual true

    feet.y shouldEqual 0
    feet.y.isInstanceOf[Int] shouldEqual true
    feet.getY() shouldEqual 0
    feet.getY().isInstanceOf[Int] shouldEqual true
    feet.setY(2000)
    feet.getY() shouldEqual 2000
    feet.getY().isInstanceOf[Int] shouldEqual true

    feet.z shouldEqual 0
    feet.z.isInstanceOf[Int] shouldEqual true
    feet.getZ() shouldEqual 0
    feet.getZ().isInstanceOf[Int] shouldEqual true
    feet.setZ(3000)
    feet.getZ() shouldEqual 3000
    feet.getZ().isInstanceOf[Int] shouldEqual true
  }
}
