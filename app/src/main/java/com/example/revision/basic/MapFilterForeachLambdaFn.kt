package com.example.revision.basic

fun main() {
    //==========1. collection funtion - .foreach(), .map(), .filter()=========
    // ===========2. use of lambda=======

//    1. filter() fn
//    filterFn()          //eg.1
//    exampleFilter()    //eg.2

    //2. map() fn
//    exampleFilterMap()

    //3. forloop
    forloops()
}

fun filterFn() {
    val ar = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // we have to pass a fn which takes integer as input and returns boolean
    val list = ar.filter(::isOdd)
    //ALTERNATIVE -
    val list2 = ar.filter(fun(a: Int): Boolean {       //pass full function directly without name
        return a % 2 != 0
    })

    val list3 = ar.filter({ a: Int -> a % 2 != 0 })  // ALTERNATIVE, make it lambda
    val list4 = ar.filter { a: Int -> a % 2 != 0 }  //lambda args should be moved out of parantheses
    val list5 = ar.filter { it % 2 != 0 }     // only 1 parameter so replace by "it"
    println(list)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
}

fun isOdd(a: Int): Boolean {
    return a % 2 != 0
}

fun exampleFilter() {
    val list = listOf(
        User(1, "A"),
        User(2, "B"),
        User(3, "C")
    )
    val filtered2 = list.filter { it.id == 2 }
    println(filtered2)
}

fun exampleFilterMap() {
    // map is used to convert one form to another

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //suppose we need a map of square of numbers
    val map = list.map { it * it }
    println(map)

    // example 2
    // suppose we have to convert the userList to paid used object map
    // User()   -> PaidUser()
    val userList = listOf(
        User(1, "A"),
        User(2, "B"),
        User(3, "C")
    )
    val mapPaiduser = userList.map {
        PaidUser(it.id, it.name, "Paid")
    }
    println(mapPaiduser)
    // use case of map: Eg. if network brings lot of data , which we dont need , we map to a new list acc. to our ui

}

fun forloops() {

    val ar = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in ar){
//        println(i)
    }
    // alternative is foreach loop
    ar.forEach { println(it) }

}

data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)