package com.example.revision.basic

fun main() {
    val a = Animal()
    a.walk()
    val d=Dog()
    d.name()
//    d.walk()
}

open class Animal(){
    init {
        println("Parent animal init block")
    }
    fun walk(){
        println("There is an animal")
    }
}

class Dog():Animal(){
    init {
        println("Child dog init block")
    }
    fun name(){
        println("There is a dog")
    }
}
open class Cat():Animal(){
    fun meow(){
        println("There is a cat")
    }
}