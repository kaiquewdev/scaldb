package shaft_alignment

import org.scalatest._

class FeetSpec extends FlatSpec with Matchers {
  "The feet class" should "have axis points" in {
    val feet = new Feet()

    feet.x shouldEqual 0
    feet.getX() shouldEqual 0
    feet.setX(1000)
    feet.getX() shouldEqual 1000

    feet.y shouldEqual 0
    feet.getY() shouldEqual 0
    feet.setY(2000)
    feet.getY() shouldEqual 2000

    feet.z shouldEqual 0
    feet.getZ() shouldEqual 0
    feet.setZ(3000)
    feet.getZ() shouldEqual 3000
  }
}
