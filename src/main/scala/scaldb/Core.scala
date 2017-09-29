//  val directory = Paths.get("index")
//  val lucene = new Lucene(directory = Option(directory))
//  val name = lucene.create.field[String]("name")
//  val address = lucene.create.field[String]("address")
//  lucene.doc().fields(name("Jhon Jairo Valazques Vasquez"), address("123 Somewhere Rd.")).index()
//  lucene.doc().fields(name("Jhon Jairo Valazques Vasquez"), address("123 Somewhere Rd.")).index()
//  lucene.doc().fields(name("Jhon Jairo Valazques Vasquez"), address("123 Somewhere Rd.")).index()
//  lucene.doc().fields(name("Jhon Jairo Valazques Vasquez"), address("123 Somewhere Rd.")).index()
//  lucene.doc().fields(name("Jhon Jairo Valazques Vasquez"), address("123 Somewhere Rd.")).index()
//  val paged = lucene.query().sort(Sort(name)).search()
//  paged.results.foreach { searchResult =>
//    println(s"Name: ${searchResult(name)}, Adrress: ${searchResult(address)}")
//  }

package scaldb

import rx.lang.scala.Observable
import java.nio.file.Paths
import com.outr.lucene4s._
import com.outr.lucene4s.query.Sort

trait CoreLogicOperations {
  def stringBinarySearchArray(keys: Array[String], value: String): Int
  def hasKeyStringArray(value: String, keys: Array[String]): Boolean
}

trait CoreStringGetterSetter {
  def setString(key: String, value: String): String
  def getString(key: String, value: String = ""): String
}

//trait CoreFieldStringGetterSetter {
//  def setFieldString(key: String, value)
//  def getFieldString(key: String, value)
//}

trait CoreIntGetterSetter {
  def setInt(key: String, value: Int): Int
  def getInt(key: String, value: Int = 0): Int
}

trait CoreDoubleGetterSetter {
  def setDouble(key: String, value: Double): Double
  def getDouble(key: String, value: Double = 0): Double
}

trait CoreArrayStringGetterSetter {
  def setArrayString(key: String, value: Array[String]): Array[String]
  def getArrayString(key: String, value: Array[String] = Array.empty): Array[String]
}

trait CoreArrayDoubleGetterSetter {
  def setArrayDouble(key: String, value: Array[Double]): Array[Double]
  def getArrayDouble(key: String, value: Array[Double] = Array.empty): Array[Double]
}

trait CoreArrayIntGetterSetter {
  def setArrayInt(key: String, value: Array[Int]): Array[Int]
  def getArrayInt(key: String, value: Array[Int] = Array.empty): Array[Int]
}

trait CoreListStringGetterSetter {
  def setListString(key: String, value: List[String]): List[String]
  def getListString(key: String, value: List[String] = List.empty): List[String]
}

trait CoreListIntGetterSetter {
  def setListInt(key: String, value: List[Int]): List[Int]
  /*def getListInt(key: String, value: List[Int] = List.empty): List[Int]*/
}

trait CoreVectorStringGetterSetter {
  def setVectorString(key: String, value: Vector[String]): Vector[String]
  def getVectorString(key: String, value: Vector[String] = Vector.empty): Vector[String]
}

trait CoreVectorIntGetterSetter {
  def setVectorInt(key: String, value: Vector[Int]): Vector[Int]
  def getVectorInt(key: String, value: Vector[Int]): Vector[Int]
}

trait CoreGetterSetter {
  def setString(key: String, value: String): String
  def getString(key: String, value: String = ""): String
  def setInt(key: String, value: Int): Int
  def getInt(key: String, value: Int = 0): Int
  def setArrayString(key: String, value: Array[String]): Array[String]
  def getArrayString(key: String, value: Array[String] = Array.empty): Array[String]
  def setListString(key: String, value: List[String] = List.empty): List[String]
  def getListString(key: String, value: List[String] = List.empty): List[String]
  def setVectorString(key: String, value: Vector[String] = Vector.empty): Vector[String]
  def getVectorString(key: String, value: Vector[String] = Vector.empty): Vector[String]
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

class CoreFieldString extends Object {}

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

class CoreDouble extends Object with CoreDoubleGetterSetter {
  var DoubleKeys: Array[String] = Array.empty
  var DoubleValues: Array[Double] = Array.empty

  def setDouble(key: String, value: Double): Double = {
    if (CoreLogic.hasKeyStringArray(key,DoubleKeys)) {
      DoubleValues(CoreLogic.stringBinarySearchArray(DoubleKeys,key)) = value
    } else {
      DoubleKeys = DoubleKeys :+ key
      DoubleValues = DoubleValues :+ value
    }
    value
  }
  def getDouble(key: String, value: Double = 0): Double = {
    if (CoreLogic.hasKeyStringArray(key,DoubleKeys)) {
      DoubleValues(CoreLogic.stringBinarySearchArray(DoubleKeys,key))
    } else {
      value
    }
  }
}

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

class CoreArrayInt extends Object with CoreArrayIntGetterSetter {
  var ArrayKeys: Array[String] = Array.empty
  var ArrayValues: Array[Array[Int]] = Array.empty

