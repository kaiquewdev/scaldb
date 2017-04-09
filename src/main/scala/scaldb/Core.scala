package scaldb

import rx.lang.scala.Observable

trait CoreLogicOperations {
  def stringBinarySearchArray(keys: Array[String], value: String): Int
  def hasKeyStringArray(value: String, keys: Array[String]): Boolean
}

trait CoreStringGetterSetter {
  def setString(key: String, value: String): String
  def getString(key: String, value: String = ""): String
}

trait CoreIntGetterSetter {
  def setInt(key: String, value: Int): Int
  def getInt(key: String, value: Int = 0): Int
}

trait CoreFloatGetterSetter {}

trait CoreArrayStringGetterSetter {
  def setArrayString(key: String, value: Array[String]): Array[String]
  def getArrayString(key: String, value: Array[String] = Array.empty): Array[String]
}

trait CoreListGetterSetter {
  def setList(key: String, value: List[Any]): List[Any]
  def getList(key: String, value: List[Any] = List.empty): List[Any]
}

trait CoreVectorGetterSetter {
  def setVector(key: String, value: Vector[Any]): Vector[Any]
  def getVector(key: String, value: Vector[Any] = Vector.empty): Vector[Any]
}

trait CoreGetterSetter {
  def setString(key: String, value: String): String
  def getString(key: String, value: String = ""): String
  def setInt(key: String, value: Int): Int
  def getInt(key: String, value: Int = 0): Int
  def setArrayString(key: String, value: Array[String]): Array[String]
  def getArrayString(key: String, value: Array[String] = Array.empty): Array[String]
  def setList(key: String, value: List[Any] = List.empty): List[Any]
  def getList(key: String, value: List[Any] = List.empty): List[Any]
  def setVector(key: String, value: Vector[Any] = Vector.empty): Vector[Any]
  def getVector(key: String, value: Vector[Any] = Vector.empty): Vector[Any]
}

object CoreLogic extends CoreLogicOperations {
  def stringBinarySearchArray(keys: Array[String], value: String): Int = keys.indexOf(value)
  def hasKeyStringArray(value: String, keys: Array[String]): Boolean = stringBinarySearchArray(keys,value) > -1
}

class CoreString extends Object with CoreStringGetterSetter {
  var StringKeys: Array[String] = Array.empty
  var StringValues: Array[String] = Array.empty

  def setString(key: String, value: String): String = {
    if (CoreLogic.hasKeyStringArray(key,StringKeys)) {
      StringValues(CoreLogic.stringBinarySearchArray(StringKeys,key)) = value
    } else {
      StringKeys = StringKeys :+ key
      StringValues = StringValues :+ value
    }
    value
  }
  def getString(key: String, value: String = ""): String = {
    if (CoreLogic.hasKeyStringArray(key,StringKeys)) {
      StringValues(CoreLogic.stringBinarySearchArray(StringKeys,key))
    } else {
      value
    }
  }
}

class CoreInt extends Object with CoreIntGetterSetter {
  var IntKeys: Array[String] = Array.empty
  var IntValues: Array[Int] = Array.empty

  def setInt(key: String, value: Int): Int = {
    if (CoreLogic.hasKeyStringArray(key,IntKeys)) {
      IntValues(CoreLogic.stringBinarySearchArray(IntKeys,key)) = value
    } else {
      IntKeys = IntKeys :+ key
      IntValues = IntValues :+ value
    }
    value
  }
  def getInt(key: String, value: Int = 0): Int = {
    if (CoreLogic.hasKeyStringArray(key,IntKeys)) {
      IntValues(CoreLogic.stringBinarySearchArray(IntKeys,key))
    } else {
      value
    }
  }
}

class CoreFloat extends Object with CoreFloatGetterSetter {}

class CoreArrayString extends Object with CoreArrayStringGetterSetter {
  var ArrayKeys: Array[String] = Array.empty
  var ArrayValues: Array[Array[String]] = Array.empty

  def setArrayString(key: String, value: Array[String]): Array[String] = {
    if (CoreLogic.hasKeyStringArray(key,ArrayKeys)) {
      ArrayValues(CoreLogic.stringBinarySearchArray(ArrayKeys,key)) = value
    } else {
      ArrayKeys = ArrayKeys :+ key
      ArrayValues = ArrayValues :+ value
    }
    value
  }
  def getArrayString(key: String, value: Array[String] = Array.empty): Array[String] = {
    if (CoreLogic.hasKeyStringArray(key,ArrayKeys)) {
      ArrayValues(CoreLogic.stringBinarySearchArray(ArrayKeys,key))
    } else {
      value
    }
  }
}

class CoreList extends Object with CoreListGetterSetter {
  var ListKeys: Array[String] = Array.empty
  var ListValues: Array[List[Any]] = Array.empty

  def setList(key: String, value: List[Any]): List[Any] = {
    if (CoreLogic.hasKeyStringArray(key,ListKeys)) {
      ListValues(CoreLogic.stringBinarySearchArray(ListKeys,key)) = value
    } else {
      ListKeys = ListKeys :+ key
      ListValues = ListValues :+ value
    }
    value
  }
  def getList(key: String, value: List[Any] = List.empty): List[Any] = {
    if (CoreLogic.hasKeyStringArray(key,ListKeys)) {
      ListValues(CoreLogic.stringBinarySearchArray(ListKeys,key))
    } else {
      value
    }
  }
}

class CoreVector extends Object with CoreVectorGetterSetter {
  var VectorKeys: Array[String] = Array.empty
  var VectorValues: Array[Vector[Any]] = Array.empty

  def setVector(key: String, value: Vector[Any]): Vector[Any] = {
    if (CoreLogic.hasKeyStringArray(key,VectorKeys)) {
      VectorValues(CoreLogic.stringBinarySearchArray(VectorKeys,key)) = value
    } else {
      VectorKeys = VectorKeys :+ key
      VectorValues = VectorValues :+ value
    }
    value
  }
  def getVector(key: String, value: Vector[Any] = Vector.empty): Vector[Any] = {
    if (CoreLogic.hasKeyStringArray(key,VectorKeys)) {
      VectorValues(CoreLogic.stringBinarySearchArray(VectorKeys,key))
    } else {
      value
    }
  }
}

class Core extends Object with CoreGetterSetter {
  private val coreString: CoreString = new CoreString()
  private val coreInt: CoreInt = new CoreInt()
  private val coreArrayString: CoreArrayString = new CoreArrayString()
  private val coreList: CoreList = new CoreList()
  private val coreVector: CoreVector = new CoreVector()

  def setString(key: String, value: String): String = coreString.setString(key,value)
  def getString(key: String, value: String = ""): String = coreString.getString(key,value)
  def setInt(key: String, value: Int): Int = coreInt.setInt(key,value)
  def getInt(key: String, value: Int = 0): Int = coreInt.getInt(key,value)
  def setArrayString(key: String, value: Array[String]): Array[String] = coreArrayString.setArrayString(key,value)
  def getArrayString(key: String, value: Array[String] = Array.empty): Array[String] = coreArrayString.getArrayString(key,value)
  def setList(key: String, value: List[Any] = List.empty): List[Any] = coreList.setList(key,value)
  def getList(key: String, value: List[Any] = List.empty): List[Any] = coreList.getList(key,value)
  def setVector(key: String, value: Vector[Any] = Vector.empty): Vector[Any] = coreVector.setVector(key,value)
  def getVector(key: String, value: Vector[Any] = Vector.empty): Vector[Any] = coreVector.getVector(key,value)
}
