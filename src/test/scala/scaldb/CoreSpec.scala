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
    coreInt.setInt("scladb_three_key_value",3) shouldEqual 3
  }

  "The coreInt class" should "have a setter for a int key returning a int type" in {
    assume(coreInt.setInt("scaldb_first_key_value",0).isInstanceOf[Int])
    assume(coreInt.setInt("scaldb_second_key_value",2).isInstanceOf[Int])
    assume(coreInt.setInt("scaldb_three_key_value",3).isInstanceOf[Int])
  }

  "The coreInt class" should "have a getter for a int key" in {
    coreInt.getInt("scaldb_first_key_value") shouldEqual 0
    coreInt.getInt("scaldb_second_key_value") shouldEqual 2
    coreInt.getInt("scaldb_three_key_value") shouldEqual 3
  }

  "The coreInt class" should "have a getter for int the same type as itself" in {
    assume(coreInt.getInt("scaldb_first_key_value").isInstanceOf[Int])
    assume(coreInt.getInt("scaldb_second_key_value").isInstanceOf[Int])
    assume(coreInt.getInt("scaldb_three_key_value").isInstanceOf[Int])
  }

  "The coreInt class" should "have a getter with a default value if the key does not exists" in {
    coreInt.getInt("scaldb_first_key_value_non_presence",1) shouldEqual 1
    coreInt.getInt("scaldb_second_key_value_non_presence",4) shouldEqual 4
    coreInt.getInt("scaldb_three_key_value_non_presence",5) shouldEqual 5
  }

  "The coreInt class" should "have a setter overwrite key" in {
    coreInt.setInt("scaldb_first_key_value",10) shouldEqual 10
    coreInt.getInt("scaldb_first_key_value") should not equal 0
    coreInt.getInt("scaldb_first_key_value") shouldEqual 10
    coreInt.setInt("scaldb_second_key_value",180) shouldEqual 180
    coreInt.getInt("scaldb_second_key_value") should not equal 2
    coreInt.getInt("scaldb_second_key_value") shouldEqual 180
    coreInt.setInt("scaldb_three_key_value",10) shouldEqual 10
    coreInt.getInt("scaldb_three_key_value") should not equal 2
    coreInt.getInt("scaldb_three_key_value") shouldEqual 10
  }
}

class CoreDoubleSpec extends FlatSpec with Matchers {
  val coreDouble = new CoreDouble()

  "The coreDouble class" should "have an type" in {
    assume(coreDouble.isInstanceOf[CoreDouble])
  }

  "The coreDouble class" should "have a setter for double" in {
    coreDouble.setDouble("scaldb_first_key",1.5) shouldEqual 1.5
    coreDouble.setDouble("scaldb_second_key",3.7) shouldEqual 3.7
    coreDouble.setDouble("scaldb_three_key",7.3) shouldEqual 7.3
  }

  "The coreDouble class" should "have a getter for double" in {
    coreDouble.getDouble("scaldb_first_key") shouldEqual 1.5
    coreDouble.getDouble("scaldb_second_key") shouldEqual 3.7
    coreDouble.getDouble("scaldb_three_key") shouldEqual 7.3
  }

  "The coreDouble class" should "have a setter for a double key returning a double type" in {
    assume(coreDouble.getDouble("scaldb_first_key").isInstanceOf[Double])
    assume(coreDouble.getDouble("scaldb_second_key").isInstanceOf[Double])
    assume(coreDouble.getDouble("scaldb_three_key").isInstanceOf[Double])
  }

  "The coreDouble class" should "have a getter for a double key with a default value if the key does not exists" in {
    coreDouble.setDouble("scaldb_first_key_non_presence",407.15) shouldEqual 407.15
    coreDouble.setDouble("scaldb_second_key_non_presence",745.30) shouldEqual 745.30
    coreDouble.setDouble("scaldb_three_key_non_presence",835.739) shouldEqual 835.739
  }

