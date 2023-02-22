import Dependencies.implementCompose
import Dependencies.implementLifecycle
import Dependencies.implementCore
import Dependencies.implementHilt
import Dependencies.implementNetworkCore
import Dependencies.implementRoom

plugins {
    id(Dependencies.Plugin.androidLibrary)
    id(Dependencies.Plugin.kotlinAndroid)
    id(Dependencies.Plugin.kapt)
    id(Dependencies.Plugin.hilt)
}

android {
    namespace = "${AppConfig.basePackage}.common"
    compileSdk = AppConfig.compileSdk

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = AppConfig.kotlinCompilerExtVersion
    }
}

dependencies {
    implementation("androidx.test.ext:junit-ktx:1.1.3")
    implementHilt()
    implementCore()
    implementCompose()
    implementLifecycle()
    implementNetworkCore()
    implementRoom()

    implementation(Dependencies.Android.constraintLayout)
    implementation(Dependencies.Android.pagging)
    implementation(Dependencies.ThirdParty.glideCompose)

    addModule(Libraries.network)
}