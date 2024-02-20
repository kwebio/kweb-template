plugins {
   kotlin("jvm") version "1.9.22"
   application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.kweb:kweb-core:1.3.7")
    implementation("ch.qos.logback:logback-classic:1.4.7")
}
