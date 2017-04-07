package scaldb

import org.scalatest._

class CoreLogicSpec extends FlatSpec with Matchers {
  "The coreLogic object" should "have a string binary search" in {
    CoreLogic.stringBinarySearchArray(Array("uncommon_value"),"first_value") shouldEqual -1
    assume(CoreLogic.stringBinarySearchArray(Array("uncommon_value"),"first_value").isInstanceOf[Int])
    CoreLogic.stringBinarySearchArray(Array("first_value"),"first_value") shouldEqual 0
    assume(CoreLogic.stringBinarySearchArray(Array("first_value"),"first_value").isInstanceOf[Int])
    CoreLogic.stringBinarySearchArray(Array("first_value","second_value","third_value"),"second_value") shouldEqual 1
    assume(CoreLogic.stringBinarySearchArray(Array("first_value","second_value","third_value"),"second_value").isInstanceOf[Int])
  }

  "The coreLogic object" should "have a verifier of value on an array of string" in {
    assume(!CoreLogic.hasKeyStringArray("fourth_value",Array("first_value","second_value","third_value")))
    assume(CoreLogic.hasKeyStringArray("fourth_value",Array("first_value","second_value","third_value")).isInstanceOf[Boolean])
    assume(CoreLogic.hasKeyStringArray("second_value",Array("first_value","second_value","third_value")))
    assume(CoreLogic.hasKeyStringArray("second_value",Array("first_value","second_value","third_value")).isInstanceOf[Boolean])
    assume(CoreLogic.hasKeyStringArray("third_value",Array("first_value","second_value","third_value")))
    assume(CoreLogic.hasKeyStringArray("third_value",Array("first_value","second_value","third_value")).isInstanceOf[Boolean])
  }

  "The coreLogic object" should "have a int binary search" in {
    CoreLogic.intBinarySearchArray(Array(1,2,3),4) shouldEqual -1
    CoreLogic.intBinarySearchArray(Array(1,3,4,8,7),8) shouldEqual 3
    CoreLogic.intBinarySearchArray(Array(7,5,3,9,4,2),5) shouldEqual 1
    CoreLogic.intBinarySearchArray(Array(8,3,2,10,9),2) shouldEqual 2
    CoreLogic.intBinarySearchArray(Array(15,30,45,70,100),70) shouldEqual 3
    CoreLogic.intBinarySearchArray(Array(35,450,720,60,180,137),720) shouldEqual 2
  }

  "The coreLogic object" should "have a verifier of value an array of int" in {
    assume(!CoreLogic.hasKeyIntArray(10,Array(9,7,3,4,100)))
    assume(CoreLogic.hasKeyIntArray(3,Array(10,3,12,27)))
    assume(CoreLogic.hasKeyIntArray(5,Array(60,70,5,30)))
    assume(CoreLogic.hasKeyIntArray(100,Array(60,80,15,100,20)))
    assume(CoreLogic.hasKeyIntArray(150,Array(155,300,716,150,627)))
    assume(CoreLogic.hasKeyIntArray(12000,Array(600,700,990,475,1200,630,12000,790)))
  }
}

class CoreStringSpec extends FlatSpec with Matchers {
  val coreString = new CoreString()

  "The coreString class" should "have an type" in {
    assume(coreString.isInstanceOf[CoreString])
  }

  "The coreString class" should "have a setter for a string" in {
    coreString.setString("scaldb_first_key_value","scaldb_first_raw_value") shouldEqual "scaldb_first_raw_value"
    coreString.setString("scaldb_second_key_value","scaldb_second_raw_value") shouldEqual "scaldb_second_raw_value"
    coreString.setString("scaldb_third_key_value","scaldb_third_raw_value") shouldEqual "scaldb_third_raw_value"
  }

  "The coreString class" should "have a setter for a string key returning a string type" in {
    assume(coreString.setString("scaldb_first_key_type","scaldb_first_type_value").isInstanceOf[String])
    assume(coreString.setString("scaldb_second_key_type","scaldb_second_type_value").isInstanceOf[String])
    assume(coreString.setString("scaldb_third_key_type","scaldb_third_type_value").isInstanceOf[String])
  }

