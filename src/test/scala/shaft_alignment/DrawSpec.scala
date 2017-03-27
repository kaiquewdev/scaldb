package shaft_alignment

import org.scalatest._

class DrawSpec extends FlatSpec with Matchers {
  "The Square object" should "have an index" in {
    Square.index shouldEqual 0
    Square.index.isInstanceOf[Int] shouldEqual true
  }

  "The Square object" should "have an repr" in {
    Square.repr shouldEqual "square"
    Square.repr.isInstanceOf[String] shouldEqual true
  }

  "The Circle object" should "have an index" in {
    Circle.index shouldEqual 1
    Circle.index.isInstanceOf[Int] shouldEqual true
  }

  "The Circle object" should "have an repr" in {
    Circle.repr shouldEqual "circle"
    Circle.repr.isInstanceOf[String] shouldEqual true
  }

  "The Triangle object" should "have an index" in {
    Triangle.index shouldEqual 2
    Triangle.index.isInstanceOf[Int] shouldEqual true
  }

  "The Triangle object" should "have an repr" in {
    Triangle.repr shouldEqual "triangle"
    Triangle.repr.isInstanceOf[String] shouldEqual true
  }

  "The draw class" should "have choices" in {
    val draw = new Draw()

    draw.isInstanceOf[Draw] shouldEqual true

    draw.choice(Square.index) shouldEqual Square.repr
    draw.choice(Square.index).isInstanceOf[String] shouldEqual true
    draw.choice(Circle.index) shouldEqual Circle.repr
    draw.choice(Circle.index).isInstanceOf[String] shouldEqual true
    draw.choice(Triangle.index) shouldEqual Triangle.repr
    draw.choice(Triangle.index).isInstanceOf[String] shouldEqual true
  }
}
