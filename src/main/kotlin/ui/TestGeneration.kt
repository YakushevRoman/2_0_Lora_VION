package server_grpc

import com.squareup.kotlinpoet.*
import java.nio.file.Paths
import java.util.*


fun main() {
    gen()
}
fun gen (){
    val today = FunSpec.builder("today")
        .returns(Date::class)
        .addStatement("return %T()", Date::class)
        .build()

    val helloWorld = TypeSpec.classBuilder("HelloWorld")
        .addFunction(today)
        .build()

    val kotlinFile = FileSpec.builder("", "HelloWorld")
        .addType(helloWorld)
        .build()

    kotlinFile.writeTo(Paths.get("C:\\Users\\pegas\\IdeaProjects\\2_0_Lora_VION\\src\\main\\kotlin\\ui"))
}