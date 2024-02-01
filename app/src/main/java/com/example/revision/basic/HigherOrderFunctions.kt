package com.example.revision.basic

import kotlin.math.pow

fun main() {
    // kotlin is object oriented and functional language
    //can store functions in variables, using :: operator
    // funtions are 1st class citizens, bcoz they are treated as objects, keep in variable, pass as arguments, can be returned from another function
    var s = ::sum
//    println(s(10.0, 20.0))
    var p = ::power
    s = p
    var cu = ::cube
//    s= cu     // not possible bcoz type mismatch
    val h = ::hello
//    cu=h // not possible bcoz type mismatch
//============================HIGHER ORDER FUNCTION======================
    // a function that either accept function as argument or returns a function or both is called higher order function
// eg calculator is highoer fn
    calculator(10.0,30.0, ::sum)
    // when we have to decide at run time which functionality is to be executed , we directly send function
//Eg. if we call api , and want to call different function on success and failure, we send function
}

fun sum(a: Double, b: Double) = a + b
fun power(a: Double, b: Double) = a.pow(b)
fun cube(a: Double) = a * a * a
fun hello() {  // return type is any
    println("hii")
}

fun calculator(
    a: Double, b: Double, gn: (Double, Double) -> Double) {
    val res = gn(a,b)
   println(res)

}