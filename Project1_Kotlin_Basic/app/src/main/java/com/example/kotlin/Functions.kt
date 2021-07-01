package com.example.kotlin

fun main() {
    println(info("Hello", "dau xanh"))
    printInfo("Hello", "dau xanh")

    defaultParam()

    namedArgs(greeting = "Hello", name = "dau xanh")

    varArgs("Hello", "dau xanh", "rau muong", "khoai san")
    varArgs("Hello", *arrayOf("dau xanh", "rau muong", "khoai san"))
}

/**
 * Function declaration: Function return String
 */
fun info(greeting: String, name: String): String {
    return "$greeting $name"
}

/**
 * Function declaration: Function return void
 */
fun printInfo(greeting: String, name: String) {
    println("$greeting $name")
}

/**
 * Default param value
 */
fun defaultParam(greeting: String = "Hello", name: String = "dau xanh") {
    println("$greeting $name")
}

/**
 * Named args
 */
fun namedArgs(greeting: String, name: String) {
    println("$greeting $name")
}

/**
 * Var args
 */
fun varArgs(greeting: String, vararg names: String) {
    var msg = greeting
    names.forEach { name -> msg += name }
    println(msg)
}

