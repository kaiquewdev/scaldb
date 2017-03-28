package shaft_alignment

import org.scalatest._

class HandsSpec extends FlatSpec with Matchers {
  "The Hands class" should "have a distribution method" in {
    val hands = new Hands(10, 40)

    hands.isInstanceOf[Hands] shouldEqual true

    hands.blcPosSub() shouldEqual 30
    hands.blcPosSub().isInstanceOf[Int] shouldEqual true
  }
}
