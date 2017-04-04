package scaldb

import rx.lang.scala.Observable

trait CoreStringGetterSetter {
  def setString(key: String, value: String): String
  def getString(key: String, value: String = ""): String
}

class Core extends Object with CoreStringGetterSetter {
  var StringKeys: Array[String] = Array.empty
  var StringValues: Array[String] = Array.empty

  def setString(key: String, value: String): String = {
    if (StringKeys.indexOf(key) > -1) {
      StringValues(StringKeys.indexOf(key)) = value
    } else {
      StringKeys = StringKeys :+ key
      StringValues = StringValues :+ value
    }
    value
  }
  def getString(key: String, value: String = ""): String = {
    if (StringKeys.indexOf(key) > -1) {
      StringValues(StringKeys.indexOf(key))
    } else {
      value
    }
  }
}
