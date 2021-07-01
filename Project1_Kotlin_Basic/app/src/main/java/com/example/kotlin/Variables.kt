package com.example.kotlin

fun main() {
    /**
     * NonNull vs Nullable
     */
    val firstName = ""              // default is non null
    val lastName: String? = null    // nullable with ? operator

    /**
     * Data types
     */
    // TODO: integer number types: Byte (8 bits), Short (16 bits), Int (32 bits), Long (64 bits)
    val byte: Byte = 12
    val short: Short = 123
    val int: Int = 123_123
    val long: Long = 39_812_309_487_120_300

    // TODO: floating number types: Float (32 bits), Double (64 bits)
    val float: Float = 12.34f
    val double: Double = 3.14159265

    // TODO: boolean type
    val boolean: Boolean = true

    // TODO: char type
    val char: Char = 'f'

    // TODO: string typ
    val string: String = "foobar"
}
