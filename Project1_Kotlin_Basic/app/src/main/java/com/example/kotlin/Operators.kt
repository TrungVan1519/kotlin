package com.example.kotlin

fun main() {
    // TODO: ternary operator
    val isEmplty = if ("".isEmpty()) "Empty" else "Not empty"

    // TODO: "?" operator
    var name = ""
    val nullableName: String? = null

    nullableName?.let { print(nullableName) }   // safe calling
    name = nullableName?: ""                    // elvis

    // TODO: "in" operator
    val month = 1
    when (month) {
        in 3..5 -> print("Spring")
        in 6..8 -> print("Summer")
        in 9..11 -> print("Fall")
        12, 1, 2 -> print("Winter")
        else -> {
            print("Invalid month")
            print("Try again...")
        }
    }

    // TODO: "is" operator
    val x: Any = 13.37f
    when(x) {
        is Int -> print("$x is an Int")
        is Float -> print("$x is an Float")
        is Double -> print("$x is an Double")
        else -> print("$x is another data type")
    }

    // TODO: "as" operator
    val y: Any = 123
    val z = y as? String                        // safe casting
}