  "The coreString class" should "have a getter for a string key" in {
    coreString.getString("scaldb_first_key_value") shouldEqual "scaldb_first_raw_value"
    coreString.getString("scaldb_second_key_value") shouldEqual "scaldb_second_raw_value"
    coreString.getString("scaldb_third_key_value") shouldEqual "scaldb_third_raw_value"
  }

  "The coreString class" should "have a getter for a string the same type as itself" in {
    assume(coreString.getString("scaldb_first_key_value").isInstanceOf[String])
    assume(coreString.getString("scaldb_second_key_value").isInstanceOf[String])
    assume(coreString.getString("scaldb_third_key_value").isInstanceOf[String])
  }

  "The coreString class" should "have a getter with a default value if the key does not exists" in {
    coreString.getString("scaldb_first_key_value_non_presence","default_value") shouldEqual "default_value"
    coreString.getString("scaldb_second_key_value_non_presence","default_value") shouldEqual "default_value"
    coreString.getString("scaldb_third_key_value_non_presence","default_value") shouldEqual "default_value"
  }

  "The coreString class" should "have a setter overwrite key" in {
    coreString.setString("scaldb_first_key_value","scaldb_first_raw_value_overwritted") shouldEqual "scaldb_first_raw_value_overwritted"
    coreString.setString("scaldb_second_key_value","scaldb_second_raw_value_overwritted") shouldEqual "scaldb_second_raw_value_overwritted"
    coreString.setString("scaldb_third_key_value","scaldb_third_raw_value_overwritted") shouldEqual "scaldb_third_raw_value_overwritted"
    coreString.getString("scaldb_first_key_value") shouldEqual "scaldb_first_raw_value_overwritted"
    coreString.getString("scaldb_second_key_value") shouldEqual "scaldb_second_raw_value_overwritted"
    coreString.getString("scaldb_third_key_value") shouldEqual "scaldb_third_raw_value_overwritted"
  }
}

class CoreIntSpec extends FlatSpec with Matchers {
  val coreInt = new CoreInt()

  "The coreInt class" should "have an type" in {
    assume(coreInt.isInstanceOf[CoreInt])
  }

  "The coreInt class" should "have a setter for int" in {
    coreInt.setInt("scaldb_first_key_value",0) shouldEqual 0
    coreInt.setInt("scaldb_second_key_value",2) shouldEqual 2
    coreInt.setInt("scladb_third_key_value",3) shouldEqual 3
  }

  "The coreInt class" should "have a setter for a int key returning a int type" in {
    assume(coreInt.setInt("scaldb_first_key_value",0).isInstanceOf[Int])
    assume(coreInt.setInt("scaldb_second_key_value",2).isInstanceOf[Int])
    assume(coreInt.setInt("scaldb_third_key_value",3).isInstanceOf[Int])
  }

  "The coreInt class" should "have a getter for a int key" in {
    coreInt.getInt("scaldb_first_key_value") shouldEqual 0
    coreInt.getInt("scaldb_second_key_value") shouldEqual 2
    coreInt.getInt("scaldb_third_key_value") shouldEqual 3
  }

  "The coreInt class" should "have a getter for int the same type as itself" in {
    assume(coreInt.getInt("scaldb_first_key_value").isInstanceOf[Int])
    assume(coreInt.getInt("scaldb_second_key_value").isInstanceOf[Int])
    assume(coreInt.getInt("scaldb_third_key_value").isInstanceOf[Int])
  }

  "The coreInt class" should "have a getter with a default value if the key does not exists" in {
    coreInt.getInt("scaldb_first_key_value_non_presence",1) shouldEqual 1
    coreInt.getInt("scaldb_second_key_value_non_presence",4) shouldEqual 4
    coreInt.getInt("scaldb_third_key_value_non_presence",5) shouldEqual 5
  }

  "The coreInt class" should "have a setter overwrite key" in {
    coreInt.setInt("scaldb_first_key_value",3) shouldEqual 3
    coreInt.setInt("scaldb_second_key_value",4) shouldEqual 4
    coreInt.setInt("scaldb_third_key_value",5) shouldEqual 5
    coreInt.getInt("scaldb_first_key_value") shouldEqual 3
    coreInt.getInt("scaldb_second_key_value") shouldEqual 4
    coreInt.getInt("scaldb_third_key_value") shouldEqual 5
  }
}