  "The coreDouble class" should "have a setter overwrite key" in {
    coreDouble.setDouble("scaldb_first_key_value",3.7) shouldEqual 3.7
    coreDouble.getDouble("scaldb_first_key_value") should not equal 1.5
    coreDouble.getDouble("scaldb_first_key_value") shouldEqual 3.7
    coreDouble.setDouble("scaldb_second_key_value",4.8) shouldEqual 4.8
    coreDouble.getDouble("scaldb_second_key_value") should not equal 3.7
    coreDouble.getDouble("scaldb_second_key_value") shouldEqual 4.8
    coreDouble.setDouble("scaldb_three_key_value",15.7) shouldEqual 15.7
    coreDouble.getDouble("scaldb_three_key_value") should not equal 7.3
    coreDouble.getDouble("scaldb_three_key_value") shouldEqual 15.7
  }
}

class CoreArrayStringSpec extends FlatSpec with Matchers {
  val coreArrayString = new CoreArrayString()

  "The coreArrayString class" should "have an type" in {
    assume(coreArrayString.isInstanceOf[CoreArrayString])
  }

  "The coreArrayString class" should "have a setter for string array" in {
    coreArrayString.setArrayString("scaldb_first_key",Array("scaldb_first_value")) shouldEqual Array("scaldb_first_value")
    coreArrayString.setArrayString("scaldb_second_key",Array("scaldb_second_value")) shouldEqual Array("scaldb_second_value")
    coreArrayString.setArrayString("scaldb_three_key",Array("scaldb_three_value")) shouldEqual Array("scaldb_three_value")
  }

  "The coreArrayString class" should "have a setter for an array key returning a array type" in {
    assume(coreArrayString.setArrayString("scaldb_first_key",Array("scaldb_first_overwritted_value")).isInstanceOf[Array[String]])
    assume(coreArrayString.setArrayString("scaldb_second_key",Array("scaldb_second_overwritted_value")).isInstanceOf[Array[String]])
    assume(coreArrayString.setArrayString("scaldb_three_key",Array("scaldb_three_overwritted_value")).isInstanceOf[Array[String]])
  }

  "The coreArrayString class" should "have a getter for a int key" in {
    coreArrayString.getArrayString("scaldb_first_key") shouldEqual Array("scaldb_first_overwritted_value")
    coreArrayString.getArrayString("scaldb_second_key") shouldEqual Array("scaldb_second_overwritted_value")
    coreArrayString.getArrayString("scaldb_three_key") shouldEqual Array("scaldb_three_overwritted_value")
  }

  "The coreArrayString class" should "have a getter for int the same type as itself" in {
    assume(coreArrayString.getArrayString("scaldb_first_key").isInstanceOf[Array[String]])
    assume(coreArrayString.getArrayString("scaldb_second_key").isInstanceOf[Array[String]])
    assume(coreArrayString.getArrayString("scaldb_three_key").isInstanceOf[Array[String]])
  }

  "The coreArrayString class" should "have a getter with a default value if the key does not exists" in {
    coreArrayString.getArrayString("scaldb_first_key_non_presence",Array("default_value")) shouldEqual Array("default_value")
    coreArrayString.getArrayString("scaldb_second_key_non_presence",Array("default_value")) shouldEqual Array("default_value")
    coreArrayString.getArrayString("scaldb_third_key_non_presence",Array("default_value")) shouldEqual Array("default_value")
  }

  "The coreArrayString class" should "have a setter overwrite key" in {
    coreArrayString.getArrayString("scaldb_first_key") should not equal Array("scaldb_first_value")
    coreArrayString.getArrayString("scaldb_first_key") shouldEqual Array("scaldb_first_overwritted_value")
    coreArrayString.getArrayString("scaldb_second_key") should not equal Array("scaldb_second_value")
    coreArrayString.getArrayString("scaldb_second_key") shouldEqual Array("scaldb_second_overwritted_value")
    coreArrayString.getArrayString("scaldb_three_key") should not equal Array("scaldb_three_value")
    coreArrayString.getArrayString("scaldb_three_key") shouldEqual Array("scaldb_three_overwritted_value")
  }
}

class CoreArrayIntSpec extends FlatSpec with Matchers {
  val coreArrayInt = new CoreArrayInt()

  "The coreArrayInt class" should "have an type" in {
    assume(coreArrayInt.isInstanceOf[CoreArrayInt])
  }

  "The coreArrayInt class" should "have a setter for int array" in {
    coreArrayInt.setArrayInt("scaldb_first_key",Array(10,15,35)) shouldEqual Array(10,15,35)
    coreArrayInt.setArrayInt("scaldb_second_Key",Array(17,38,85)) shouldEqual Array(17,38,85)
    coreArrayInt.setArrayInt("scaldb_three_key",Array(30,70,80)) shouldEqual Array(30,70,80)
  }

