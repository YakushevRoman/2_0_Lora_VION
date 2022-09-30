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
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    //implementation(project(":feature_protobuff_server_client"))

    implementation(compose.desktop.currentOs)

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib-jdk8
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
    implementation("com.google.protobuf:protobuf-kotlin:3.21.5")
    api("com.google.protobuf:protobuf-java-util:3.21.5")
    api("com.google.protobuf:protobuf-kotlin:3.21.5")
    // https://mvnrepository.com/artifact/com.googlecode.protobuf-java-format/protobuf-java-format
    implementation("com.googlecode.protobuf-java-format:protobuf-java-format:1.4")
}

tasks.named<JavaCompile>("compileJava") {
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

val pathProtoFilesCommon = "$pathSubmodule/Proto_files_common"
val pathProtoFilesMilitary = "$pathSubmodule/Proto_files_commerc"

val protoDirectories = listOfNotNull(
    pathProtoFilesCommon,
    pathProtoFilesMilitary
)

sourceSets {
    main {
        proto {
            srcDirs(protoDirectories)
            exclude(
                "**/vest_rs485.proto",
                "**/vest_setting.proto",
                "**/posix_file_system.proto",
                "**/tvout.proto",
                "**/*Fourth_generation_BLE",
                "**/*Nrf_driver",
                "**/*ShootHouse"
            )
        }
        java.srcDirs("src/main/java", "src/main/kotlin")
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
            path = "proto_files/protoc-gen-javaapi.exe"
        }
    }

    generateProtoTasks {
        all().forEach {
            it.builtins {
                id("kotlin") {}
            }
            it.plugins {
                //id("javaapi") {
                //    outputSubDir = "java"
                //}
            }

        }
    }
}
