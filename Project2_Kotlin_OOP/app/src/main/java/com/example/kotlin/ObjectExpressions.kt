package com.example.kotlin

import java.util.*

open class Parent4(var firstName: String, var lastName: String) {

    var age: Int? = null
    var fav: String? = null
        get() = field?.toUpperCase(Locale.ENGLISH) // override default getter

    open fun printInfo() {
        println("Parent4($firstName, $lastName, $age, $fav)")
    }
}

fun main() {
    val c4 = object : Parent4("foo", "bar") {

        val gender = true

        override fun printInfo() {
            age = 20
            fav = "coding"
            println("object($firstName, $lastName, $age, $fav, $gender)")
        }
    }

    c4.printInfo()
}
