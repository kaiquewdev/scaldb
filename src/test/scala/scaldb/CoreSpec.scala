package scaldb

import org.scalatest._

class CoreSpec extends FlatSpec with Matchers {
  val core = new Core()

  "The core class" should "have an type" in {
    core.isInstanceOf[Core] shouldEqual true
  }

  "The core class" should "have a setter for a string key" in {
    core.setString("scaldb_key_value","scaldb_raw_value") shouldEqual "scaldb_raw_value"
  }

  "The core class" should "have a setter for a string key with returns a string type" in {
    core.setString("scaldb_key_type","scaldb_type_value").isInstanceOf[String] shouldEqual true
  }

  "The core class" should "have a getter for a string key" in {
    core.getString("scaldb_key_value") shouldEqual "scaldb_raw_value"
  }

  "The core class" should "have a getter for string key with those type" in {
    core.getString("scaldb_key_value").isInstanceOf[String] shouldEqual true
  }

  "The core class" should "have a setter overwrite key" in {
    core.setString("scaldb_key_value","scaldb_raw_value_overwritted") shouldEqual "scaldb_raw_value_overwritted"
    core.getString("scaldb_key_value") shouldEqual "scaldb_raw_value_overwritted"
  }
}
