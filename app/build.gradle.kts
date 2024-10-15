plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.biopredict"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.biopredict"
        minSdk = 24
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    androidResources {
        noCompress; "tflite"
        noCompress; "lite"
    }
}

dependencies {
    implementation ("org.tensorflow:tensorflow-lite:+")
    implementation(libs.appcompat)
    val implementation = implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}