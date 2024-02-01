package com.example.revision.basic

import kotlin.math.pow

fun main() {
    // INLINE FUNCTIONS
    val a = 5
    val b = 15
    fun addFun(a: Int, b: Int) = a + b
//    println(addFun(a, b))

    fun evenOdd(a: Int): String {
        return when (a % 2) {
            0 -> "Even"
            else -> "Odd"
        }
    }
//    println(evenOdd(13))

    fun printHello(count: Int = 2) {
        for (i in 1..count) {
            println("Hello $i")
        }
    }

    //    printHello(3)
//function overloading
    fun addInt(a: Int, b: Int) = a + b
    fun addInt(a: Float, b: Float) = a + b
    fun addInt(a: Double, b: Double) = a + b

    fun sub(a: Double, b: Double) = a - b
//    println(addInt(5,6))
//    println(addInt(5.0f,6.0f))
//    println(addInt(5.0 ,6.0))
//    println(sub(6.0, 4.0))
//    println(sub(4.0, 6.0))
//    println(sub(b = 6.0, a = 4.0))// named args

    //store fncs in variables
    fun power(a:Double,b :Double)=a.pow(b)
    val pFun= ::power
//    println(pFun(2.0,3.0))

    //ARRAY
     val arr= arrayOf("One", "Two", "three", "four", 5, 6, "seven")
    for (i in arr){
//        println(i)
    }
    for ((i,e) in arr.withIndex()){
//        println("Element at index $i = ${e}")
    }
//    println(arr[3])
//    println(arr.get(2))
//    println(arr.size)

    //--constructors
//    val car = Auto("abc",4,5)
//    car.drive()
    val per=Person("android",121)

    //--getter setter
    println(per.age)
    println(per.name)

}

//primary constr.
class Auto(val name:String, val tyre:Int, seats:Int){
    fun drive(){
        println("drive")
    }
    fun brakes(){
        println("brakes")

    }
    lateinit var a:String
}
//secondary constr.
class Person(n:String, a:Int){
      var name :String = n
          get() = field.uppercase()
     var age =a
       set(value) {
           println("age   be +skasjajkdjskdsjkdsjkkdsa")
           if (value>10){
               println("age   be +ve")
               field=value+10
           }else{
               field= value+100
               println("age cannot be -ve")
           }
       }

    fun display(){
        println("Name = $name , age = $age")
    }
}


