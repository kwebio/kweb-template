plugins {
   kotlin("jvm") version "1.7.20"
   application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.kweb:kweb-core:1.1.2.1")
    implementation("ch.qos.logback:logback-classic:1.4.4")
}
