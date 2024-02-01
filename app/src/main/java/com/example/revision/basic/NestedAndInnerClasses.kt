package com.example.revision.basic

fun main() {
    val outer = Outer()
    println(outer.i)

    // when nested class wasn't inner
//    val inner = Outer.Nested()
//    inner.nestedFunDisplay()

    // now since we have made nested class as inner
    val inner = Outer().Nested()
    inner.nestedFunDisplay()

    // use case : recyclerview

}

class Outer {
    val i = 10

    inner class Nested() {
        fun nestedFunDisplay() {
            println("nested fn called $i") // i is not accessible if nested class is not inner
        }
    }
}