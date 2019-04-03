package sample

actual class Sample {
    actual fun checkMe() = 87
}

actual object Platform {
    actual fun name(): String = "AndroidNative"
}