package com.example.revision.basic

import kotlin.Cloneable

fun main() {
    val testSingleton = object {
        val x = 10
    }
    var anonySingleton = object : Cloneable1 {
        val a = 200
          override fun clone() {
            println("Clone $a ")
        }
    }
//    anonySingleton.clone()
//    println(anonySingleton.a)


    val obj2 = object :Person1("Priyanka"){
        override fun fullName() {
            super.fullName()
            println("anonymous - $name ")
        }
    }
    obj2.fullName()
}
interface Cloneable1{
    fun clone()
}

open class Person1(val name :String){
   open fun fullName (){
        println("Full Name - $name ")
    }
}