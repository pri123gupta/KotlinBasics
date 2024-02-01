package com.example.revision.basic

fun main() {
    //ARRAYS - fix size, cannot increase decrease , no add, no remove , only replace
    val ar = arrayOf(1, 2, 3)
    ar[2] = 22
    //println(ar[2])           // but can update existing elements
//    ar[4]=23   // out of bounds

//    to increase or decrease the size of array , we need dynamic behaviour, we need lists
    // List are of 2 types
    // 1. Mutable list - add/ remove/ replace is possible
    // 2. Immutable list - add/ remove / replace is not possible.
    /*
        val list = mutableListOf(1,2,3)
        list.add(33)
        list.add(2,10)
        list[1]=90          // replace
        println(list)
        list.removeAt(2)
        println(list)
        list.remove(90)
        println(list)
        println("index of 33 = ${list.indexOf(33)}")
        println("if element 33 is contained = ${list.contains(33)}")
        println("if element 32 is contained = ${list.contains(32)}")
        list.remove(1)
        println(list)
        val list2 = listOf(11,22,44,55,66)
        list.addAll(list2)
        println("list 1 after adding all elements of 2 list in it = $list")*/

//    ================================MAPS====================================
    // map is key value pair collection
    //types - 1.mutable map, 2. immutable map

    val mapStudents =
        mutableMapOf<String, Int>("Antony" to 10, "Barber" to 11, "Chris" to 14, "Denial" to 16)
    println(mapStudents)
    mapStudents.put("Emiley", 19)
    mapStudents["Friedrick"]=22
    println(mapStudents)
    println(mapStudents.get("Chris"))
    println(mapStudents.get("john"))

    for ((key, value) in mapStudents) {
        println("key = $key , value =  $value")
    }
    println(mapStudents["Emiley"])
    mapStudents.remove("Emiley")
    println(mapStudents)

    val mapStudentsImmutable =
        mapOf<String, Int>("Antony" to 10, "Barber" to 11, "Chris" to 14, "Denial" to 16)
        // put,remove, add,replace  method not available
}