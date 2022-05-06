import generation.KotlinApi

public class HelloWorld{

  val api = KotlinApi()
  var value : Int? = null

  fun testapi(): Boolean {

  }

}

fun main() {
  val helloWorld = HelloWorld().testapi()
  print(helloWorld)
}
