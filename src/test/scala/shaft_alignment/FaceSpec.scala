package shaft_alignment

import org.scalatest._

class FaceSpec extends FlatSpec with Matchers {
  "The face class" should "have their own axis positions" in {
    val face = new Face()

    face.x shouldEqual 0
    face.getX() shouldEqual 0
    face.setX(1000)
    face.getX() shouldEqual 1000

    face.y shouldEqual 0
    face.getY() shouldEqual 0
    face.setY(2000)
    face.getY() shouldEqual 2000

    face.z shouldEqual 0
    face.getZ() shouldEqual 0
    face.setZ(3000)
    face.getZ() shouldEqual 3000
  }

  "The face class" should "have their top with axis instantiated" in {
    val face = new Face()

    face.top.first.x shouldEqual 0
    face.top.first.getX() shouldEqual 0
    face.top.first.setX(1000)
    face.top.first.getX() shouldEqual 1000

    face.top.first.y shouldEqual 0
    face.top.first.getY() shouldEqual 0
    face.top.first.setY(2000)
    face.top.first.getY() shouldEqual 2000

    face.top.first.z shouldEqual 0
    face.top.first.getZ() shouldEqual 0
    face.top.first.setZ(3000)
    face.top.first.getZ() shouldEqual 3000

    face.top.last.x shouldEqual 0
    face.top.last.getX() shouldEqual 0
    face.top.last.setX(1000)
    face.top.last.getX() shouldEqual 1000

    face.top.last.y shouldEqual 0
    face.top.last.getY() shouldEqual 0
    face.top.last.setY(2000)
    face.top.last.getY() shouldEqual 2000

    face.top.last.z shouldEqual 0
    face.top.last.getZ() shouldEqual 0
    face.top.last.setZ(3000)
    face.top.last.getZ() shouldEqual 3000
  }

  "The face class" should "have their left with axis instantiated" in {
    val face = new Face()
    face.left.first.x shouldEqual 0
    face.left.first.y shouldEqual 0
    face.left.first.z shouldEqual 0
    face.left.last.x shouldEqual 0
    face.left.last.y shouldEqual 0
    face.left.last.z shouldEqual 0
  }

  "The face class" should "have their bottom with axis instantiated" in {
    val face = new Face()
    face.bottom.first.x shouldEqual 0
    face.bottom.first.y shouldEqual 0
    face.bottom.first.z shouldEqual 0
    face.bottom.last.x shouldEqual 0
    face.bottom.last.y shouldEqual 0
    face.bottom.last.z shouldEqual 0
  }

  "The face class" should "have their right with axis instantiated" in {
    val face = new Face()

    face.right.first.x shouldEqual 0
    face.right.first.getX() shouldEqual 0
    face.right.first.setX(1000)
    face.right.first.getX() shouldEqual 1000

    face.right.first.y shouldEqual 0
    face.right.first.getY() shouldEqual 0
    face.right.first.setY(2000)
    face.right.first.getY() shouldEqual 2000

    face.right.first.z shouldEqual 0
    face.right.first.getZ() shouldEqual 0
    face.right.first.setZ(3000)
    face.right.first.getZ() shouldEqual 3000

    face.right.last.x shouldEqual 0
    face.right.last.getX() shouldEqual 0
    face.right.last.setX(1000)
    face.right.last.getX() shouldEqual 1000

    face.right.last.y shouldEqual 0
    face.right.last.getY() shouldEqual 0
    face.right.last.setY(2000)
    face.right.last.getY() shouldEqual 2000

    face.right.last.z shouldEqual 0
    face.right.last.getZ() shouldEqual 0
    face.right.last.setZ(3000)
    face.right.last.getZ() shouldEqual 3000
  }

  "The face class" should "have a default draw" in {
    val face = new Face()
    face.drawFormatIndex shouldEqual 0
    face.drawFormatName shouldEqual "square"
  }
}