class CoreArraySpec extends FlatSpec with Matchers {
  val coreArray = new CoreArray()

  "The coreArray class" should "have an type" in {
    assume(coreArray.isInstanceOf[CoreArray])
  }

  "The coreArray class" should "have a setter for array" in {
    coreArray.setArray("scaldb_first_key",Array("scaldb_first_value")) shouldEqual Array("scaldb_first_value")
    coreArray.setArray("scaldb_second_key",Array("scaldb_second_value")) shouldEqual Array("scaldb_second_value")
    coreArray.setArray("scaldb_third_key",Array("scaldb_third_value")) shouldEqual Array("scaldb_third_value")
  }

  "The coreArray class" should "have a setter for an array key returning a array type" in {
    assume(coreArray.setArray("scaldb_first_key",Array("scaldb_first_value")).isInstanceOf[Array[Any]])
    assume(coreArray.setArray("scaldb_second_key",Array("scaldb_second_value")).isInstanceOf[Array[Any]])
    assume(coreArray.setArray("scaldb_third_key",Array("scaldb_third_value")).isInstanceOf[Array[Any]])
  }

  "The coreArray class" should "have a getter for a int key" in {
    coreArray.getArray("scaldb_first_key") shouldEqual Array("scaldb_first_value")
    coreArray.getArray("scaldb_second_key") shouldEqual Array("scaldb_second_value")
    coreArray.getArray("scaldb_third_key") shouldEqual Array("scaldb_third_value")
  }

  "The coreArray class" should "have a getter for int the same type as itself" in {
    assume(coreArray.getArray("scaldb_first_key").isInstanceOf[Array[Any]])
    assume(coreArray.getArray("scaldb_second_key").isInstanceOf[Array[Any]])
    assume(coreArray.getArray("scaldb_third_key").isInstanceOf[Array[Any]])
  }

  "The coreArray class" should "have a getter with a default value if the key does not exists" in {
    coreArray.getArray("scaldb_first_key_non_presence",Array("default_value")) shouldEqual Array("default_value")
    coreArray.getArray("scaldb_second_key_non_presence",Array("default_value")) shouldEqual Array("default_value")
    coreArray.getArray("scaldb_third_key_non_presence",Array("default_value")) shouldEqual Array("default_value")
  }

  "The coreArray class" should "have a setter overwrite key" in {
    coreArray.setArray("scaldb_first_key",Array("scaldb_first_value","scaldb_second_value")) shouldEqual Array("scaldb_first_value","scaldb_second_value")
    coreArray.setArray("scaldb_second_key",Array("scaldb_first_value","scaldb_second_value")) shouldEqual Array("scaldb_first_value","scaldb_second_value")
    coreArray.setArray("scaldb_third_key",Array("scaldb_first_value","scaldb_second_value")) shouldEqual Array("scaldb_first_value","scaldb_second_value")
    coreArray.getArray("scaldb_first_key") shouldEqual Array("scaldb_first_value","scaldb_second_value")
    coreArray.getArray("scaldb_second_key") shouldEqual Array("scaldb_first_value","scaldb_second_value")
    coreArray.getArray("scaldb_third_key",Array("scaldb_first_value","scaldb_second_value")) shouldEqual Array("scaldb_first_value","scaldb_second_value")
  }
}

class CoreListSpec extends FlatSpec with Matchers {
  val coreList = new CoreList()

  "The coreList class" should "have an type" in {
    assume(coreList.isInstanceOf[CoreList])
  }

  "The coreList class" should "have a setter for list" in {
    coreList.setList("scaldb_first_key",List("scaldb_first_value")) shouldEqual List("scaldb_first_value")
    coreList.setList("scaldb_second_key",List("scaldb_second_value")) shouldEqual List("scaldb_second_value")
    coreList.setList("scaldb_third_key",List("scaldb_third_value")) shouldEqual List("scaldb_third_value")
  }