  "The coreArrayInt class" should "have a setter for an array key returning a array type" in {
    assume(coreArrayInt.setArrayInt("scaldb_first_key",Array(17,39,2004,3009)).isInstanceOf[Array[Int]])
    assume(coreArrayInt.setArrayInt("scaldb_second_key",Array(35,75,59,400)).isInstanceOf[Array[Int]])
    assume(coreArrayInt.setArrayInt("scaldb_three_key",Array(800,755,870,355)).isInstanceOf[Array[Int]])
  }

  "The coreArrayInt class" should "have a getter for a int array key" in {
    coreArrayInt.getArrayInt("scaldb_first_key") shouldEqual Array(17,39,2004,3009)
    coreArrayInt.getArrayInt("scaldb_second_key") shouldEqual Array(35,75,59,400)
    coreArrayInt.getArrayInt("scaldb_three_key") shouldEqual Array(800,755,870,355)
  }

  "The coreArrayInt class" should "have a getter for int the same type as itfself" in {
    assume(coreArrayInt.getArrayInt("scaldb_first_key").isInstanceOf[Array[Int]])
    assume(coreArrayInt.getArrayInt("scaldb_second_key").isInstanceOf[Array[Int]])
    assume(coreArrayInt.getArrayInt("scaldb_three_key").isInstanceOf[Array[Int]])
  }

  "The coreArrayInt class" should "have a getter with a default value if the key does not exists" in {
    coreArrayInt.getArrayInt("scaldb_first_key_non_presence",Array(10, 100, 570)) shouldEqual Array(10,100,570)
    coreArrayInt.getArrayInt("scaldb_second_key_non_presence",Array(12,70,520,485)) shouldEqual Array(12,70,520,485)
    coreArrayInt.getArrayInt("scaldb_three_key_non_presence",Array(50,150,135,179)) shouldEqual Array(50,150,135,179)
  }

  "The coreArrayInt class" should "have a setter overwrite key" in {
    coreArrayInt.getArrayInt("scaldb_first_key") should not equal Array(10,15,35)
    coreArrayInt.getArrayInt("scaldb_first_key") shouldEqual Array(17,39,2004,3009)
    coreArrayInt.getArrayInt("scaldb_second_key") should not equal Array(17,38,85)
    coreArrayInt.getArrayInt("scaldb_second_key") shouldEqual Array(35,75,59,400)
    coreArrayInt.getArrayInt("scaldb_three_key") should not equal Array(30,70,80)
    coreArrayInt.getArrayInt("scaldb_three_key") shouldEqual Array(800,755,870,355)
  }
}

class CoreArrayDoubleSpec extends FlatSpec with Matchers {
  val coreArrayDouble = new CoreArrayDouble()

  "The coreArrayDouble class" should "have an type" in {
    assume(coreArrayDouble.isInstanceOf[CoreArrayDouble])
  }

  "The coreArrayDouble class" should "have a setter for double in array" in {
    coreArrayDouble.setArrayDouble("scaldb_first_key",Array(47.80,87.3)) shouldEqual Array(47.80,87.3)
  }

  "The coreArrayDouble class" should "have a setter for an array key returning a double array type" in {
    assume(coreArrayDouble.setArrayDouble("scaldb_first_key",Array(187.10,275.25,472.30)).isInstanceOf[Array[Double]])
  }

  "The coreArrayDouble class" should "have a getter for a double array key" in {
    coreArrayDouble.getArrayDouble("scaldb_first_key") shouldEqual Array(187.10,275.25,472.30)
  }

  "The coreArrayDouble class" should "have a getter for a double array with these type" in {
    assume(coreArrayDouble.getArrayDouble("scaldb_first_key").isInstanceOf[Array[Double]])
  }

  "The coreArrayDouble class" should "have a getter with a default value if the key does not exists" in {
    coreArrayDouble.getArrayDouble("scaldb_first_key_non_presence",Array(35,41,26)) shouldEqual Array(35,41,26)
  }

  "The coreArrayDouble class" should "have a setter overwrite key for double array" in {
    coreArrayDouble.getArrayDouble("scaldb_first_key") should not equal Array(47.80,87.3)
    coreArrayDouble.getArrayDouble("scaldb_first_key") shouldEqual Array(187.10,275.25,472.30)
  }
}

