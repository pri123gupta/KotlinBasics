package com.example.revision.basic

fun main() {
    //========================LambdaExpressions========= {} is a lambda representation
    // last line of lambda is return
    val lambda1 = { x: Int, y: Int -> x + y }
    val multilineLambda1 = {
        println("hello multiline lambda1")
        val a = 12
        "Coding revision "
        55
    }

    val multilineLambda2 = { x: Int, y: Int, z: String ->
        println("hello multiline lambda2")
        val a = x + y + 1
        "Coding revision $z"
        "final $z, $a , ${87 + a}"
    }
    // call lambdas
    multilineLambda1()
    multilineLambda2(10, 20, "priyanka")

    println("---------now print return types of lambdas-----------")
    println(multilineLambda1())
    println(multilineLambda2(10, 20, "priyanka"))
    val lambdaForSum = { a: Double, b: Double -> a + b }

    // now we need not tell type in lambda bcoz we have already defined the variable type, 2 eg.s

    val singeParamLambda = { x: Int -> x * x }              //Eg1
    val singeParamLambda2: (Int) -> Int = { x -> x * x }  // Alternative

    val sayHi = { msg: String -> println("Hi .. $msg") }        //Eg2
    val sayHi2: (String) -> Unit = { msg -> println("Hi $msg") }   // Alternative

    // for single param , it can be replaced with "it"

    val singleParam: (Int) -> Int = { x -> x + x }
    val singleParam2: (Int) -> Int = { it + it }         // Simplified
    // no need to define single param , just write body

// after - move lambda out of paratheses, when lambda is last parameter
    calculator(10.0, 20.0, { a, b -> a + b })
    calculator(10.0, 20.0) { a, b -> a + b }       // Simplified
}

fun sum2(a: Double, b: Double): Double = a + b