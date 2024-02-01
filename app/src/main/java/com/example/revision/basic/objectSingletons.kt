package com.example.revision.basic

fun main() {
    AB.num // singleton
    ABC().num // mukltiple obj possible
    val testobj = object {
        val x = 10
    }
    println(testobj.x)
    totalLikes.incrementfb()
    totalLikes.incrementfb()
    totalLikes.incrementwhts()
    totalLikes.incrementfb()
    totalLikes.incrementtwt()
    totalLikes.incrementwhts()
    totalLikes.display()
}

object AB {
    val num = 5
}

class ABC() {
    val num = 5
}

object totalLikes{
    private var insta =0
    private var fb =0
    private var whts =0
    private var twt =0
    fun incrementInsta()= insta++
    fun incrementfb()= fb++
    fun incrementwhts()= whts++
    fun incrementtwt()= twt++
    fun display(){
        println("insta = $insta, fb = $fb, whts =$whts, twt= $twt")
    }
}