class CoreListStringSpec extends FlatSpec with Matchers {
  val coreListString = new CoreListString()

  "The coreListString class" should "have an type" in {
    assume(coreListString.isInstanceOf[CoreListString])
  }

  "The coreListString class" should "have a setter for list" in {
    coreListString.setListString("scaldb_first_key",List("scaldb_first_value")) shouldEqual List("scaldb_first_value")
    coreListString.setListString("scaldb_second_key",List("scaldb_second_value")) shouldEqual List("scaldb_second_value")
    coreListString.setListString("scaldb_three_key",List("scaldb_three_value")) shouldEqual List("scaldb_three_value")
  }

  "The coreListString class" should "have a setter for an list key returning a list type" in {
    assume(coreListString.setListString("scaldb_first_key",List("scaldb_first_value")).isInstanceOf[List[Any]])
    assume(coreListString.setListString("scaldb_second_key",List("scaldb_second_value")).isInstanceOf[List[Any]])
    assume(coreListString.setListString("scaldb_three_key",List("scaldb_three_value")).isInstanceOf[List[Any]])
  }

  "The coreListString class" should "have a getter for a list key" in {
    coreListString.getListString("scaldb_first_key") shouldEqual List("scaldb_first_value")
    coreListString.getListString("scaldb_second_key") shouldEqual List("scaldb_second_value")
    coreListString.getListString("scaldb_three_key") shouldEqual List("scaldb_three_value")
  }

  "The coreListString class" should "have a getter for list the same type as itself" in {
    coreListString.getListString("scaldb_first_key_non_presence",List("default_value")) shouldEqual List("default_value")
    coreListString.getListString("scaldb_second_key_non_presence",List("default_value")) shouldEqual List("default_value")
    coreListString.getListString("scaldb_three_key_non_presence",List("default_value")) shouldEqual List("default_value")
  }

  "The coreListString class" should "have a setter overwrite key" in {
    coreListString.setListString("scaldb_first_key",List("scaldb_first_value","scaldb_second_value")) shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreListString.getListString("scaldb_first_key") should not equal List("scaldb_first_value")
    coreListString.getListString("scaldb_first_key") shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreListString.setListString("scaldb_second_key",List("scaldb_first_value","scaldb_second_value")) shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreListString.getListString("scaldb_second_key") should not equal List("scaldb_second_value")
    coreListString.getListString("scaldb_second_key") shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreListString.setListString("scaldb_three_key",List("scaldb_first_value","scaldb_second_value")) shouldEqual List("scaldb_first_value","scaldb_second_value")
    coreListString.getListString("scaldb_three_key") should not equal List("scaldb_second_value")
    coreListString.getListString("scaldb_three_key") shouldEqual List("scaldb_first_value","scaldb_second_value")
  }
}

class CoreListIntSpec extends FlatSpec with Matchers {
  val coreListInt = new CoreListInt()

  "The coreListInt class" should "have an type" in {
    assume(coreListInt.isInstanceOf[CoreListInt])
  }

  "The coreListInt class" should "have a setter for list" in {
    coreListInt.setListInt("scaldb_first_key",List(10,100,157)) shouldEqual List(10,100,157)
    coreListInt.setListInt("scaldb_second_key",List(500,320,483,927)) shouldEqual List(500,320,483,927)
    coreListInt.setListInt("scaldb_third_key",List(125,348,217)) shouldEqual List(125,348,217)
  }

  "The coreListInt class" should "have a setter for an list key returning a list type" in {
    assume(coreListInt.setListInt("scaldb_first_key",List(275,387,297,10)).isInstanceOf[List[Int]])
    assume(coreListInt.setListInt("scaldb_second_key",List(847,538,127)).isInstanceOf[List[Int]])
    assume(coreListInt.setListInt("scaldb_third_key",List(475,389,152,347)).isInstanceOf[List[Int]])
  }

  "The coreListInt class" should "have a getter for a list key" in {
    coreListInt.getListInt("scaldb_first_key") shouldEqual List(275,387,297,10)
    coreListInt.getListInt("scaldb_second_key") shouldEqual List(847,538,127)
    coreListInt.getListInt("scaldb_third_key") shouldEqual List(475,389,152,347)
  }

