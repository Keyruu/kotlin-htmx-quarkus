plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.allopen") version "1.9.23"
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://repo.mvnpm.org/maven2")
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-resteasy-reactive")
    implementation("io.quarkus:quarkus-scheduler")
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.11.0")
    implementation("se.michaelthelin.spotify:spotify-web-api-java:8.3.6")
    // Web dependencies
    implementation("io.quarkiverse.web-bundler:quarkus-web-bundler:1.4.0")
    implementation("org.mvnpm:htmx.org:1.9.11")
    implementation("org.mvnpm:alpinejs:3.13.7")
    // Test dependencies
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
}

group = "de.keyruu"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

task<Exec>("tailwind") {
    inputs.dir("src/main/kotlin/de/keyruu/")
    outputs.file("src/main/resources/web/app/css/_output.css")

    commandLine = listOf("bash", "-c", "npm run tailwind")
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}
allOpen {
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.enterprise.context.ApplicationScoped")
    annotation("jakarta.persistence.Entity")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_21.toString()
    kotlinOptions.javaParameters = true
}