  "The coreList class" should "have a setter for an list key returning a list type" in {
    assume(coreList.setList("scaldb_first_key",List("scaldb_first_value")).isInstanceOf[List[Any]])
    assume(coreList.setList("scaldb_second_key",List("scaldb_second_value")).isInstanceOf[List[Any]])
    assume(coreList.setList("scaldb_third_key",List("scaldb_third_value")).isInstanceOf[List[Any]])
  }

  "The coreList class" should "have a getter for a list key" in {
    coreList.getList("scaldb_first_key") shouldEqual Array("scaldb_first_value")
    coreList.getList("scaldb_second_key") shouldEqual Array("scaldb_second_value")
    coreList.getList("scaldb_third_key") shouldEqual Array("scaldb_third_value")
  }

  "The coreList class" should "have a getter for list the same type as itself" in {
    coreList.getList("scaldb_first_key_non_presence",List("default_value")) shouldEqual List("default_value")
    coreList.getList("scaldb_second_key_non_presence",List("default_value")) shouldEqual List("default_value")
    coreList.getList("scaldb_third_key_non_presence",List("default_value")) shouldEqual List("default_value")
  }

  "The coreList class" should "have a setter overwrite key" in {
    coreList.setList("scaldb_first_key",List("scaldb_first_value","scaldb_second_value")) shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreList.setList("scaldb_second_key",List("scaldb_first_value","scaldb_second_value")) shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreList.setList("scaldb_third_key",List("scaldb_first_value","scaldb_second_value")) shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreList.getList("scaldb_first_key") shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreList.getList("scaldb_second_key") shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreList.getList("scaldb_third_key") shouldEqual List("scaldb_first_value","scaldb_second_value")
  }
}

class CoreVectorSpec extends FlatSpec with Matchers {
  val coreVector = new CoreVector()

  "The coreVector class" should "have an type" in {
    assume(coreVector.isInstanceOf[CoreVector])
  }

  "The coreVector class" should "have a setter for vector" in {
    coreVector.setVector("scaldb_first_key",Vector("scaldb_first_value")) shouldEqual Vector("scaldb_first_value")
    coreVector.setVector("scaldb_second_key",Vector("scaldb_second_value")) shouldEqual Vector("scaldb_second_value")
    coreVector.setVector("scaldb_third_key",Vector("scaldb_third_value")) shouldEqual Vector("scaldb_third_value")
  }

  "The coreVector class" should "have a setter for an vector key returning a vector type" in {
    assume(coreVector.setVector("scaldb_first_key",Vector("scaldb_first_value")).isInstanceOf[Vector[Any]])
    coreVector.setVector("scaldb_second_key",Vector("scaldb_second_value")).isInstanceOf[Vector[Any]] shouldEqual true
    coreVector.setVector("scaldb_third_key",Vector("scaldb_third_value")).isInstanceOf[Vector[Any]] shouldEqual true
  }

  "The coreVector class" should "have a getter for a vector key" in {
    coreVector.getVector("scaldb_first_key") shouldEqual Vector("scaldb_first_value")
    coreVector.getVector("scaldb_second_key") shouldEqual Vector("scaldb_second_value")
    coreVector.getVector("scaldb_third_key") shouldEqual Vector("scaldb_third_value")
  }

  "The coreVector class" should "have a getter for vector the same type as itself" in {
    coreVector.getVector("scaldb_first_key_non_presence",Vector("default_value")) shouldEqual Vector("default_value")
    coreVector.getVector("scaldb_second_key_non_presence",Vector("default_value")) shouldEqual Vector("default_value")
    coreVector.getVector("scaldb_third_key_non_presence",Vector("default_value")) shouldEqual Vector("default_value")
  }

  "The coreVector class" should "have a setter overwrite key" in {
    coreVector.setVector("scaldb_first_key",Vector("scaldb_first_value","scaldb_second_value")) shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVector.setVector("scaldb_second_key",Vector("scaldb_first_value","scaldb_second_value")) shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVector.setVector("scaldb_third_key",Vector("scaldb_first_value","scaldb_second_value")) shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVector.getVector("scaldb_first_key") shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVector.getVector("scaldb_second_key") shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVector.getVector("scaldb_third_key") shouldEqual Vector("scaldb_first_value","scaldb_second_value")
  }
}
