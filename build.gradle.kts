import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.spring") version "1.5.10"
    kotlin("plugin.jpa") version "1.5.10"
}

allOpen{
    annotation("javax.persistence.Entity")
}

noArg{
    annotation("javax.persistence.Entity")
}

group = "jun.me"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
}

val kotestVersion = "4.6.0"

dependencies {
    implementation ("com.h2database:h2")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation ("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation ("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation ("io.kotest:kotest-extensions-spring:4.3.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
