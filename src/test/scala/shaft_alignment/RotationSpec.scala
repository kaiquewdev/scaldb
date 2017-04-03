package shaft_alignment

import org.scalatest._

class RotationSpec extends FlatSpec with Matchers {
  "The rotation class" should "have a value degree" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.degree shouldEqual 0
    rotation.degree.isInstanceOf[Int] shouldEqual true
  }

  "The rotation class" should "have a getter degree" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.getDeg() shouldEqual 0
    rotation.getDeg().isInstanceOf[Int] shouldEqual true
  }

  "The rotation class" should "have a setter degree" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.setDeg(10) shouldEqual 10
    rotation.setDeg(15).isInstanceOf[Int] shouldEqual true
    rotation.getDeg() shouldEqual 15
  }

  "The rotation class" should "have a degree not equal zero" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.getDeg() shouldEqual 0
    rotation.degNotEqZero() shouldEqual false
    rotation.degNotEqZero().isInstanceOf[Boolean] shouldEqual true

    rotation.setDeg(10) shouldEqual 10
    rotation.degNotEqZero() shouldEqual true
    rotation.degNotEqZero().isInstanceOf[Boolean] shouldEqual true
  }

  "The rotation class" should "increase degree with accumulation" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(10) shouldEqual 10
    rotation.increase(15).isInstanceOf[Int] shouldEqual true

    rotation.getDeg() shouldEqual 25
    rotation.getDeg().isInstanceOf[Int] shouldEqual true
  }

  "The rotation class" should "decrease degree with accumulation" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(100) shouldEqual 100
    rotation.getDeg() shouldEqual 100
    rotation.decrease(20) shouldEqual 20
    rotation.decrease(30).isInstanceOf[Int] shouldEqual true
    rotation.getDeg() shouldEqual 50
  }

  "The rotation class" should "have increased states stored like an list" in {
    val rotation = new Rotation()

    rotation.isInstanceOf[Rotation] shouldEqual true

    rotation.increase(10) shouldEqual 10
    rotation.increasedStates shouldEqual List(0)
    rotation.increasedStates.isInstanceOf[List[Int]] shouldEqual true
    rotation.increasedStates.length shouldEqual 1

    rotation.increase(20) shouldEqual 20
    rotation.increasedStates shouldEqual List(0,10)
    rotation.increasedStates.isInstanceOf[List[Int]] shouldEqual true
    rotation.increasedStates.length shouldEqual 2

    rotation.increase(30) shouldEqual 30
    rotation.increasedStates shouldEqual List(0,10,30)
    rotation.increasedStates.isInstanceOf[List[Int]] shouldEqual true
    rotation.increasedStates.length shouldEqual 3
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
