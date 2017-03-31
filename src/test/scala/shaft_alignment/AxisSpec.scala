package shaft_alignment

import org.scalatest._

class AxisSpec extends FlatSpec with Matchers {
  "The axis class" should "has the x point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.x.isInstanceOf[Int] shouldEqual true
    axis.x shouldEqual 0
  }

  "The axis class" should "has a setter for x point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setX(10) shouldEqual 10
    axis.setX(10).isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "has a getter for x point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setX(500) shouldEqual 500
    axis.getX() shouldEqual 500
    axis.getX().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "increase the x point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setX(100) shouldEqual 100
    axis.increaseX(50) shouldEqual 50
    axis.increaseX(5).isInstanceOf[Int] shouldEqual true
    axis.getX() shouldEqual 155
  }

  "The axis class" should "decrease the x point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setX(100) shouldEqual 100
    axis.decreaseX(60) shouldEqual 60
    axis.decreaseX(5).isInstanceOf[Int] shouldEqual true
    axis.getX() shouldEqual 35
  }

  "The axis class" should "has the y point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.y.isInstanceOf[Int] shouldEqual true
    axis.y shouldEqual 0
  }

  "The axis class" should "has a setter for y point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setY(700) shouldEqual 700
    axis.setY(700).isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "has a getter for y point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setY(700) shouldEqual 700
    axis.getY() shouldEqual 700
    axis.getY().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "increase the y point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setY(150) shouldEqual 150
    axis.increaseY(50) shouldEqual 50
    axis.increaseY(5).isInstanceOf[Int] shouldEqual true
    axis.getY() shouldEqual 205
  }

  "The axis class" should "decrease the y point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setY(300) shouldEqual 300
    axis.decreaseY(100) shouldEqual 100
    axis.decreaseY(50).isInstanceOf[Int] shouldEqual true
    axis.getY() shouldEqual 150
  }

  "The axis class" should "has the z point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.z.isInstanceOf[Int] shouldEqual true
    axis.z shouldEqual 0
  }

  "The axis class" should "has a setter for z point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setZ(800) shouldEqual 800
    axis.setZ(900).isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "has a getter for z point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setZ(800) shouldEqual 800
    axis.getZ() shouldEqual 800
    axis.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "increase the z point" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.setZ(150) shouldEqual 150
    axis.increaseZ(100) shouldEqual 100
    axis.increaseZ(50).isInstanceOf[Int] shouldEqual true
    axis.getZ() shouldEqual 300
  }

  "The axis class" should "decrease the z points" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseZ(10)
    axis.decreaseZ(5)
    axis.z shouldEqual 5
    axis.getZ() shouldEqual 5
    axis.getZ().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "decrease the x points" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.decreaseX(5)
    axis.x shouldEqual -5
    axis.getX() shouldEqual -5
    axis.getX().isInstanceOf[Int] shouldEqual true

    axis.increaseX(15)
    axis.decreaseX(5)
    axis.x shouldEqual 5
    axis.getX() shouldEqual 5
    axis.getX().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "increase the y points" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseY(10)
    axis.y shouldEqual 10
    axis.getY() shouldEqual 10
    axis.getY().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "decrease the y points" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseY(10)
    axis.decreaseY(5)
    axis.y shouldEqual 5
    axis.getY().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "divide x by a default value" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseX(10)
    axis.divX() shouldEqual 5
    axis.divX().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "divide y by a default value" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseY(10)
    axis.divY() shouldEqual 5
    axis.divY().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "divide z by a default value" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseZ(10)
    axis.divZ() shouldEqual 5
    axis.divZ().isInstanceOf[Int] shouldEqual true
  }

  "The axis class" should "show an history of ins for x" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseX(10)
    axis.increaseHistoryX() shouldEqual List(0)
    axis.increaseHistoryX().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryX().length shouldEqual 1

    axis.increaseX(20)
    axis.increaseHistoryX() shouldEqual List(0,10)
    axis.increaseHistoryX().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryX().length shouldEqual 2

    axis.increaseX(30)
    axis.increaseHistoryX() shouldEqual List(0,10,30)
    axis.increaseHistoryX().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryX().length shouldEqual 3
  }

  "The axis class" should "show an history observable of ins for x" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseX(10)
    axis.getX() shouldEqual 10
    axis.getX().isInstanceOf[Int] shouldEqual true

    axis.increaseX(20)
    axis.getX() shouldEqual 30
    axis.getX().isInstanceOf[Int] shouldEqual true

    axis.increaseX(30)
    axis.getX() shouldEqual 60
    axis.getX().isInstanceOf[Int] shouldEqual true

    val increasedHistoryX = axis.observableHistoryOfIncreasedX().map(v => v*2).toBlocking.toList
    increasedHistoryX shouldEqual List(0,20,60)
    increasedHistoryX.isInstanceOf[List[Int]] shouldEqual true
    increasedHistoryX.length shouldEqual 3
  }

  "The axis class" should "show an history observable of ins for y" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseY(10)
    axis.getY() shouldEqual 10
    axis.getY().isInstanceOf[Int] shouldEqual true

    axis.increaseY(20)
    axis.getY() shouldEqual 30
    axis.getY().isInstanceOf[Int] shouldEqual true

    axis.increaseY(30)
    axis.getY() shouldEqual 60
    axis.getY().isInstanceOf[Int] shouldEqual true

    var increasedHistoryY = axis.observableHistoryOfIncreasedY().map(v => v*2).toBlocking.toList
    increasedHistoryY shouldEqual List(0,20,60)
    increasedHistoryY.isInstanceOf[List[Int]] shouldEqual true
    increasedHistoryY.length shouldEqual 3
  }

  "The axis class" should "show an history observable of ins for z" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseZ(10)
    axis.getZ() shouldEqual 10
    axis.getZ().isInstanceOf[Int] shouldEqual true

    axis.increaseZ(20)
    axis.getZ() shouldEqual 30
    axis.getZ().isInstanceOf[Int] shouldEqual true

    axis.increaseZ(30)
    axis.getZ() shouldEqual 60
    axis.getZ().isInstanceOf[Int] shouldEqual true

    var increasedHistoryY = axis.observableHistoryOfIncreasedZ().map(v => v*2).toBlocking.toList
    increasedHistoryY shouldEqual List(0,20,60)
    increasedHistoryY.isInstanceOf[List[Int]] shouldEqual true
    increasedHistoryY.length shouldEqual 3
  }

  "The axis class" should "show an history of ins for y" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseY(10)
    axis.increaseHistoryY() shouldEqual List(0)
    axis.increaseHistoryY().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryY().length shouldEqual 1

    axis.increaseY(20)
    axis.increaseHistoryY() shouldEqual List(0,10)
    axis.increaseHistoryY().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryY().length shouldEqual 2

    axis.increaseY(30)
    axis.increaseHistoryY() shouldEqual List(0,10,30)
    axis.increaseHistoryY().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryY().length shouldEqual 3
  }

  "The axis class" should "show an history of ins outs for z" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseZ(10)
    axis.increaseHistoryZ() shouldEqual List(0)
    axis.increaseHistoryZ().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryZ().length shouldEqual 1

    axis.increaseZ(20)
    axis.increaseHistoryZ() shouldEqual List(0,10)
    axis.increaseHistoryZ().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryZ().length shouldEqual 2

    axis.increaseZ(30)
    axis.increaseHistoryZ() shouldEqual List(0,10,30)
    axis.increaseHistoryZ().isInstanceOf[List[Int]] shouldEqual true
    axis.increaseHistoryZ().length shouldEqual 3
  }

  "The axis class" should "show an history of outs for x" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseX(10)
    axis.decreaseX(5)
    axis.decreaseHistoryX() shouldEqual List(0,5)
    axis.decreaseHistoryX().isInstanceOf[List[Int]] shouldEqual true
    axis.decreaseHistoryX().length shouldEqual 2

    axis.increaseX(20)
    axis.decreaseX(10)
    axis.decreaseHistoryX() shouldEqual List(0,5,15)
    axis.decreaseHistoryX().isInstanceOf[List[Int]] shouldEqual true
    axis.decreaseHistoryX().length shouldEqual 3
  }

  "The axis class" should "show a history of observable outs for x" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseX(10)
    axis.decreaseX(5)
    val decreasedHistoryX1 = axis.observableHistoryOfDecreasedX().map(v => v*2).toBlocking.toList
    decreasedHistoryX1 shouldEqual List(0,10)
    decreasedHistoryX1.isInstanceOf[List[Int]] shouldEqual true
    decreasedHistoryX1.length shouldEqual 2

    axis.increaseX(20)
    axis.decreaseX(10)
    val decreasedHistoryX2 = axis.observableHistoryOfDecreasedX().map(v => v*2).toBlocking.toList
    decreasedHistoryX2 shouldEqual List(0,10,30)
    decreasedHistoryX2.isInstanceOf[List[Int]] shouldEqual true
    decreasedHistoryX2.length shouldEqual 3
  }

  "The axis class" should "show an history of outs for y" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseY(10)
    axis.decreaseY(5)
    axis.decreaseHistoryY() shouldEqual List(0,5)
    axis.decreaseHistoryY().isInstanceOf[List[Int]] shouldEqual true
    axis.decreaseHistoryY().length shouldEqual 2

    axis.increaseY(20)
    axis.decreaseY(10)
    axis.decreaseHistoryY() shouldEqual List(0,5,15)
    axis.decreaseHistoryY().isInstanceOf[List[Int]] shouldEqual true
    axis.decreaseHistoryY().length shouldEqual 3
  }

  "The axis class" should "show a history of observable outs for y" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseY(10)
    axis.decreaseY(5)
    val historyDecreasedY1 = axis.observableHistoryOfDecreasedY().map(v => v*2).toBlocking.toList
    historyDecreasedY1 shouldEqual List(0,10)
    historyDecreasedY1.isInstanceOf[List[Int]]
    historyDecreasedY1.length shouldEqual 2

    axis.increaseY(20)
    axis.decreaseY(10)
    val historyDecreasedY2 = axis.observableHistoryOfDecreasedY().map(v => v*2).toBlocking.toList
    historyDecreasedY2 shouldEqual List(0,10,30)
    historyDecreasedY2.isInstanceOf[List[Int]]
    historyDecreasedY2.length shouldEqual 3
  }

  "The axis class" should "show an history of outs for z" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseZ(10)
    axis.decreaseZ(5)
    axis.decreaseHistoryZ() shouldEqual List(0,5)
    axis.decreaseHistoryZ().isInstanceOf[List[Int]]
    axis.decreaseHistoryZ().length shouldEqual 2

    axis.increaseZ(20)
    axis.decreaseZ(10)
    axis.decreaseHistoryZ() shouldEqual List(0,5,15)
    axis.decreaseHistoryZ().isInstanceOf[List[Int]]
    axis.decreaseHistoryZ().length shouldEqual 3
  }

  "The axis class" should "show a history of observable outs for z" in {
    val axis = new Axis()

    axis.isInstanceOf[Axis] shouldEqual true

    axis.increaseZ(10)
    axis.decreaseZ(5)
    val historyDecreasedY1 = axis.observableHistoryOfDecreasedZ().map(v => v*2).toBlocking.toList
    historyDecreasedY1 shouldEqual List(0,10)
    historyDecreasedY1.isInstanceOf[List[Int]]
    historyDecreasedY1.length shouldEqual 2

    axis.increaseZ(20)
    axis.decreaseZ(10)
    val historyDecreasedY2 = axis.observableHistoryOfDecreasedZ().map(v => v*2).toBlocking.toList
    historyDecreasedY2 shouldEqual List(0,10,30)
    historyDecreasedY2.isInstanceOf[List[Int]]
    historyDecreasedY2.length shouldEqual 3
  }
}
