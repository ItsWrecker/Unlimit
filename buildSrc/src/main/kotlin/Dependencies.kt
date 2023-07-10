object Dependencies {

    object Compose {
        const val composeBOM = "androidx.compose:compose-bom:2022.10.00"
        const val composeUI = "androidx.compose.ui:ui"
        const val composeUIGraphics = "androidx.compose.ui:ui-graphics"
        const val composePreview = "androidx.compose.ui:ui-tooling-preview"
        const val composeMaterial = "androidx.compose.material3:material3"
        const val navigation = "androidx.navigation:navigation-compose:2.6.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.1"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1"
    }

    object Test {
        const val jUnit = "junit:junit:4.13.2"
        const val jUnitExt = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
        const val composeBOM = "androidx.compose:compose-bom:2022.10.00"
        const val composeUI = "androidx.compose.ui:ui-test-junit4"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling"
        const val composeUiManifest = "androidx.compose.ui:ui-test-manifest"
    }

    object Core {
        const val coreKtx = "androidx.core:core-ktx:1.8.0"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
        const val composeActivity = "androidx.activity:activity-compose:1.5.1"
    }

    object Inject {
        const val hilt = "com.google.dagger:hilt-android:2.44"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:2.44"
        const val javax = "javax.inject:javax.inject:1"
    }

    object Kotlin {
        const val androidCoroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2"
        const val collection = "org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5"
        const val serializer ="org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
    }

    object Room {
        const val roomVersion = "2.5.2"
        const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
        const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
        const val roomKtx = "androidx.room:room-ktx:$roomVersion"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val retrofitGson = "com.google.code.gson:gson:2.10.1"
        const val retrofitConverter = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val loggingIntercepter = "com.squareup.okhttp3:logging-interceptor:4.11.0"
    }


    val dataStore = "androidx.datastore:datastore:1.0.0"

    const val glide = "com.github.bumptech.glide:compose:1.0.0-alpha.1"

}