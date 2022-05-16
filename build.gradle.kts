import com.google.protobuf.gradle.*
import org.gradle.kotlin.dsl.proto
import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.compose") version "1.0.0"
    id("com.google.protobuf") version "0.8.18"
    java
}

group = "me.pegas"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(compose.desktop.currentOs)

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
// https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib-jdk8
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
    implementation("com.google.protobuf:protobuf-kotlin:3.20.1")
    api("com.google.protobuf:protobuf-java-util:3.20.1")
    api("com.google.protobuf:protobuf-kotlin:3.20.1")
    // https://mvnrepository.com/artifact/com.googlecode.protobuf-java-format/protobuf-java-format
    implementation("com.googlecode.protobuf-java-format:protobuf-java-format:1.4")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "2_0_Lora_VION"
            packageVersion = "1.0.0"
        }
    }
}

val pathProtoFiles = "proto_files"
val pathProtoFilesCommon = "$pathProtoFiles/Proto_files_common"
val pathProtoFilesCommercial = "$pathProtoFiles/Proto_files_commerc"
val pathProtoFilesMilitary = "$pathProtoFiles/Proto_files_military"

/**
 * The Task copies proto files from the submodule
 * start task : gradle for project -> other -> copyProtoFilesFromSubmodule
 */
val copyProtoFilesFromSubmodule = tasks.register<Copy>("copyProtoFilesFromSubmodule") {

    println("Start coping proto files from a submodule")

    // setting paths to proto files what you need to copy from proto_files submodule for generating
    val sourcePathsFile1 = "$pathProtoFilesCommon/esp.proto"
    //val sourcePathsFile2 = "$pathProtoFilesCommon/esp_srv.proto"
    // val sourcePathsFile3 = "$pathProtoFilesCommon/filesystem.proto"
    // val sourcePathsFile4 = "$pathProtoFilesCommon/firmware.proto"
    val sourcePathsFile5 = "$pathProtoFilesCommon/forpost.proto"
    // val sourcePathsFile6 = "$pathProtoFilesCommon/runtime_dbg.proto"
    // val sourcePathsFile7 = "$pathProtoFilesCommercial/additional_device.proto"
    //      val sourcePathsFile8 = "$pathProtoFilesCommercial/BombPro.proto"
    // val sourcePathsFile9 = "$pathProtoFilesCommercial/forpost_server.proto"
    //  val sourcePathsFile10 = "$pathProtoFilesCommercial/stress_belt.proto"
    // val sourcePathsFile11 = "$pathProtoFilesCommercial/tagger.proto"

    // loading paths
    from(
        sourcePathsFile1,
        // sourcePathsFile2
        // sourcePathsFile3,
        // sourcePathsFile4,
        sourcePathsFile5
        // sourcePathsFile6,
        // sourcePathsFile7,
        // sourcePathsFile8,
        // sourcePathsFile9
        // sourcePathsFile10,
        // sourcePathsFile11
    )

    // setting out directory
    val pathOut = "$buildDir/protobuf_source_files"
    into(pathOut)

    if (inputs.sourceFiles.isEmpty) {
        throw GradleException("File not found: sourcePathsFile check init a submodule and the path to files.")
    }

    println("Proto files from a submodule copied")
}


sourceSets {

    main {
        proto {
            srcDir("$buildDir/protobuf_source_files")
        }

        java.srcDirs("src/main/java")
    }

    test {
        java.srcDirs("src/test/java")
    }
}

/**
 * Main Task for Protobuf generation
 * Do not set generatedFilesBaseDir. You will have problems with duplicate files in build and source directories
 * generatedFilesBaseDir = "$projectDir/src/main/kotlin/proto"
 */
protobuf {

    //mkdir("$projectDir/src/main/java/proto_files")
    //generatedFilesBaseDir = "$projectDir/src/main/java/proto_files"

    protoc {
        artifact = "com.google.protobuf:protoc:3.20.1"
    }

    plugins {
        id("javaapi") {
            path = "tools/protoc-gen-javaapi.exe"
        }
    }

    /**
     * The Task generates java / kotlin files
     * Before starting task : check "$buildDir/protobuf_source_files" a directory
     * start task : gradle for project -> other -> copyProtoFilesFromSubmodule
     */
    generateProtoTasks {
        all().forEach {
            //it.plugins {
            //   id("javaapi"){
            //   }
            //}
            it.builtins {
                id("kotlin") {}
            }
        }
    }
}

// If you need to change directories for generating and coping files
val pathAutoGenerationFiles = "generated/source/proto/main"
val pathSrcKotlinFiles = "src/main/kotlin/generation_java_files"
val pathSrcJavaFiles = "src/main/java/generation_kotlin_files"

// a task for coping java server/client api files
// start task : gradle for project -> other -> copyJavaServerClientApiFile
val copyJavaServerClientApiFile = tasks.register<Copy>("copyJavaServerClientApiFile") {
    println("Start coping java server/client api files")

    // setting source directory
    val sourcePaths = "$buildDir/$pathAutoGenerationFiles/javaapi"
    from(sourcePaths)

    // setting out directory
    val pathOut = "$projectDir/$pathSrcJavaFiles"
    into(pathOut)

    //if (inputs.sourceFiles.isEmpty) {
    //    throw GradleException("File not found: $sourcePaths , you need to generate proto files." +
    //            "For generating files you need to start generationProto task in gradle." +
    //            "The path is gradle for project -> other -> copyJavaServerClientApiFile"
    //    )
    //}

    println("Java server/client api files copied")
}

// a task for coping kotlin server/client api files
// start task : gradle for project -> other -> copyKotlinServerClientApiFile
val copyKotlinServerClientApiFile = tasks.register<Copy>("copyKotlinServerClientApiFile") {
    println("Start coping kotlin server/client api files")

    // setting source directory
    val sourcePaths = "$buildDir/$pathAutoGenerationFiles/javaapi"
    from(sourcePaths)

    // setting out directory
    val pathOut = "$projectDir/$pathSrcKotlinFiles"
    into(pathOut)

    //if (inputs.sourceFiles.isEmpty) {
    //    throw GradleException("File not found: $sourcePaths , you need to generate proto files." +
    //            "For generating files you need to start generationProto task in gradle." +
    //            "The path is gradle for project -> other -> copyKotlinServerClientApiFile"
    //    )
    //}

    println("Kotlin server/client api files copied")
}

