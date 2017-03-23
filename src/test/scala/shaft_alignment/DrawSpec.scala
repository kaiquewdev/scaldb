package shaft_alignment

import org.scalatest._

class DrawSpec extends FlatSpec with Matchers {
  "The draw class" should "have choices" in {
    val draw = new Draw()
    draw.choice(Square.index) shouldEqual Square.repr 
    draw.choice(Circle.index) shouldEqual Circle.repr
    draw.choice(Triangle.index) shouldEqual Triangle.repr 
  }
}
