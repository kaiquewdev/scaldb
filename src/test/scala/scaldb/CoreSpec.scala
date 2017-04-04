package scaldb

import org.scalatest._

class coreStringSpec extends FlatSpec with Matchers {
  val coreString = new CoreString()

  "The coreString class" should "have an type" in {
    coreString.isInstanceOf[CoreString] shouldEqual true
  }

  "The coreString class" should "have a setter for a string" in {
    coreString.setString("scaldb_key_value","scaldb_raw_value") shouldEqual "scaldb_raw_value"
  }

  "The coreString class" should "have a setter for a string key returning a string type" in {
    coreString.setString("scaldb_key_type","scaldb_type_value").isInstanceOf[String] shouldEqual true
  }

  "The coreString class" should "have a getter for a string key" in {
    coreString.getString("scaldb_key_value") shouldEqual "scaldb_raw_value"
  }

  "The coreString class" should "have a getter for string key with those type" in {
    coreString.getString("scaldb_key_value").isInstanceOf[String] shouldEqual true
  }

  "The coreString class" should "have a getter with a default value if the key does not exists" in {
    coreString.getString("scaldb_key_value_non_presence","default_value") shouldEqual "default_value"
  }

  "The coreString class" should "have a setter overwrite key" in {
    coreString.setString("scaldb_key_value","scaldb_raw_value_overwritted") shouldEqual "scaldb_raw_value_overwritted"
    coreString.getString("scaldb_key_value") shouldEqual "scaldb_raw_value_overwritted"
  }
}

class coreIntSpec extends FlatSpec with Matchers {
  val coreInt = new CoreInt()

  "The coreInt class" should "have an type" in {
    coreInt.isInstanceOf[CoreInt] shouldEqual true
  }

  "The coreInt class" should "have a setter for int" in {
    coreInt.setInt("scaldb_key_value",0) shouldEqual 0
  }

  "The coreInt class" should "have a setter for a int key returning a int type" in {
    coreInt.setInt("scaldb_key_value",0).isInstanceOf[Int] shouldEqual true
  }

  "The coreInt class" should "have a getter for a int key" in {
    coreInt.getInt("scaldb_key_value") shouldEqual 0
  }
}
