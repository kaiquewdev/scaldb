package shaft_alignment

import org.scalatest._

class DrawSpec extends FlatSpec with Matchers {
  "The Square object" should "have an index" in {
    Square.index shouldEqual 0
  }

  "The Square object" should "have an repr" in {
    Square.repr shouldEqual "square"
  }

  "The Circle object" should "have an index" in {
    Circle.index shouldEqual 1
  }

  "The Circle object" should "have an repr" in {
    Circle.repr shouldEqual "circle"
  }

  "The Triangle object" should "have an index" in {
    Triangle.index shouldEqual 2
  }

  "The Triangle object" should "have an repr" in {
    Triangle.repr shouldEqual "triangle"
  }

  "The draw class" should "have choices" in {
    val draw = new Draw()
    draw.choice(Square.index) shouldEqual Square.repr 
    draw.choice(Circle.index) shouldEqual Circle.repr
    draw.choice(Triangle.index) shouldEqual Triangle.repr 
  }
}
