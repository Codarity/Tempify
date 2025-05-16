plugins {
    java
}

group = "%%package%%"
version = "%%version%%"

java {
    sourceCompatibility = JavaVersion.VERSION_%%java_version%%
    targetCompatibility = JavaVersion.VERSION_%%java_version%%
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}
