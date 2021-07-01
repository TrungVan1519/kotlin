package com.example.kotlin

val printSum = { a: Int, b: Int -> println(a + b) }
val sum = { a: Int, b: Int -> a + b }

fun main() {
    printSum(10, 5)
    println(sum(10, 5))
}
