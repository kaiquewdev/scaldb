package example

import org.scalatest._

class PointSpec extends FlatSpec with Matchers {
  "The point class" should "has value" in {
    val point = new Point()
    point.value shouldEqual 0
  }    
}   
