plugins {
    id("java")
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.13"
}

val javafxVersion = "17";
val javafxPlatform = "win"

group = "com.jastermaster"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "https://nexus.gluonhq.com/nexus/content/repositories/releases/")
    mavenCentral()
    google()
}

application {
    mainClass.set("com.jastermaster.Main")
}

javafx {
    version = javafxVersion
    modules("javafx.base", "javafx.controls", "javafx.fxml", "javafx.media")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.openjfx:javafx-base:${javafxVersion}:${javafxPlatform}")
    implementation("org.openjfx:javafx-controls:${javafxVersion}:${javafxPlatform}")
    implementation("org.openjfx:javafx-fxml:${javafxVersion}:${javafxPlatform}")
    implementation("org.openjfx:javafx-graphics:${javafxVersion}:${javafxPlatform}")
    implementation("org.openjfx:javafx-media:${javafxVersion}:${javafxPlatform}")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}