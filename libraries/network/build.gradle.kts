import Dependencies.implementCompose
import Dependencies.implementHilt
import Dependencies.implementNetworkCore
import Dependencies.implementCore

plugins {
    id(Dependencies.Plugin.androidLibrary)
    id(Dependencies.Plugin.kotlinAndroid)
    id(Dependencies.Plugin.kapt)
    id(Dependencies.Plugin.hilt)
}

android {
    namespace = "${AppConfig.basePackage}.network"
    compileSdk = AppConfig.compileSdk
}

dependencies {
    implementation("androidx.test:monitor:1.5.0")
    implementation("androidx.test.ext:junit-ktx:1.1.3")
    implementCore()
    implementHilt()
    implementCompose()
    implementNetworkCore()
}