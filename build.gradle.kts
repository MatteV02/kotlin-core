plugins {
    kotlin("jvm") version "1.9.20"
    application
}

group = "com.MatteV02.exercises"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/io.kotest/kotest-runner-junit5-jvm
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.8.0")
    // https://mvnrepository.com/artifact/io.kotest/kotest-assertions-core-jvm
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.8.0")
    // https://mvnrepository.com/artifact/io.kotest/kotest-property-jvm
    implementation("io.kotest:kotest-property-jvm:5.8.0")
    // https://mvnrepository.com/artifact/io.kotest/kotest-framework-datatest-jvm
    implementation("io.kotest:kotest-framework-datatest-jvm:5.8.0")


}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}