  "The coreListInt class" should "have a getter for list the same type as itself" in {
    coreListInt.getListInt("scaldb_first_key_non_presence",List(1,2,3)) shouldEqual List(1,2,3)
    coreListInt.getListInt("scaldb_second_key_non_presence",List(3,8,9)) shouldEqual List(3,8,9)
    coreListInt.getListInt("scaldb_third_key_non_presence",List(4,7,10)) shouldEqual List(4,7,10)
  }

  "The coreListInt class" should "have a setter overwrite key" in {
    coreListInt.getListInt("scaldb_first_key") should not equal List(10,100,157)
    coreListInt.getListInt("scaldb_first_key") shouldEqual List(275,387,297,10)
    coreListInt.getListInt("scaldb_second_key") should not equal List(500,320,483,927)
    coreListInt.getListInt("scaldb_second_key") shouldEqual List(847,538,127)
    coreListInt.getListInt("scaldb_third_key") should not equal List(125,348,217)
    coreListInt.getListInt("scaldb_third_key") shouldEqual List(475,389,152,347)
  }
}

class CoreVectorStringSpec extends FlatSpec with Matchers {
  val coreVectorString = new CoreVectorString()

  "The coreVectorString class" should "have an type" in {
    assume(coreVectorString.isInstanceOf[CoreVectorString])
  }

  "The coreVectorString class" should "have a setter for vector string" in {
    coreVectorString.setVectorString("scaldb_first_key",Vector("scaldb_first_value")) shouldEqual Vector("scaldb_first_value")
    coreVectorString.setVectorString("scaldb_second_key",Vector("scaldb_second_value")) shouldEqual Vector("scaldb_second_value")
    coreVectorString.setVectorString("scaldb_third_key",Vector("scaldb_third_value")) shouldEqual Vector("scaldb_third_value")
  }

  "The coreVectorString class" should "have a setter for an vector string key returning a vector type" in {
    assume(coreVectorString.setVectorString("scaldb_first_key",Vector("scaldb_first_value")).isInstanceOf[Vector[String]])
    assume(coreVectorString.setVectorString("scaldb_second_key",Vector("scaldb_second_value")).isInstanceOf[Vector[String]])
    assume(coreVectorString.setVectorString("scaldb_third_key",Vector("scaldb_third_value")).isInstanceOf[Vector[String]])
  }

  "The coreVector class" should "have a getter for a vector key" in {
    coreVectorString.getVectorString("scaldb_first_key") shouldEqual Vector("scaldb_first_value")
    coreVectorString.getVectorString("scaldb_second_key") shouldEqual Vector("scaldb_second_value")
    coreVectorString.getVectorString("scaldb_third_key") shouldEqual Vector("scaldb_third_value")
  }

  "The coreVector class" should "have a getter for vector the same type as itself" in {
    coreVectorString.getVectorString("scaldb_first_key_non_presence",Vector("default_value")) shouldEqual Vector("default_value")
    coreVectorString.getVectorString("scaldb_second_key_non_presence",Vector("default_value")) shouldEqual Vector("default_value")
    coreVectorString.getVectorString("scaldb_third_key_non_presence",Vector("default_value")) shouldEqual Vector("default_value")
  }

  "The coreVector class" should "have a setter overwrite key" in {
    coreVectorString.setVectorString("scaldb_first_key",Vector("scaldb_first_value","scaldb_second_value")) shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVectorString.setVectorString("scaldb_second_key",Vector("scaldb_first_value","scaldb_second_value")) shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVectorString.setVectorString("scaldb_third_key",Vector("scaldb_first_value","scaldb_second_value")) shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVectorString.getVectorString("scaldb_first_key") shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVectorString.getVectorString("scaldb_second_key") shouldEqual Vector("scaldb_first_value","scaldb_second_value")
    coreVectorString.getVectorString("scaldb_third_key") shouldEqual Vector("scaldb_first_value","scaldb_second_value")
  }
}

class CoreVectorIntSpec extends FlatSpec with Matchers {
  val coreVectorInt = new CoreVectorInt()

  "The coreVectorInt class" should "have an type" in {
    assume(coreVectorInt.isInstanceOf[CoreVectorInt])
  }

