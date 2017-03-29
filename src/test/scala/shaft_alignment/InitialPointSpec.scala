package shaft_alignment

import org.scalatest._

class InitialPointSpec extends FlatSpec with Matchers {
  "The initial point object" should "has a default value" in {
    InitialPoint.value() shouldEqual (new Point()).value
    InitialPoint.value().isInstanceOf[Int] shouldEqual true
  }
}
