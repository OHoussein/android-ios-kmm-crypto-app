plugins {
    `kotlin-dsl`
}

group = "dev.ohoussein.cryptoapp.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compileOnly(libs.build.kotlinPlugin)
    compileOnly(libs.build.android.gradlePlugin)
    compileOnly(libs.build.detekt.plugin)
}

gradlePlugin {
    val namespace = "dev.ohoussein.cryptoapp"

    plugins {
        register("detekt") {
            id = "${namespace}.kotlin.detekt"
            implementationClass = "KotlinDetektConventionPlugin"
        }

        register("robolectric") {
            id = "${namespace}.android.robolectric"
            implementationClass = "RobolectricConventionPlugin"
        }
    }
}