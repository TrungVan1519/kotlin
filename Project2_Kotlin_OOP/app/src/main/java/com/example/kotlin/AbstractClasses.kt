package com.example.kotlin

import java.util.*

abstract class Parent3(var firstName: String, var lastName: String) {

    var age: Int? = null
    var fav: String? = null
        get() = field?.toUpperCase(Locale.ENGLISH) // override default getter

    abstract fun printInfo()
    abstract fun getInfo(): String
}

class Child3(firstName: String, lastName: String, val gender: Boolean) : Parent3(firstName, lastName) {

    override fun printInfo() {
        age = 20
        fav = "coding"
        println("Child3($firstName, $lastName, $age, $fav, $gender)")
    }

    override fun getInfo(): String {
        return "Child3($firstName, $lastName, $age, $fav, $gender)"
    }
}

fun main() {
    val c3 = Child3("foo", "bar", true)
    c3.printInfo()
    println(c3.getInfo())
}
