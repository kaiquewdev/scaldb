package example

import org.scalatest._

class ClockSpec extends FlatSpec with Matchers {
  "The clock class" should "have default points" in {
    val clock = new Clock()
    clock.x shouldEqual 0
    clock.y shouldEqual 0
    clock.z shouldEqual 0
  }

  "The clock class" should "have a degree for a rotation" in {
    val clock = new Clock()
    clock.rotation.degree shouldEqual 0
  }
}
