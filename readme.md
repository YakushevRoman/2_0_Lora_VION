**Pet - проект по настройке использования Protobuf для автоматической генерации файлов и Server / Client API**

Примечания:

`1.`    Настройка проекта для генерации осуществляется на kotlin kts для gradel(данный код можно перенести на обычный
gradle если в этом будет необходимость)

`2.`    Перед работой с генерацией проверьте инициализацию submodule с proto файлами proto_files

- http://forpost-centr.ddns.net:22222/Library/Proto_files

`3.`    Для работы с проектами java/kotlin минимальная версия JDK 11

`4.`    Иметь базовое представление о запуске отложенных задач с gradle
-https://docs.gradle.org/current/samples/index.html

`5.`    Документация по работе с protobuf plugin - https://github.com/google/protobuf-gradle-plugin

`6.`    Исходный код генератора - http://forpost-centr.ddns.net:22222/Library/proto-gen

`7.`    Код проекта с настройкой с генерацией - https://github.com/YakushevRoman/2_0_Lora_VION

**Работа с исходными .proto файлами для генерации java / kotlin**
Важно!!! Исходные .proto файлы должны быть в единственном экземпляре

Для этого необходимо подключить в проект который будет использовать .proto файлы сабмодуль со следующими параметрами.

Преред первой настройкой нужно будет проинициализировать submodule Вызовите в терминале - `git submodule init`

```groovy
[submodule "proto_files"]
path = proto_files
url = http://forpost.ddns.net:22222/Library/Proto_files.git

```
**Указываем пути к папкам которые хранят наши исходные  .proto файлы**


```kotlin
val pathSubmodule = "proto_files"

val pathProtoFilesCommon = "$pathSubmodule/Proto_files_common"
val pathProtoFilesCommercial = "$pathSubmodule/Proto_files_commerc"

val protoDirectories = listOfNotNull(
    pathProtoFilesCommon,
    pathProtoFilesCommercial
)

// If you need to change directories for generating and coping files
val pathAutoGenerationFiles = "generated/source/proto/main"
val pathSrcKotlinFiles = "src/main/kotlin/generation_java_files"
val pathSrcJavaFiles = "src/main/java/generation_kotlin_files"


```

**Указываем для protobuf plugin исходные директории**

```kotlin
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

```

**Настройка плагина для генерации**

```kotlin
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
            path = "tools/protoc"
        }
    }

    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("javaapi") {}
            }
            it.builtins {
                id("kotlin") {}
            }
        }
    }
}

```

**Скопировать server / client api файлы в нужные директории**

```kotlin
// start task : gradle for project -> other -> copyJavaServerClientApiFile
val copyJavaServerClientApiFile = tasks.register<Copy>("copyJavaServerClientApiFile") {
    val srcPath = "$buildDir/$pathAutoGenerationFiles/javaapi"
    from(srcPath)

    val outPath = "$projectDir/$pathSrcJavaFiles"
    into(outPath)
}

```

```kotlin
// start task : gradle for project -> other -> copyKotlinServerClientApiFile
val copyKotlinServerClientApiFile = tasks.register<Copy>("copyKotlinServerClientApiFile") {
    val srcPath = "$buildDir/$pathAutoGenerationFiles/javaapi"
    from(srcPath)

    val outPath = "$projectDir/$pathSrcKotlinFiles"
    into(outPath)
}

```

После всей настройки проекта нажимаем Build project, файлы после автогенерации будут доступны по пути
`java_package = "build.generated.source.proto.main.java"`

Далее делаем Reload `All Gradle Project`.

После этого java/kotlin файлы в java_package = "build.generated.source.proto.main.java" будут помечены как 
исходные деректории и будут доступны для использование в любом модуле проекта.
