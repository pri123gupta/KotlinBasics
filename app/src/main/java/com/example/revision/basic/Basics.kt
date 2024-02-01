package com.example.revision.basic

fun main() {
    //1. When as expression switch in java case
    var a= "GetLanguage"
    a="Hindi"
    when (a){
        "Regional"-> 1
        "Hindi"->2
        "English"->3
        "Other" -> 1000
    }
//    println("language is $a")
    //2. When range
    val b= 18
    val res =  when (b){
        0,1-> "Infant"
        in 1..18->"teen"
        in 19..110 -> "Other"
        else -> "NA"
    }
//    println(res)
    //3. loops n times
    val c = 5
    for (i in 1..c){
//        println("Hello $i ")
    }
    //4. table
    val d= 3
    for(i in 1..10){
//            println("$n X $i = ${n*i} ")
    }
    //5. do while loop
    var e =0
    do{
        e++
//        println(e)

    }while (e<10)
    // 6.infinite loop
    var f =6
    do{
//        println(f)
        f++
    }while (f>6)
    //7. Range
    val g=20
    for (i in 1..g){
//        println("$i Range is 1-10")
    }
    //1-10

    for (i in 1..10){
//        println("$i ")
    }

    for (i in 1..10){
//        println("$i ")
    }
    //1-3-5-7-9

    for (i in 1..10 step 2){
//        println("$i ")
    }
    //1-10 excluding 10 , i.e. 1-9
    for (i in 1 until  10){
//        println("$i ")
    }
    //1-10

    for (i in 1 .. 10){
//        println("$i ")
    }
    // 2-4-6-8-10
    for (i in 2..10 step 2){
//        println("$i ")
    }
    //10-1
    for (i in 10 downTo 1){
//        println(i)
    }
    // 10-8-6-4-2-0
    for (i in 10 downTo 0 step 2){
//        println(i)
    }
    // table of n
    val num=4
    for (i in 1..10){
        println("----  $num X $i = ${num*i}  ----") // string templateing
    }








}