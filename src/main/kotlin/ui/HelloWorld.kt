import generation.KotlinServerApi

public class HelloWorld{

  val api = KotlinServerApi()
  var value : Int? = null

  fun testapi(): Boolean  = true

}

fun main() {
  val helloWorld = HelloWorld().testapi()
  print(helloWorld)
}
