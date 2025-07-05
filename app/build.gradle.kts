import org.gradle.internal.impldep.com.google.api.services.storage.model.Bucket

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.cometchatdemo2"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.cometchatdemo2"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures{
        viewBinding=true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // CometChat UIKit
    implementation ("com.cometchat:chat-uikit-android:5.0.2")

    // (Optional) Include this if your app uses voice/video calling features
    implementation ("com.cometchat:calls-sdk-android:4.1.0")

    //Lifecycle ViewModel
        implementation ("androidx.lifecycle:lifecycle-viewmodel:2.8.1")

    // Optional but recommended
    implementation ("androidx.lifecycle:lifecycle-livedata:2.8.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.1")
}