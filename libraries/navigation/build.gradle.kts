import Dependencies.implementNavigation

plugins {
    id(Dependencies.Plugin.androidLibrary)
    id(Dependencies.Plugin.kotlinAndroid)
    id(Dependencies.Plugin.kapt)
}

android {
    namespace = "${AppConfig.basePackage}.navigation"
    compileSdk = AppConfig.compileSdk

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = AppConfig.kotlinCompilerExtVersion
    }
}

dependencies {
    implementation("androidx.test:monitor:1.5.0")
    implementation("androidx.test.ext:junit-ktx:1.1.3")
    implementNavigation()

    implementation(Dependencies.ThirdParty.hiltAndroid)
}