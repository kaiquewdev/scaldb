package shaft_alignment

import org.scalatest._

class FaceSpec extends FlatSpec with Matchers {
  "The face class" should "have their own axis positions" in {
    val face = new Face()

    face.isInstanceOf[Face] shouldEqual true

    face.x shouldEqual 0
    face.x.isInstanceOf[Int] shouldEqual true
    face.getX() shouldEqual 0
    face.getX().isInstanceOf[Int] shouldEqual true
    face.setX(1000)
    face.getX() shouldEqual 1000
    face.getX().isInstanceOf[Int] shouldEqual true

    face.y shouldEqual 0
    face.y.isInstanceOf[Int] shouldEqual true
    face.getY() shouldEqual 0
    face.getY().isInstanceOf[Int] shouldEqual true
    face.setY(2000)
    face.getY() shouldEqual 2000
    face.getY().isInstanceOf[Int] shouldEqual true

    face.z shouldEqual 0
    face.z.isInstanceOf[Int] shouldEqual true
    face.getZ() shouldEqual 0
    face.getZ().isInstanceOf[Int] shouldEqual true
    face.setZ(3000)
    face.getZ() shouldEqual 3000
    face.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The face class" should "have their top with axis instantiated" in {
    val face = new Face()

    face.isInstanceOf[Face] shouldEqual true

    face.top.isInstanceOf[Edge] shouldEqual true
    face.top.first.isInstanceOf[Axis] shouldEqual true
    face.top.first.x shouldEqual 0
    face.top.first.x.isInstanceOf[Int] shouldEqual true
    face.top.first.getX() shouldEqual 0
    face.top.first.getX().isInstanceOf[Int] shouldEqual true
    face.top.first.setX(1000)
    face.top.first.getX() shouldEqual 1000
    face.top.first.getX().isInstanceOf[Int] shouldEqual true

    face.top.isInstanceOf[Edge] shouldEqual true
    face.top.first.isInstanceOf[Axis] shouldEqual true
    face.top.first.y shouldEqual 0
    face.top.first.y.isInstanceOf[Int] shouldEqual true
    face.top.first.getY() shouldEqual 0
    face.top.first.getY().isInstanceOf[Int]
    face.top.first.setY(2000)
    face.top.first.getY() shouldEqual 2000
    face.top.first.getY().isInstanceOf[Int] shouldEqual true

    face.top.isInstanceOf[Edge] shouldEqual true
    face.top.first.isInstanceOf[Axis] shouldEqual true
    face.top.first.z shouldEqual 0
    face.top.first.z.isInstanceOf[Int] shouldEqual true
    face.top.first.getZ() shouldEqual 0
    face.top.first.getZ().isInstanceOf[Int] shouldEqual true
    face.top.first.setZ(3000)
    face.top.first.getZ() shouldEqual 3000
    face.top.first.getZ().isInstanceOf[Int] shouldEqual true

    face.top.isInstanceOf[Edge] shouldEqual true
    face.top.last.isInstanceOf[Axis] shouldEqual true
    face.top.last.x shouldEqual 0
    face.top.last.x.isInstanceOf[Int] shouldEqual true
    face.top.last.getX() shouldEqual 0
    face.top.last.getX().isInstanceOf[Int] shouldEqual true
    face.top.last.setX(1000)
    face.top.last.getX() shouldEqual 1000
    face.top.last.getX().isInstanceOf[Int] shouldEqual true

    face.top.isInstanceOf[Edge] shouldEqual true
    face.top.last.isInstanceOf[Axis] shouldEqual true
    face.top.last.y shouldEqual 0
    face.top.last.y.isInstanceOf[Int] shouldEqual true
    face.top.last.getY() shouldEqual 0
    face.top.last.getY().isInstanceOf[Int] shouldEqual true
    face.top.last.setY(2000)
    face.top.last.getY() shouldEqual 2000
    face.top.last.getY().isInstanceOf[Int] shouldEqual true

    face.top.isInstanceOf[Edge] shouldEqual true
    face.top.last.isInstanceOf[Axis] shouldEqual true
    face.top.last.z shouldEqual 0
    face.top.last.z.isInstanceOf[Int] shouldEqual true
    face.top.last.getZ() shouldEqual 0
    face.top.last.getZ().isInstanceOf[Int] shouldEqual true
    face.top.last.setZ(3000)
    face.top.last.getZ() shouldEqual 3000
    face.top.last.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The face class" should "have their left with axis instantiated" in {
    val face = new Face()

    face.isInstanceOf[Face] shouldEqual true

    face.left.isInstanceOf[Edge] shouldEqual true
    face.left.first.isInstanceOf[Axis] shouldEqual true
    face.left.first.x shouldEqual 0
    face.left.first.x.isInstanceOf[Int] shouldEqual true
    face.left.first.getX() shouldEqual 0
    face.left.first.getX().isInstanceOf[Int] shouldEqual true
    face.left.first.setX(1000)
    face.left.first.getX() shouldEqual 1000

    face.left.isInstanceOf[Edge] shouldEqual true
    face.left.first.isInstanceOf[Axis] shouldEqual true
    face.left.first.y shouldEqual 0
    face.left.first.y.isInstanceOf[Int] shouldEqual true
    face.left.first.getY().isInstanceOf[Int] shouldEqual true

    face.left.isInstanceOf[Edge] shouldEqual true
    face.left.first.isInstanceOf[Axis] shouldEqual true
    face.left.first.z shouldEqual 0
    face.left.first.z.isInstanceOf[Int] shouldEqual true
    face.left.first.getZ().isInstanceOf[Int] shouldEqual true

    face.left.isInstanceOf[Edge] shouldEqual true
    face.left.last.isInstanceOf[Axis] shouldEqual true
    face.left.last.x shouldEqual 0
    face.left.last.x.isInstanceOf[Int] shouldEqual true
    face.left.last.getX().isInstanceOf[Int] shouldEqual true

    face.left.isInstanceOf[Edge]
    face.left.last.isInstanceOf[Axis] shouldEqual true
    face.left.last.y shouldEqual 0
    face.left.last.y.isInstanceOf[Int] shouldEqual true
    face.left.last.getY().isInstanceOf[Int] shouldEqual true

    face.left.isInstanceOf[Edge]
    face.left.last.isInstanceOf[Axis]
    face.left.last.z shouldEqual 0
    face.left.last.z.isInstanceOf[Int] shouldEqual true
    face.left.last.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The face class" should "have their bottom with axis instantiated" in {
    val face = new Face()

    face.isInstanceOf[Face] shouldEqual true

    face.bottom.isInstanceOf[Edge] shouldEqual true
    face.bottom.first.isInstanceOf[Axis] shouldEqual true
    face.bottom.first.x shouldEqual 0
    face.bottom.first.x.isInstanceOf[Int] shouldEqual true
    face.bottom.first.getX() shouldEqual 0
    face.bottom.first.setX(1000)
    face.bottom.first.getX() shouldEqual 1000

    face.bottom.isInstanceOf[Edge] shouldEqual true
    face.bottom.first.isInstanceOf[Axis] shouldEqual true
    face.bottom.first.y shouldEqual 0
    face.bottom.first.y.isInstanceOf[Int] shouldEqual true
    face.bottom.first.getY() shouldEqual 0
    face.bottom.first.setY(1000)
    face.bottom.first.getY() shouldEqual 1000

    face.bottom.isInstanceOf[Edge] shouldEqual true
    face.bottom.first.isInstanceOf[Axis] shouldEqual true
    face.bottom.first.z shouldEqual 0
    face.bottom.first.z.isInstanceOf[Int] shouldEqual true

    face.bottom.isInstanceOf[Edge] shouldEqual true
    face.bottom.isInstanceOf[Axis] shouldEqual true
    face.bottom.last.x shouldEqual 0
    face.bottom.last.x.isInstanceOf[Int] shouldEqual true
    face.bottom.last.getX() shouldEqual 0
    face.bottom.last.setX(1000)
    face.bottom.last.getX() shouldEqual 1000

    face.bottom.isInstanceOf[Edge] shouldEqual true
    face.bottom.last.isInstanceOf[Axis] shouldEqual true
    face.bottom.last.y shouldEqual 0
    face.bottom.last.y.isInstanceOf[Int] shouldEqual true
    face.bottom.last.setY(1000)
    face.bottom.last.getY() shouldEqual 1000

    face.bottom.isInstanceOf[Edge] shouldEqual true
    face.bottom.last.isInstanceOf[Axis] shouldEqual true
    face.bottom.last.z shouldEqual 0
    face.bottom.last.z.isInstanceOf[Int] shouldEqual true
    face.bottom.last.getZ() shouldEqual 0
    face.bottom.last.getZ().isInstanceOf[Int] shouldEqual true
    face.bottom.last.setZ(1000)
    face.bottom.last.getZ() shouldEqual 1000
    face.bottom.last.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The face class" should "have their right with axis instantiated" in {
    val face = new Face()

    face.isInstanceOf[Face] shouldEqual true

    face.right.isInstanceOf[Edge] shouldEqual true
    face.right.first.isInstanceOf[Axis] shouldEqual true
    face.right.first.x shouldEqual 0
    face.right.first.x.isInstanceOf[Int] shouldEqual true
    face.right.first.getX() shouldEqual 0
    face.right.first.getX().isInstanceOf[Int] shouldEqual true
    face.right.first.setX(1000)
    face.right.first.getX() shouldEqual 1000
    face.right.first.getX().isInstanceOf[Int] shouldEqual true

    face.right.isInstanceOf[Edge] shouldEqual true
    face.right.first.isInstanceOf[Axis] shouldEqual true
    face.right.first.y shouldEqual 0
    face.right.first.y.isInstanceOf[Int] shouldEqual true
    face.right.first.getY() shouldEqual 0
    face.right.first.getY().isInstanceOf[Int] shouldEqual true
    face.right.first.setY(2000)
    face.right.first.getY() shouldEqual 2000
    face.right.first.getY().isInstanceOf[Int] shouldEqual true

    face.right.isInstanceOf[Edge] shouldEqual true
    face.right.first.isInstanceOf[Axis] shouldEqual true
    face.right.first.z.isInstanceOf[Int] shouldEqual true
    face.right.first.z shouldEqual 0
    face.right.first.getZ() shouldEqual 0
    face.right.first.setZ(3000)
    face.right.first.getZ() shouldEqual 3000

    face.right.isInstanceOf[Edge] shouldEqual true
    face.right.last.isInstanceOf[Axis] shouldEqual true
    face.right.last.x shouldEqual 0
    face.right.last.x.isInstanceOf[Int] shouldEqual true
    face.right.last.getX() shouldEqual 0
    face.right.last.getX().isInstanceOf[Int] shouldEqual true
    face.right.last.setX(1000)
    face.right.last.getX() shouldEqual 1000
    face.right.last.getX().isInstanceOf[Int] shouldEqual true

    face.right.isInstanceOf[Edge] shouldEqual true
    face.right.last.isInstanceOf[Axis] shouldEqual true
    face.right.last.y shouldEqual 0
    face.right.last.y.isInstanceOf[Int] shouldEqual true
    face.right.last.getY() shouldEqual 0
    face.right.last.getY().isInstanceOf[Int] shouldEqual true
    face.right.last.setY(2000)
    face.right.last.getY() shouldEqual 2000
    face.right.last.getY().isInstanceOf[Int] shouldEqual true

    face.right.isInstanceOf[Edge] shouldEqual true
    face.right.last.isInstanceOf[Axis] shouldEqual true
    face.right.last.z shouldEqual 0
    face.right.last.z.isInstanceOf[Int] shouldEqual true
    face.right.last.getZ() shouldEqual 0
    face.right.last.getZ().isInstanceOf[Int] shouldEqual true
    face.right.last.setZ(3000)
    face.right.last.getZ() shouldEqual 3000
    face.right.last.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The face class" should "have a default draw" in {
    val face = new Face()

    face.isInstanceOf[Face] shouldEqual true

    face.drawFormatIndex shouldEqual 0
    face.drawFormatIndex.isInstanceOf[Int] shouldEqual true
    face.drawFormatName shouldEqual "square"
    face.drawFormatName.isInstanceOf[String] shouldEqual true
  }
}
