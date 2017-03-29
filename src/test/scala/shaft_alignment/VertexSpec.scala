package shaft_alignment

import org.scalatest._

class VertexSpec extends FlatSpec with Matchers {
  "The vertex class" should "have a type" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true
   }

  "The vertex class" should "have a point value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.value shouldEqual 0
  }

  "The vertex class" should "have a integer type" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.value.isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a raw setter for point value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.setPointValue(20) shouldEqual 20
  }

  "The vertex class" should "have a integer type the point value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.value.isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a raw method to set a value of the point" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.setPointValue(20) shouldEqual 20
   }

   "The vertex class" should "have a raw method to get a value of the point" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.setPointValue(20) shouldEqual 20
    vertex.getPointValue() shouldEqual 20
   }

   "The vertex class" should "have a raw method to verify the type of getter" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.getPointValue().isInstanceOf[Int] shouldEqual true
   }

   "The vertex class" should "have a raw method to verify the type of setter" in {
     val vertex = new Vertex()

     vertex.isInstanceOf[Vertex] shouldEqual true

     vertex.setPointValue(10).isInstanceOf[Int] shouldEqual true
   }

   "The vertex class" should "have a nested method to set a value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.setValue(30) shouldEqual 30
   }

   "The vertex class" should "have a nested method type boolean comparison" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.setValue(30).isInstanceOf[Int] shouldEqual true
   }

    //vertex.point.getValue() shouldEqual 30
    //vertex.point.getValue().isInstanceOf[Int] shouldEqual true
}
