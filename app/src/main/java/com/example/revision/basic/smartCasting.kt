package com.example.revision.basic

fun main() {
    val c = Circle1(9.0)
    val p = Player1("player1")

    val arDrag:Array<Draggable1> = arrayOf(Circle1(7.0), Player1("hey1"), Player1("hey2"), Circle1(2.0)
//        ,Test("hey3")
    )
   for(i in arDrag){
       if (i is Circle1){
           println(i.area())
       }
       else {
           (i as Player1).sayName(i.r)
       }
//           if (i is Player1)
//           {
//          i.sayName(i.r)
//       }
//       else{
//           (i as Test).sayHi(i.a)
//       }
   }

//    val ar = arrayOf(c, p)
//    for (i in ar) {
//
//        if (i is Circle1) {
//            println("Circle smartcast")
//        } else {
//            println("player smartcast")
//        }
//    }

}

open class Shape1() {
    open fun area() = 0.0
}

interface Draggable1 {
    fun drag()
}

class Circle1(val r: Double) : Shape1(), Draggable1 {
    override fun area(): Double {
        return Math.PI * r * r
    }

    override fun drag() {
        println("Drag1 circle1")
    }
}

class Player1(val r: String) : Draggable1 {
    override fun drag() {
        println("Drag1 player1")
    }
    fun sayName(a:String){
        println("Saying name of player $a")
    }
}
//non draggable class

class Test(val a:String){

    fun sayHi(a:String){
        println("Saying hi  $a")
    }
}