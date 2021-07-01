package com.example.kotlin

import java.util.*

// TODO: Have use "open"
open class Parent1(var firstName: String, var lastName: String) {

    var age: Int? = null
    var fav: String? = null
        get() = field?.toUpperCase(Locale.ENGLISH) // override default getter

    // TODO: Have use "open"
    open fun printInfo() {
        println("Parent1($firstName, $lastName, $age, $fav)")
    }
}

class Child1(firstName: String, lastName: String, val gender: Boolean) : Parent1(firstName, lastName) {

    override fun printInfo() {
        age = 20
        fav = "coding"
        println("Child1($firstName, $lastName, $age, $fav, $gender)")
    }
}

fun main() {
    val p1 = Parent1("foo", "bar")
    p1.printInfo()

    val c1 = Child1("foobar", "foobar", true)
    c1.printInfo()
}
