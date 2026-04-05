plugins {
    java
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit")
    plugins {
        java
        id("io.quarkus")
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    val quarkusPlatformGroupId: String by project
    val quarkusPlatformArtifactId: String by project
    val quarkusPlatformVersion: String by project

    dependencies {
        implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))

        // Núcleo
        implementation("io.quarkus:quarkus-arc")

        // REST
        implementation("io.quarkus:quarkus-rest")
        implementation("io.quarkus:quarkus-rest-jackson")

        // Base de datos
        implementation("io.quarkus:quarkus-hibernate-orm-panache")
        implementation("io.quarkus:quarkus-jdbc-postgresql")

        // Validaciones
        implementation("io.quarkus:quarkus-hibernate-validator")

        // Seguridad JWT
        implementation("io.quarkus:quarkus-smallrye-jwt")
        implementation("io.quarkus:quarkus-smallrye-jwt-build")

        // Scheduler (sincronización con Syscom)
        implementation("io.quarkus:quarkus-scheduler")

        // Cliente HTTP (para consumir API de Syscom)
        implementation("io.quarkus:quarkus-rest-client")
        implementation("io.quarkus:quarkus-rest-client-jackson")

        // Tests
        testImplementation("io.quarkus:quarkus-junit5")
        testImplementation("io.rest-assured:rest-assured")
    }

    group = "com.avico"
    version = "1.0.0-SNAPSHOT"

    java {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

group = "com.avico"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
