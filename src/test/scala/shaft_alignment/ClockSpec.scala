package shaft_alignment

import org.scalatest._

class ClockSpec extends FlatSpec with Matchers {
  "The clock class" should "have default points" in {
    val clock = new Clock()

    clock.x shouldEqual 0
    clock.getX() shouldEqual 0
    clock.setX(1000)
    clock.getX() shouldEqual 1000

    clock.y shouldEqual 0
    clock.getY() shouldEqual 0
    clock.setY(2000)
    clock.getY() shouldEqual 2000

    clock.z shouldEqual 0
    clock.getZ() shouldEqual 0
    clock.setZ(3000)
    clock.getZ() shouldEqual 3000
  }

  "The clock class" should "have a degree for a rotation" in {
    val clock = new Clock()
    clock.rotation.degree shouldEqual 0
  }
}
