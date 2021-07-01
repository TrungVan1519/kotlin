package com.example.kotlin

fun main() {
    // TODO: for
    for (x in 1..10 step 1) { // same as for(i in 1.until(10).step(1)) { ... }
        print(x)
    }

    for (x in 10 downTo 1 step 2) { // same as for(i in 10.downTo(1).step(2)) { ... }
        print(x)
    }

    // TODO: while
    var y = 1
    while (y <= 10) {
        print(y++)
    }

    // TODO: do-while
    var z = 1
    do {
        print(z++)
    } while (z <= 10)
}
