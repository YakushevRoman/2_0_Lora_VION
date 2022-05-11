//import generation.KotlinServerApi

public class HelloWorld{

  //val api = KotlinServerApi()
  var value : Int? = null

  fun testapi(): Boolean{


    val bombPro = BombPro.ActionsTypeEnum.ACTIVATED
    return true
  }

}

fun main() {
  val helloWorld = HelloWorld().testapi()
  print(helloWorld)
}
