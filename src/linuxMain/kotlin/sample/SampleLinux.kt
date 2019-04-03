package sample

actual class Sample {
    actual fun checkMe() = 77
}

actual object Platform {
    actual fun name(): String = "Linux"
}