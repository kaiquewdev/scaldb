package shaft_alignment

import org.scalatest._

class RotationSpec extends FlatSpec with Matchers {
  "The rotation class" should "have a degree" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.degree shouldEqual 0
    rotation.degree.isInstanceOf[Int] shouldEqual true

    rotation.getDeg() shouldEqual 0
    rotation.setDeg(75)
    rotation.getDeg() shouldEqual 75
    rotation.getDeg().isInstanceOf[Int] shouldEqual true
  }

  "The rotation class" should "have getter and setter" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.degree shouldEqual 0
    rotation.degree.isInstanceOf[Int] shouldEqual true

    rotation.setDeg(110)
    rotation.getDeg() shouldEqual 110
    rotation.getDeg().isInstanceOf[Int] shouldEqual true

    rotation.setDeg(720)
    rotation.getDeg() shouldEqual 720
    rotation.getDeg().isInstanceOf[Int] shouldEqual true
  }

  "The rotation class" should "have an degree comparison to not equal zero" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.degree shouldEqual 0
    rotation.degree.isInstanceOf[Int] shouldEqual true

    rotation.setDeg(10)
    rotation.getDeg() shouldEqual 10
    rotation.getDeg().isInstanceOf[Int] shouldEqual true

    rotation.degNotEqZero() shouldEqual true
    rotation.degNotEqZero().isInstanceOf[Boolean] shouldEqual true
  }

  "The rotation class" should "be increase" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.degree shouldEqual 0
    rotation.degree.isInstanceOf[Int] shouldEqual true
    rotation.getDeg() shouldEqual 0
    rotation.getDeg().isInstanceOf[Int] shouldEqual true

    rotation.increase(10)
    rotation.degree shouldEqual 10
    rotation.degree.isInstanceOf[Int] shouldEqual true
    rotation.getDeg() shouldEqual 10
    rotation.getDeg().isInstanceOf[Int] shouldEqual true

    rotation.increase(20)
    rotation.degree shouldEqual 30
    rotation.degree.isInstanceOf[Int]
    rotation.getDeg() shouldEqual 30
    rotation.getDeg().isInstanceOf[Int]
  }

  "The rotation class" should "be decrease" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(50)
    rotation.degree shouldEqual 50
    rotation.degree.isInstanceOf[Int] shouldEqual true

    rotation.decrease(25)
    rotation.degree shouldEqual 25
    rotation.degree.isInstanceOf[Int] shouldEqual true

    rotation.decrease(5)
    rotation.degree shouldEqual 20
    rotation.degree.isInstanceOf[Int] shouldEqual true
  }

  "The rotation class" should "have increased states" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(10)
    rotation.increasedStates shouldEqual List(0)
    rotation.increasedStates.isInstanceOf[List[Int]] shouldEqual true
    rotation.increasedStates.length shouldEqual 1

    rotation.increase(20)
    rotation.increasedStates shouldEqual List(0,10)
    rotation.increasedStates.isInstanceOf[List[Int]] shouldEqual true
    rotation.increasedStates.length shouldEqual 2

    rotation.increase(30)
    rotation.increasedStates shouldEqual List(0,10,30)
    rotation.increasedStates.isInstanceOf[List[Int]] shouldEqual true
    rotation.increasedStates.length shouldEqual 3
  }

  "The rotation class" should "have decreased states" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(10)
    rotation.increasedStates shouldEqual List(0)
    rotation.increasedStates.length shouldEqual 1

    rotation.increase(20)
    rotation.increasedStates shouldEqual List(0,10)
    rotation.increasedStates.length shouldEqual 2

    rotation.decreasedStates shouldEqual List(0)
    rotation.decreasedStates.length shouldEqual 1

    rotation.decrease(5)
    rotation.decreasedStates shouldEqual List(0,30)
    rotation.decreasedStates.length shouldEqual 2

    rotation.decrease(10)
    rotation.decreasedStates shouldEqual List(0,30,25)
    rotation.decreasedStates.length shouldEqual 3
  }

  "The rotation class" should "have an observable increased states" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(10)
    rotation.increase(15)
    rotation.increase(5)
    val increasedStates = rotation.observableIncreasedStates().map(v => v*2).toBlocking.toList
    increasedStates shouldEqual List(0,20,50)
    increasedStates.length shouldEqual 3
  }

  "The rotation class" should "have an observable decreased states" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(10)
    rotation.decrease(5)
    rotation.increase(20)
    rotation.decrease(5)
    rotation.increase(10)
    rotation.decrease(5)

    val decreasedStates = rotation.observableDecreasedStates().map(v => v*2).toBlocking.toList
    decreasedStates shouldEqual List(0,20,50,60)
    decreasedStates.length shouldEqual 4
  }
}
