package com.example.kotlin

import java.lang.Exception

fun type1() {
    try {
        throw Exception("Error in type1()")
    } catch (e: Exception) {
        println(e)
    }
}

fun type2() {
    try {
        val arr = ArrayList<Int> ()
        arr[1000] = 1000
    } catch (e: Exception) {
        println(e)
    }
}

fun main() {
    type1()
    type2()
}
