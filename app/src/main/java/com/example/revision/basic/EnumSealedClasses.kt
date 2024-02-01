package com.example.revision.basic

fun main() {
    //enum - to assign a variable value from a set of values only
    val day = Day.Fri     // assign a value from set only

    val daysIndex = DayOfWeekWithIndex.Mon
//    println(day)
//    println(daysIndex)
//    println(daysIndex.num)
    for(i in DayOfWeekWithIndex.values()){
//        println("values = $i ")
        i.printFormattedDay()
    }
//    daysIndex.printFormattedDay()
}

enum class Day {
    Sun,
    Mon,
    Tues,
    Wed,
    Thrs,
    Fri,
    Sat
}

enum class DayOfWeekWithIndex(val num :Int) { //constructor
    Sun(1),          // instance with constructor
    Mon(2),
    Tues(3),
    Wed(4),
    Thrs(5),
    Fri(6),
    Sat(7) ;            // last entry of enum to close with semicolon, to define methods


    fun printFormattedDay(){
        println("Day is $this,  ${this.num}")
    }
}