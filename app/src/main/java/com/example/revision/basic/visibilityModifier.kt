package com.example.revision.basic

fun main() {
    println(B().p)
    println(B().r)
    println(B().test())
}

open class A {
    public val p = 10
    private val q = 20
    internal val r = 30
    protected val s = 40
}

class B :A() {
    fun test(){
        println(p)
//        println(q)
        println(r)
        println(s)
    }
}