  "The coreVectorInt class" should "have a setter for vector int" in {
    coreVectorInt.setVectorInt("scaldb_first_key",Vector(7,2,0,8)) shouldEqual Vector(7,2,0,8)
  }

  "The coreVectorInt class" should "have a setter for an vector int key returning a vector type" in {
    assume(coreVectorInt.setVectorInt("scaldb_first_key",Vector(4,7,2,8)).isInstanceOf[Vector[Int]])
  }

  "The coreVectorInt class" should "have a gettter for a vector int key" in {
    coreVectorInt.getVectorInt("scaldb_first_key") shouldEqual Vector(4,7,2,8)
  }

  "The coreVectorInt class" should "have a getter for vector int the same type as itself" in {
    coreVectorInt.getVectorInt("scaldb_first_key_non_presence",Vector(1,4,5)) shouldEqual Vector(1,4,5)
  }

  "The coreVectorInt class" should "have a setter overwrite key" in {
    coreVectorInt.setVectorInt("scaldb_first_key",Vector(100,524,324)) shouldEqual Vector(100,524,324)
    coreVectorInt.getVectorInt("scaldb_first_key") should not equal Vector(7,2,0,8)
  }
}

class CoreSpec extends FlatSpec with Matchers {
  val core = new Core()

  "The core class" should "have an type" in {
    assume(core.isInstanceOf[Core])
  }

  "The core class" should "have a string setter" in {
    core.setString("scaldb_first_key_string","scaldb_first_value") shouldEqual "scaldb_first_value"
    core.setString("scaldb_second_key_string","scaldb_second_value") shouldEqual "scaldb_second_value"
    core.setString("scaldb_three_key_string","scaldb_three_value") shouldEqual "scaldb_three_value"
    core.setString("scaldb_four_key_string","scaldb_four_key_value") shouldEqual "scaldb_four_key_value"
    core.setString("scaldb_five_key_string","scaldb_five_key_value") shouldEqual "scaldb_five_key_value"
  }

  "The core class" should "have a string getter" in {
    core.getString("scaldb_first_key_string") shouldEqual "scaldb_first_value"
    core.getString("scaldb_second_key_string") shouldEqual "scaldb_second_value"
    core.getString("scaldb_three_key_string") shouldEqual "scaldb_three_value"
    core.getString("scaldb_four_key_string") shouldEqual "scaldb_four_key_value"
    core.getString("scaldb_five_key_string") shouldEqual "scaldb_five_key_value"
  }

  "The core class" should "have a getter default value to return when the key is not present" in {
    core.getString("scaldb_first_key_string_non_presence","first_default_value") shouldEqual "first_default_value"
    core.getString("scaldb_second_key_string_non_presence","second_default_value") shouldEqual "second_default_value"
    core.getString("scaldb_three_key_string_non_presence","three_default_value") shouldEqual "three_default_value"
    core.getString("scaldb_four_key_string_non_presence","four_default_value") shouldEqual "four_default_value"
    core.getString("scaldb_five_key_string_non_presence","five_default_value") shouldEqual "five_default_value"
  }

  "The core class" should "have a setter overwrite key" in {
    core.setString("scaldb_first_key","scaldb_first_value_overwrite") shouldEqual "scaldb_first_value_overwrite"
    core.setString("scaldb_second_key","scaldb_second_value_overwrite") shouldEqual "scaldb_second_value_overwrite"
    core.setString("scaldb_three_key","scaldb_three_value_overwrite") shouldEqual "scaldb_three_value_overwrite"
    core.setString("scaldb_four_key","scaldb_four_value_overwrite") shouldEqual "scaldb_four_value_overwrite"
    core.setString("scaldb_five_key","scaldb_five_value_overwrite") shouldEqual "scaldb_five_value_overwrite"
  }

  "The core class" should "have a int setter" in {
    core.setInt("scaldb_first_key_int",10) shouldEqual 10
    core.setInt("scaldb_second_key_int",20) shouldEqual 20
    core.setInt("scaldb_three_key_int",30) shouldEqual 30
    core.setInt("scaldb_four_key_int",40) shouldEqual 40
    core.setInt("scaldb_five_key_int",50) shouldEqual 50
  }

