package com.example.kotlin

fun main() {
    // TODO: if-else
    if ("".isEmpty()) {
        print("Empty")
    } else {
        print("Not empty")
    }

    // TODO: when
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
}
