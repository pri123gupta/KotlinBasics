package com.example.revision.basic

fun main() {
    val op= OnePlus("keypadtype")
    val mb= Mobile("keypadtype")
//    op.call()
//    println(op.height)
    op.display()
     mb.toString()
}

open class Mobile(val type:String) {
   open val name: String = "Smartphone"
    open val platform: String = "Android"
    open val height: Int =5
    open fun call(){
        println("mobile Calling")
    }
    open  fun display(){
        println("mobile display")
    }

    override fun toString(): String {
        return "mobile return"
    }
}

class OnePlus(val t:String):Mobile(t){
    override val name = "One plus mob"
    override fun call() {
        super.call()
        println("oneplus call ")
    }

    override fun display() {
        super.display()
        println("oneplusDisplay")
    }

    override fun toString(): String {
        return "oneplus return $name - test addition"
    }
}