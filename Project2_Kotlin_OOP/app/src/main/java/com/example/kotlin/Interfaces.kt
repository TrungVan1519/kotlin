package com.example.kotlin

import java.util.*

interface IParent2 {

    var age: Int?
    var fav: String?

    fun printInfo()
    fun getInfo(): String {
        return "$age, $fav"
    }
}

class Child2(var firstName: String, var lastName: String, var gender: Boolean) : IParent2 {

    override var age: Int? = null
    override var fav: String? = null
        get() = field?.toUpperCase(Locale.ENGLISH) // override default getter

    override fun printInfo() {
        age = 20
        fav = "coding"
        println("Child2($firstName, $lastName, $age, $fav, $gender)")
    }

    override fun getInfo(): String {
        return "Child2($firstName, $lastName, ${super.getInfo()}, $gender)"
    }
}

fun main() {
    val c2 = Child2("foo", "bar", true)
    c2.printInfo()
    println(c2.getInfo())
}
