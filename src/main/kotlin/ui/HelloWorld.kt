import generation.KotlinApi

public class HelloWorld{

  val api = KotlinApi()
  var value : Int? = null

  fun testapi(): Boolean {
    value = 5
    value?.let {
      return true
    }

    return false
  }



}

fun main() {
  val helloWorld = HelloWorld().testapi()
  print(helloWorld)
}
