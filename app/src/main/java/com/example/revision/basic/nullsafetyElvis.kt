package com.example.revision.basic

import androidx.compose.ui.text.toUpperCase

fun main() {
    var gender :String ? ="Female"
    var gn: String? = null

    if (gn != null) {
        gn.toUpperCase()
//        println(gender.toUpperCase())
    }
    gn?.toUpperCase()     // safe call operator ?.
    println(gn?.toUpperCase())   // not reached method so not called


    // to execute multiple statements
    gn.let {
        println("line 1")
        println("line 2 $gn")
        println("line 3 $it")
    }

    gender.let {
        println("Line 1")
        println("Line 2 $gn")
        println("Line 3 $it")
    }

    // if a variable is null what to inflate in that variable
//    "elvis operator" also called "null coalescing operator",   "?:"
    val selectedVal1 = gender?:"NA"
    println("selectedVal1, female  = $selectedVal1")

    val selectedVal2 = gn?:"NA"
    println("selectedVal2 null NA = $selectedVal2")

    val selectedVal3 = gn?:null
    println("selectedVal3 null null = $selectedVal3")

    // "not null asserted operator" i.e. "!!"
    // if value is null throw exception else call function
    // 1. either we know object is not null 2. or we want to error to come
    val finalVal= gender!!.toUpperCase()
    println(finalVal)
    val finalVal2= gn!!.toUpperCase()
//    println(finalVal2)  // exception


}