package com.example.revision.basic

fun main() {
    val emp = Employee()

    //APPLY - to set initial value, to set properties
    emp.age = 18
    emp.name = "john"
    // alternative
    val x = emp.apply {
        age = 18
        name = "john"
    }           // apply returns the object itself
    println(emp)
    println(x)

// LET- to perform multiple operation on an object
    // returns last value
    println(emp.age)
    println(emp.name)
    // alternative
    val y = emp.let {
        println(it.age)
        println(it.name)
        2                       // if 2 is not written its return type is unit
    }
    println(y)
    // imp. use case - we user let with safe call operator for nullable obj
    println("==========================")
    val emp2: Employee? = null
    emp2?.age = 19
    emp2?.name = "johny"
    // alternative
    val z=emp2?.let {// we get not null obj here
        it.name = "jjohn"
        it.age = 118
        "test"                    // return value is last statement
    }
    println(emp2)

    //3. WITH fn - alternative to let, no need of it
   val a = with(emp){
        age=20
        name ="test name"
       82                        // return value is last statement
    }
    println(emp)
    println(a)

    //4. RUN- same work of with , but runs on obj
    val r= emp.run {
        age=35
        name = "uuweuiweuwiiuweui"           // return value is last statement
    }
    println(emp)


}

data class Employee(var age: Int = 0, var name: String = "")