  "The core class" should "have a int getter" in {
    core.getInt("scaldb_first_key_int_non_presence", -1) shouldEqual -1
    core.getInt("scaldb_second_key_int_non_presence", -10) shouldEqual -10
    core.getInt("scaldb_three_key_int_non_presence", -50) shouldEqual -50
    core.getInt("scaldb_four_key_int_non_presence", -40) shouldEqual -40
    core.getInt("scaldb_five_key_int_non_presence", -70) shouldEqual -70
  }

  "The core class" should "have a array setter" in {
    core.setArrayString("scaldb_first_key_array",Array("scaldb_first_key_value")) shouldEqual Array("scaldb_first_key_value")
    core.setArrayString("scaldb_second_key_array",Array("scaldb_second_key_value")) shouldEqual Array("scaldb_second_key_value")
    core.setArrayString("scaldb_three_key_array",Array("scaldb_three_key_value")) shouldEqual Array("scaldb_three_key_value")
    core.setArrayString("scaldb_four_key_array",Array("scaldb_four_key_value")) shouldEqual Array("scaldb_four_key_value")
  }

  "The core class" should "have a array getter" in {
    core.getArrayString("scaldb_first_key_array") shouldEqual Array("scaldb_first_key_value")
    core.getArrayString("scaldb_second_key_array") shouldEqual Array("scaldb_second_key_value")
    core.getArrayString("scaldb_three_key_array") shouldEqual Array("scaldb_three_key_value")
    core.getArrayString("scaldb_four_key_array") shouldEqual Array("scaldb_four_key_value")
  }

  "The core class" should "have a default getter value to return when the key is not present" in {
    core.getArrayString("scaldb_first_key_array_non_presence",Array("first_default_value")) shouldEqual Array("first_default_value")
    core.getArrayString("scaldb_second_key_array_non_presence",Array("second_default_value")) shouldEqual Array("second_default_value")
    core.getArrayString("scaldb_three_key_array_non_presence",Array("three_default_value")) shouldEqual Array("three_default_value")
    core.getArrayString("scaldb_four_key_array_non_presence",Array("four_default_value")) shouldEqual Array("four_default_value")
    core.getArrayString("scaldb_five_key_array_non_presence",Array("five_default_value")) shouldEqual Array("five_default_value")
  }

  "The core class" should "have a array setter overwrite key" in {
    core.setArrayString("scaldb_first_key_array",Array("scaldb_first_key_value")) shouldEqual Array("scaldb_first_key_value")
    core.setArrayString("scaldb_second_key_array",Array("scaldb_second_key_value")) shouldEqual Array("scaldb_second_key_value")
    core.setArrayString("scaldb_third_key_array",Array("scaldb_third_key_value")) shouldEqual Array("scaldb_third_key_value")
    core.setArrayString("scaldb_four_key_array",Array("scaldb_four_key_value")) shouldEqual Array("scaldb_four_key_value")
  }

  "The core class" should "have a list setter" in {
    core.setListString("scaldb_first_key_list",List("scaldb_first_key_value")) shouldEqual List("scaldb_first_key_value")
    core.setListString("scaldb_second_key_list",List("scaldb_second_key_value")) shouldEqual List("scaldb_second_key_value")
    core.setListString("scaldb_three_key_list",List("scaldb_three_key_value")) shouldEqual List("scaldb_three_key_value")
    core.setListString("scaldb_four_key_list",List("scaldb_four_key_value")) shouldEqual List("scaldb_four_key_value")
    core.setListString("scaldb_five_key_list",List("scaldb_five_key_value")) shouldEqual List("scaldb_five_key_value")
  }

  "The core class" should "have a list getter" in {
    core.setListString("scaldb_first_key_list",List("scaldb_first_key_value")) shouldEqual List("scaldb_first_key_value")
    core.setListString("scaldb_second_key_list",List("scaldb_second_key_value")) shouldEqual List("scaldb_second_key_value")
    core.setListString("scaldb_three_key_list",List("scaldb_three_key_value")) shouldEqual List("scaldb_three_key_value")
    core.setListString("scaldb_four_key_list",List("scaldb_four_key_value")) shouldEqual List("scaldb_four_key_value")
    core.setListString("scaldb_five_key_list",List("scaldb_five_key_value")) shouldEqual List("scaldb_five_key_value")
  }

