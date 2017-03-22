package shaft_alignment

import org.scalatest._

class FeetSpec extends FlatSpec with Matchers {
  "The feet class" should "have axis points" in {
    val feet = new Feet()
    feet.x shouldEqual 0
    feet.y shouldEqual 0
    feet.z shouldEqual 0
  }
}
