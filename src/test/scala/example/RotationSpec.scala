package example

import org.scalatest._

class RotationSpec extends FlatSpec with Matchers {
  "The rotation class" should "have a degree" in {
    val rotation = new Rotation()
    rotation.degree shouldEqual 0
  }

  "The rotation class" should "be increase" in {
    val rotation = new Rotation()
    rotation.degree shouldEqual 0
    rotation.increase(10)
    rotation.degree shouldEqual 10
    rotation.increase(20)
    rotation.degree shouldEqual 30
  }

  "The rotation class" should "be decrease" in {
    val rotation = new Rotation()
    rotation.increase(50)
    rotation.degree shouldEqual 50
    rotation.decrease(25)
    rotation.degree shouldEqual 25
    rotation.decrease(5)
    rotation.degree shouldEqual 20
  }

  "The rotation class" should "have increased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.increasedStates shouldEqual List(0)
    rotation.increase(20)
    rotation.increasedStates shouldEqual List(0,10)
    rotation.increase(30)
    rotation.increasedStates shouldEqual List(0,10,30)
  }

  "The rotation class" should "have decreased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.increasedStates shouldEqual List(0)
    rotation.increase(20)
    rotation.increasedStates shouldEqual List(0,10)
    rotation.decreasedStates shouldEqual List(0)
    rotation.decrease(5)
    rotation.decreasedStates shouldEqual List(0,30)
  }

  "The rotation class" should "have an observable increased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.increase(15)
    rotation.increase(5)
    rotation.observableIncreasedStates().map(v => v*2).toBlocking.toList shouldEqual List(0,20,50)
  }

  "The rotation class" should "have an observable decreased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.decrease(5)
    rotation.increase(20)
    rotation.decrease(5)
    rotation.increase(10)
    rotation.decrease(5)
    rotation.observableDecreasedStates().map(v => v*2).toBlocking.toList shouldEqual List(0,20,50,60)
  }
}
