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
    implementation(project(":feature_protobuff_server_client"))
    implementation(compose.desktop.currentOs)

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
// https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib-jdk8
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
    implementation("com.google.protobuf:protobuf-kotlin:3.20.1")
    api("com.google.protobuf:protobuf-java-util:3.20.1")
    api("com.google.protobuf:protobuf-kotlin:3.20.1")
    // https://mvnrepository.com/artifact/com.googlecode.protobuf-java-format/protobuf-java-format
    implementation("com.googlecode.protobuf-java-format:protobuf-java-format:1.4")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.1")

    testImplementation ("junit:junit:4.13.2")
    testImplementation ("org.junit.vintage:junit-vintage-engine:5.8.0")
}

tasks.named<JavaCompile>("compileJava"){
    options.encoding = "UTF-8"
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


val pathSubmodule = "proto_files"

//val pathProtoFilesCommon = "$pathSubmodule/Proto_files_common"
//val pathProtoFilesCommercial = "$pathSubmodule/Proto_files_commerc"
val pathProtoFilesMilitary = "$pathSubmodule/Proto_files_military_"

val protoDirectories = listOfNotNull(
    //pathProtoFilesCommon,
    pathProtoFilesMilitary
)

// If you need to change directories for generating and coping files
val pathAutoGenerationFiles = "generated/source/proto/main"
val pathSrcKotlinFiles = "src/main/kotlin/generation_java_files"
val pathSrcJavaFiles = "src/main/java/generation_kotlin_files"

sourceSets {
    main {
        proto {
            srcDirs(protoDirectories)
        }
        java.srcDirs("src/main/java")
    }

    test {
        java.srcDirs("src/test/java")
    }
}

protobuf {

    for (directory in protoDirectories) {
        val files = file(directory).list() ?: throw GradleException(
            "Directory - $directory was not found. " +
                    "Check init submodule for $pathSubmodule"
        )

        if (files.isEmpty()) throw GradleException(
            "Directory - $directory does not have files for generating. " +
                    "Check files in the $directory"
        )
    }

    protoc {
        artifact = "com.google.protobuf:protoc:3.20.1"
    }

    plugins {
        id("javaapi") {
            path = "tools/protoc-gen-javaapi.exe"
        }
    }

    generateProtoTasks {
        all().forEach {
            it.plugins {
                // id("javaapi"){}
            }
            it.builtins {
                id("kotlin") {}
            }
        }
    }
}

// start task : gradle for project -> other -> copyJavaServerClientApiFile
val copyJavaServerClientApiFile = tasks.register<Copy>("copyJavaServerClientApiFile") {
    val srcPath = "$buildDir/$pathAutoGenerationFiles/javaapi"
    from(srcPath)

    val outPath = "$projectDir/$pathSrcJavaFiles"
    into(outPath)
}

// start task : gradle for project -> other -> copyKotlinServerClientApiFile
val copyKotlinServerClientApiFile = tasks.register<Copy>("copyKotlinServerClientApiFile") {
    val srcPath = "$buildDir/$pathAutoGenerationFiles/javaapi"
    from(srcPath)

    val outPath = "$projectDir/$pathSrcKotlinFiles"
    into(outPath)
}

