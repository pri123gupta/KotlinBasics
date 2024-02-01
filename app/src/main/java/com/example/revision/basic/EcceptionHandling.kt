package com.example.revision.basic

fun main() {
    // error which can be handled , not breaking app/program &its further execution are called exception
    // eg not able to connect to db, user told to enter number for age , but he enters name
    //but some error cannot be handled eg. error in jvm
    try {
        val ar = arrayOf(1, 2, 3)
        println(ar[5])
    } catch (e: ArithmeticException) {

        println("A exc $e")
    } catch (e: ArrayIndexOutOfBoundsException) {

        println("OFB exc $e")
    } catch (e: Exception) {        //last

        println("exc $e")
    } finally {
        println("must execute")
    }
    println("this wont run if excption is not handled")

    // finally  must runs
    // multiple catch is possible, first specific, last generic Eception class
    // either try is with catch or with finally,never alone
    try {

    } catch (e: java.lang.Exception) {

    }
    try {

    } finally {

    }
    createUserlist(5)
    createUserlist(-1)
}

fun createUserlist(count:Int){
    if(count<0){
        throw IllegalArgumentException("count cannot be less than 0 ")
    }else{
        println("list will be created")
    }
}