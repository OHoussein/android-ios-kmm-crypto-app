plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

apply(from = "$rootDir/gradle/scripts/detekt.gradle")
apply(from = "$rootDir/androidModule.gradle")

android {
    namespace = "dev.ohoussein.cryptoapp.data.network"
}

dependencies {
    implementation(libs.core.kotlin.coroutines.core)
    implementation(libs.data.retrofit.lib)
    implementation(libs.data.retrofit.moshi)

    implementation(libs.core.dagger.hilt)
    implementation(libs.test.hilt)
    kapt(libs.core.dagger.hilt.android.compiler)

    implementation(libs.data.room.ktx)
    kapt(libs.data.room.compiler)
    annotationProcessor(libs.data.room.compiler)

    testImplementation(libs.test.robolectric)
}
