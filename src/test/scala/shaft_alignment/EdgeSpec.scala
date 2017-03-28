package shaft_alignment

import org.scalatest._

class EdgeSpec extends FlatSpec with Matchers {
  "The edge class" should "have their own axis positions" in {
    val edge = new Edge()

    edge.isInstanceOf[Edge] shouldEqual true

    edge.x shouldEqual 0
    edge.x.isInstanceOf[Int] shouldEqual true
    edge.getX().isInstanceOf[Int] shouldEqual true

    edge.y shouldEqual 0
    edge.y.isInstanceOf[Int] shouldEqual true
    edge.getY().isInstanceOf[Int] shouldEqual true

    edge.z shouldEqual 0
    edge.z.isInstanceOf[Int] shouldEqual true
    edge.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The edge class" should "have a first axis" in {
    val edge = new Edge()

    edge.isInstanceOf[Edge] shouldEqual true

    edge.first.isInstanceOf[Axis] shouldEqual true
    edge.first.x shouldEqual 0
    edge.first.x.isInstanceOf[Int] shouldEqual true
    edge.first.getX().isInstanceOf[Int] shouldEqual true

    edge.first.isInstanceOf[Axis] shouldEqual true
    edge.first.y shouldEqual 0
    edge.first.y.isInstanceOf[Int] shouldEqual true
    edge.first.getY().isInstanceOf[Int] shouldEqual true

    edge.first.isInstanceOf[Axis] shouldEqual true
    edge.first.z shouldEqual 0
    edge.first.z.isInstanceOf[Int] shouldEqual true
    edge.first.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The edge class" should "have a last axis" in {
    val edge = new Edge()

    edge.isInstanceOf[Edge] shouldEqual true

    edge.last.isInstanceOf[Axis] shouldEqual true
    edge.last.x shouldEqual 0
    edge.last.getX().isInstanceOf[Int] shouldEqual true

    edge.last.isInstanceOf[Axis] shouldEqual true
    edge.last.y shouldEqual 0
    edge.last.getY().isInstanceOf[Int] shouldEqual true

    edge.last.isInstanceOf[Axis] shouldEqual true
    edge.last.z shouldEqual 0
    edge.last.getZ().isInstanceOf[Int] shouldEqual true
  }
}
