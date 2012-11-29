package samples

import net.liftweb.json._
import org.scalatest.Assertions
import org.junit.Test

class HelloJsonSuite extends Assertions {

  @Test def helloJson() {
    val data = """{"hello":"json"}"""
    val json = parse(data)
    assert(json.toString === "JObject(List(JField(hello,JString(json))))")
  }

}