  def setArrayInt(key: String, value: Array[Int]): Array[Int] = {
    if (CoreLogic.hasKeyStringArray(key,ArrayKeys)) {
      ArrayValues(CoreLogic.stringBinarySearchArray(ArrayKeys,key)) = value
    } else {
      ArrayKeys = ArrayKeys :+ key
      ArrayValues = ArrayValues :+ value
    }
    value
  }
  def getArrayInt(key: String, value: Array[Int] = Array.empty): Array[Int] = {
    if (CoreLogic.hasKeyStringArray(key,ArrayKeys)) {
      ArrayValues(CoreLogic.stringBinarySearchArray(ArrayKeys,key))
    } else {
      value
    }
  }
}

class CoreArrayDouble extends Object with CoreArrayDoubleGetterSetter {
  var ArrayKeys: Array[String] = Array.empty
  var ArrayValues: Array[Array[Double]] = Array.empty

  def setArrayDouble(key: String, value: Array[Double]): Array[Double] = {
    if (CoreLogic.hasKeyStringArray(key,ArrayKeys)) {
      ArrayValues(CoreLogic.stringBinarySearchArray(ArrayKeys,key)) = value
    } else {
      ArrayKeys = ArrayKeys :+ key
      ArrayValues = ArrayValues :+ value
    }
    value
  }
  def getArrayDouble(key: String, value: Array[Double] = Array.empty): Array[Double] = {
    if (CoreLogic.hasKeyStringArray(key,ArrayKeys)) {
      ArrayValues(CoreLogic.stringBinarySearchArray(ArrayKeys,key))
    } else {
      value
    }
  }
}

class CoreListString extends Object with CoreListStringGetterSetter {
  var ListKeys: Array[String] = Array.empty
  var ListValues: Array[List[String]] = Array.empty

  def setListString(key: String, value: List[String]): List[String] = {
    if (CoreLogic.hasKeyStringArray(key,ListKeys)) {
      ListValues(CoreLogic.stringBinarySearchArray(ListKeys,key)) = value
    } else {
      ListKeys = ListKeys :+ key
      ListValues = ListValues :+ value
    }
    value
  }
  def getListString(key: String, value: List[String] = List.empty): List[String] = {
    if (CoreLogic.hasKeyStringArray(key,ListKeys)) {
      ListValues(CoreLogic.stringBinarySearchArray(ListKeys,key))
    } else {
      value
    }
  }
}

class CoreListInt extends Object with CoreListIntGetterSetter {
  var ListKeys: Array[String] = Array.empty
  var ListValues: Array[List[Int]] = Array.empty

  def setListInt(key: String, value: List[Int]): List[Int] = {
    if (CoreLogic.hasKeyStringArray(key,ListKeys)) {
      ListValues(CoreLogic.stringBinarySearchArray(ListKeys,key)) = value
    } else {
      ListKeys = ListKeys :+ key
      ListValues = ListValues :+ value
    }
    value
  }
  def getListInt(key: String, value: List[Int] = List.empty): List[Int] = {
    if (CoreLogic.hasKeyStringArray(key,ListKeys)) {
      ListValues(CoreLogic.stringBinarySearchArray(ListKeys,key))
    } else {
      value
    }
  }
}

class CoreVectorString extends Object with CoreVectorStringGetterSetter {
  var VectorKeys: Array[String] = Array.empty
  var VectorValues: Array[Vector[String]] = Array.empty

  def setVectorString(key: String, value: Vector[String]): Vector[String] = {
    if (CoreLogic.hasKeyStringArray(key,VectorKeys)) {
      VectorValues(CoreLogic.stringBinarySearchArray(VectorKeys,key)) = value
    } else {
      VectorKeys = VectorKeys :+ key
      VectorValues = VectorValues :+ value
    }
    value
  }
  def getVectorString(key: String, value: Vector[String] = Vector.empty): Vector[String] = {
    if (CoreLogic.hasKeyStringArray(key,VectorKeys)) {
      VectorValues(CoreLogic.stringBinarySearchArray(VectorKeys,key))
    } else {
      value
    }
  }
}

class CoreVectorInt extends Object with CoreVectorIntGetterSetter {
  var VectorKeys: Array[String] = Array.empty
  var VectorValues: Array[Vector[Int]] = Array.empty

  def setVectorInt(key: String, value: Vector[Int] = Vector.empty): Vector[Int] = {
    if (CoreLogic.hasKeyStringArray(key,VectorKeys)) {
      VectorValues(CoreLogic.stringBinarySearchArray(VectorKeys,key)) = value
    } else {
      VectorKeys = VectorKeys :+ key
      VectorValues = VectorValues :+ value
    }
    value
  }
  def getVectorInt(key: String, value: Vector[Int] = Vector.empty): Vector[Int] = {
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
  private val coreListString: CoreListString = new CoreListString()
  private val coreVectorString: CoreVectorString = new CoreVectorString()

  val directory = Paths.get("index")
  val lucene = new Lucene(directory = Option(directory))

  def setString(key: String, value: String): String = coreString.setString(key,value)
  def getString(key: String, value: String = ""): String = coreString.getString(key,value)
  def setInt(key: String, value: Int): Int = coreInt.setInt(key,value)
  def getInt(key: String, value: Int = 0): Int = coreInt.getInt(key,value)
  def setArrayString(key: String, value: Array[String]): Array[String] = coreArrayString.setArrayString(key,value)
  def getArrayString(key: String, value: Array[String] = Array.empty): Array[String] = coreArrayString.getArrayString(key,value)
  def setListString(key: String, value: List[String] = List.empty): List[String] = coreListString.setListString(key,value)
  def getListString(key: String, value: List[String] = List.empty): List[String] = coreListString.getListString(key,value)
  def setVectorString(key: String, value: Vector[String] = Vector.empty): Vector[String] = coreVectorString.setVectorString(key,value)
  def getVectorString(key: String, value: Vector[String] = Vector.empty): Vector[String] = coreVectorString.getVectorString(key,value)
}
