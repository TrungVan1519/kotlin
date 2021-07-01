package com.example.kotlin

import java.util.*

class Person(var firstName: String, var lastName: String) {

    // TODO: Initializer block
    init {
        println("Create Person:")
    }

    // TODO: Props
    var age: Int? = null
    var fav: String? = null
        get() = field?.toUpperCase(Locale.ENGLISH) // override default getter

    // TODO: Methods
    fun printInfo() {
        age = 20
        fav = "coding"
        println("Person($firstName, $lastName, $age, $fav)")
    }
}

fun main() {
    val p = Person("foo", "bar")
    p.printInfo()
}
