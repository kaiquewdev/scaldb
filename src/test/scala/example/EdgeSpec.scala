package example

import org.scalatest._

class EdgeSpec extends FlatSpec with Matchers {
  "The edge class" should "have their own axis positions" in {
    val edge = new Edge()
    edge.x shouldEqual 0
    edge.y shouldEqual 0
    edge.z shouldEqual 0
  }

  "The edge class" should "have a first axis" in {
    val edge = new Edge()
    edge.first.x shouldEqual 0
    edge.first.y shouldEqual 0
    edge.first.z shouldEqual 0
  }

  "The edge class" should "have a last axis" in {
    val edge = new Edge()
    edge.last.x shouldEqual 0
    edge.last.y shouldEqual 0
    edge.last.z shouldEqual 0
  }
}