  "The core class" should "have a getter default value to return when the key is not present for a list" in {
    core.getListString("scaldb_first_key_list",List("scaldb_first_key_value")) shouldEqual List("scaldb_first_key_value")
    core.getListString("scaldb_second_key_list",List("scaldb_second_key_value")) shouldEqual List("scaldb_second_key_value")
    core.getListString("scaldb_three_key_list",List("scaldb_three_key_value")) shouldEqual List("scaldb_three_key_value")
    core.getListString("scaldb_four_key_list",List("scaldb_four_key_value")) shouldEqual List("scaldb_four_key_value")
    core.getListString("scaldb_five_key_list",List("scaldb_five_key_value")) shouldEqual List("scaldb_five_key_value")
  }

  "The core class" should "have a list setter overwrite key" in {
    core.setListString("scaldb_first_key_list",List("scaldb_first_key_value_overwritted")) shouldEqual List("scaldb_first_key_value_overwritted")
    core.setListString("scaldb_second_key_list",List("scaldb_second_key_value_overwritted")) shouldEqual List("scaldb_second_key_value_overwritted")
    core.setListString("scaldb_three_key_list",List("scaldb_three_key_value_overwritted")) shouldEqual List("scaldb_three_key_value_overwritted")
    core.setListString("scaldb_four_key_list",List("scaldb_four_key_value_overwritted")) shouldEqual List("scaldb_four_key_value_overwritted")
  }

  "The core class" should "have a vector setter" in {
    core.setVectorString("scaldb_first_key_vector",Vector("scaldb_first_key_value")) shouldEqual Vector("scaldb_first_key_value")
    core.setVectorString("scaldb_second_key_vector",Vector("scaldb_second_key_value")) shouldEqual Vector("scaldb_second_key_value")
    core.setVectorString("scaldb_three_key_vector",Vector("scaldb_three_key_value")) shouldEqual Vector("scaldb_three_key_value")
    core.setVectorString("scaldb_four_key_vector",Vector("scaldb_four_key_value")) shouldEqual Vector("scaldb_four_key_value")
    core.setVectorString("scaldb_five_key_vector",Vector("scaldb_five_key_value")) shouldEqual Vector("scaldb_five_key_value")
  }

  "The core class" should "have a vector getter" in {
    core.getVectorString("scaldb_first_key_vector") shouldEqual Vector("scaldb_first_key_value")
    core.getVectorString("scaldb_second_key_vector") shouldEqual Vector("scaldb_second_key_value")
    core.getVectorString("scaldb_three_key_vector") shouldEqual Vector("scaldb_three_key_value")
    core.getVectorString("scaldb_four_key_vector") shouldEqual Vector("scaldb_four_key_value")
    core.getVectorString("scaldb_five_key_vector") shouldEqual Vector("scaldb_five_key_value")
  }

  "The core class" should "have a default getter value to return when the key is not present for vector" in {
    core.getVectorString("scaldb_first_key_vector_non_presence",Vector("first_default_value")) shouldEqual Vector("first_default_value")
    core.getVectorString("scaldb_second_key_vector_non_presence",Vector("second_default_value")) shouldEqual Vector("second_default_value")
    core.getVectorString("scaldb_three_key_vector_non_presence",Vector("three_default_value")) shouldEqual Vector("three_default_value")
    core.getVectorString("scaldb_four_key_vector_non_presence",Vector("four_default_value")) shouldEqual Vector("four_default_value")
    core.getVectorString("scaldb_five_key_vector_non_presence",Vector("five_default_value")) shouldEqual Vector("five_default_value")
  }

  "The core class" should "have a vector setter overwrite key" in {
    core.setVectorString("scaldb_first_key_vector",Vector("scaldb_first_key_value_overwritted")) shouldEqual Vector("scaldb_first_key_value_overwritted")
    core.setVectorString("scaldb_second_key_vector",Vector("scaldb_second_key_value_overwritted")) shouldEqual Vector("scaldb_second_key_value_overwritted")
    core.setVectorString("scaldb_three_key_vector",Vector("scaldb_three_key_value_overwritted")) shouldEqual Vector("scaldb_three_key_value_overwritted")
    core.setVectorString("scaldb_four_key_vector",Vector("scaldb_four_key_value_overwritted")) shouldEqual Vector("scaldb_four_key_value_overwritted")
    core.setVectorString("scaldb_five_key_vector",Vector("scaldb_five_key_value_overwritted")) shouldEqual Vector("scaldb_five_key_value_overwritted")
  }
}
