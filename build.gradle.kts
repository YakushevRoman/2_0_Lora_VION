import com.google.protobuf.gradle.*
import org.gradle.kotlin.dsl.proto
import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.compose") version "1.0.0"
    id("com.google.protobuf") version "0.8.18"
}

group = "me.pegas"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    project("protobuf")

    testImplementation(kotlin("test"))
    implementation(compose.desktop.currentOs)

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
// https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib-jdk8
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
    implementation("com.google.protobuf:protobuf-kotlin:3.19.4")
    api("com.google.protobuf:protobuf-java-util:3.19.4")
    api("com.google.protobuf:protobuf-kotlin:3.19.4")

    api("io.grpc:grpc-protobuf:1.44.0")
    api("io.grpc:grpc-kotlin-stub:1.2.1")
    api("io.grpc:grpc-stub:1.44.0")
    runtimeOnly("io.grpc:grpc-netty:1.44.0")

    // https://square.github.io/kotlinpoet/
    implementation("com.squareup:javapoet:1.13.0")
    implementation("com.squareup:kotlinpoet:1.11.0")

    implementation("com.google.protobuf:protoc:3.19.4")
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

sourceSets {
    main {
        proto {
            srcDir("src/main/protobuf")
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.19.4"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.44.0"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.2.1:jdk7@jar"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
            it.builtins {
                id("kotlin")
            }
        }
    }
}
