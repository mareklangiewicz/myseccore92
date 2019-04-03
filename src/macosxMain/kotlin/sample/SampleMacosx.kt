package sample

actual class Sample {
    actual fun checkMe() = 67
}

actual object Platform {
    actual fun name(): String = "MacOSX"
}