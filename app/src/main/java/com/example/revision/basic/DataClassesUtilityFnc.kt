package com.example.revision.basic

fun main() {
    // data classes r used to store data & transfer data from one layer to another,
// it has no methods
    val p1 = Person11(1, "john")
    val p2 = Person11(1, "john")
  /*  println(p1) // p1.toString from Any class
    println(p2)
    println(p1 == p2) //calls p1.equals(p2)
    println(p1.equals(p2))*/

/*     when its not data class, its address / hashcode is different so objects are not equal

    if we have to check if contents of objects are same, we need data class
     just add data keyword

     data classes r used so as to prevent boilerplate code of setter getters*/

   // ---------------------UTILITY FUNCS 1. COPY
   /* val p3=p2.copy()
    println(p3)
    val p4 =p2.copy(id=4)
    println(p4)*/

    // DESTRUCTURING IN DATA CLASSES OR COMPONENT N FUNCTIONS
    val (id,name)=p1
    println(id)
    println(name)
    println(p1.component1())
    println(p1.component2())

}

data class Person11(val id: Int, val name: String)