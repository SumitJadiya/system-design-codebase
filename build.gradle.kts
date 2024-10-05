plugins {
    id("java")
    id("application")
}

group = "com.sumit.coding"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.projectlombok:lombok:1.18.30") // Latest version as of now
    annotationProcessor("org.projectlombok:lombok:1.18.30") // For annotation processing
}

// Correct way to set the main class using the application plugin
application {
    mainClass.set(
        project.findProperty("mainClass")?.toString() ?: "com.sumit.coding.Main"
    )
}


tasks.withType<JavaExec> {
    doFirst {
        logging.captureStandardOutput(LogLevel.QUIET)
        logging.captureStandardError(LogLevel.QUIET)
    }
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = false
        events("failed", "skipped")
    }
}