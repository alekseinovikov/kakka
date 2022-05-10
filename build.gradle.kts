import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    kotlin("jvm") version "1.6.20"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "com.kakka"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }

    dependencies {
        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
    }
}
