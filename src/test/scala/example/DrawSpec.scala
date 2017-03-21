package example

import org.scalatest._

class DrawSpec extends FlatSpec with Matchers {
  "The draw class" should "have choices" in {
    val draw = new Draw()
    draw.choice(0) shouldEqual "square"
    draw.choice(1) shouldEqual "circle"
    draw.choice(2) shouldEqual "triangle"
  }
}
