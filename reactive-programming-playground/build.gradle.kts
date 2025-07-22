plugins {
	java
}

group = "vn.edu.ptit.duongvct"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(platform("io.projectreactor:reactor-bom:2024.0.1"))

    // Main dependencies
    implementation("io.projectreactor:reactor-core")
    implementation("io.projectreactor.netty:reactor-netty-core")
    implementation("io.projectreactor.netty:reactor-netty-http")
    implementation("ch.qos.logback:logback-classic:1.5.12")
    implementation("com.github.javafaker:javafaker:1.0.2")

    // Test dependencies
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.11.3")
    testImplementation("io.projectreactor:reactor-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
