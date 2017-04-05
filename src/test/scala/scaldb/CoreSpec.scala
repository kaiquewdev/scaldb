package scaldb

import org.scalatest._

class CoreStringSpec extends FlatSpec with Matchers {
  val coreString = new CoreString()

  "The coreString class" should "have an type" in {
    coreString.isInstanceOf[CoreString] shouldEqual true
  }

  "The coreString class" should "have a setter for a string" in {
    coreString.setString("scaldb_first_key_value","scaldb_first_raw_value") shouldEqual "scaldb_first_raw_value"
    coreString.setString("scaldb_second_key_value","scaldb_second_raw_value") shouldEqual "scaldb_second_raw_value"
  }

  "The coreString class" should "have a setter for a string key returning a string type" in {
    coreString.setString("scaldb_first_key_type","scaldb_first_type_value").isInstanceOf[String] shouldEqual true
    coreString.setString("scaldb_second_key_type","scaldb_second_type_value").isInstanceOf[String] shouldEqual true
  }

  "The coreString class" should "have a getter for a string key" in {
    coreString.getString("scaldb_first_key_value") shouldEqual "scaldb_first_raw_value"
    coreString.getString("scaldb_second_key_value") shouldEqual "scaldb_second_raw_value"
  }

  "The coreString class" should "have a getter for a string the same type as itself" in {
    coreString.getString("scaldb_first_key_value").isInstanceOf[String] shouldEqual true
    coreString.getString("scaldb_second_key_value").isInstanceOf[String] shouldEqual true
  }

  "The coreString class" should "have a getter with a default value if the key does not exists" in {
    coreString.getString("scaldb_first_key_value_non_presence","default_value") shouldEqual "default_value"
    coreString.getString("scaldb_second_key_value_non_presence","default_value") shouldEqual "default_value"
  }

  "The coreString class" should "have a setter overwrite key" in {
    coreString.setString("scaldb_first_key_value","scaldb_first_raw_value_overwritted") shouldEqual "scaldb_first_raw_value_overwritted"
    coreString.setString("scaldb_second_key_value","scaldb_second_raw_value_overwritted") shouldEqual "scaldb_second_raw_value_overwritted"
    coreString.getString("scaldb_first_key_value") shouldEqual "scaldb_first_raw_value_overwritted"
    coreString.getString("scaldb_second_key_value") shouldEqual "scaldb_second_raw_value_overwritted"
  }
}

class CoreIntSpec extends FlatSpec with Matchers {
  val coreInt = new CoreInt()

  "The coreInt class" should "have an type" in {
    coreInt.isInstanceOf[CoreInt] shouldEqual true
  }

  "The coreInt class" should "have a setter for int" in {
    coreInt.setInt("scaldb_first_key_value",0) shouldEqual 0
    coreInt.setInt("scaldb_second_key_value",2) shouldEqual 2
  }

  "The coreInt class" should "have a setter for a int key returning a int type" in {
    coreInt.setInt("scaldb_first_key_value",0).isInstanceOf[Int] shouldEqual true
    coreInt.setInt("scaldb_second_key_value",2).isInstanceOf[Int] shouldEqual true
  }

  "The coreInt class" should "have a getter for a int key" in {
    coreInt.getInt("scaldb_first_key_value") shouldEqual 0
    coreInt.getInt("scaldb_second_key_value") shouldEqual 2
  }

  "The coreInt class" should "have a getter for int the same type as itself" in {
    coreInt.getInt("scaldb_first_key_value").isInstanceOf[Int] shouldEqual true
    coreInt.getInt("scaldb_second_key_value").isInstanceOf[Int] shouldEqual true
  }

  "The coreInt class" should "have a getter with a default value if the key does not exists" in {
    coreInt.getInt("scaldb_first_key_value_non_presence",1) shouldEqual 1
    coreInt.getInt("scaldb_second_key_value_non_presence",4) shouldEqual 4
  }

  "The coreInt class" should "have a setter overwrite key" in {
    coreInt.setInt("scaldb_first_key_value",3) shouldEqual 3
    coreInt.setInt("scaldb_second_key_value",4) shouldEqual 4
    coreInt.getInt("scaldb_first_key_value") shouldEqual 3
    coreInt.getInt("scaldb_second_key_value") shouldEqual 4
  }
}

class CoreArraySpec extends FlatSpec with Matchers {
  val coreArray = new CoreArray()

  "The coreArray class" should "have an type" in {
    coreArray.isInstanceOf[CoreArray] shouldEqual true
  }

  "The coreArray class" should "have a setter for array" in {
    coreArray.setArray("scaldb_first_key",Array("scaldb_first_value")) shouldEqual Array("scaldb_first_value")
  }

  "The coreArray class" should "have a setter for an array key returning a array type" in {
    coreArray.setArray("scaldb_first_key",Array("scaldb_first_value")).isInstanceOf[Array[Any]] shouldEqual true
  }

  "The coreArray class" should "have a getter for a int key" in {
    coreArray.getArray("scaldb_first_key") shouldEqual Array("scaldb_first_value")
  }

  "The coreArray class" should "have a getter for int the same type as itself" in {
    coreArray.getArray("scaldb_first_key").isInstanceOf[Array[Any]] shouldEqual true
  }

  "The coreArray class" should "have a getter with a default value if the key does not exsits" in {
    coreArray.getArray("scaldb_first_key_non_presence",Array("default_value")) shouldEqual Array("default_value")
  }

  "The coreArray class" should "have a setter overwrite key" in {
    coreArray.setArray("scaldb_first_key",Array("scaldb_first_value","scaldb_second_value")) shouldEqual Array("scaldb_first_value","scaldb_second_value")
    coreArray.getArray("scaldb_first_key") shouldEqual Array("scaldb_first_value","scaldb_second_value")
  }
}

class CoreListSpec extends FlatSpec with Matchers {
  val coreList = new CoreList()

  "The coreList class" should "have an type" in {
    coreList.isInstanceOf[CoreList] shouldEqual true
  }

  "The coreList class" should "have a setter for list" in {
    coreList.setList("scaldb_first_key",List("scaldb_first_value")) shouldEqual List("scaldb_first_value")
  }

  "The coreList class" should "have a setter for an list key returning a list type" in {
    coreList.setList("scaldb_first_key",List("scaldb_first_value")).isInstanceOf[List[Any]] shouldEqual true
  }
}
