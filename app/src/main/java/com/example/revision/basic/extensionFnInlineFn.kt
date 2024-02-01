package com.example.revision.basic

fun main() {
    //when the super class is not open and still we have to add function to the class, we use extension fn

    val name = "Simply code"
//    print(name.formattedString())

//    2. inline fn - if we use lambdas for everything it will be a performance hit bcoz extra objects will be created,
//    so use inline, it simply paste the code in bytecode, no extra objects are created, for performance benefit.

    calculateTimeAndRun { loop(1000000) }
    calculateTimeAndRun { loop(1000000) }
    calculateTimeAndRun { loop(1000000) }
}

// this is an extension function
fun String.formattedString(): String {
    return "----------\n$this\n----------"
}

fun loop(n: Long) {

    for (i in 1..n) {
        println(i)
    }
}

inline fun calculateTimeAndRun(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    val dif= end-start
    println("time taken = $dif ms")
}