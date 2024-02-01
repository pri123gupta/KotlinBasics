package com.example.revision.basic


fun main() {
//    Generics - general class with no type, for whihc type can be passed by user
    val intContainer = IntContainer(12)
    println(intContainer.getValue())

    val container = Container<Int>(12)
    println(container.getValue())

    val container2 = Container<String>("hey")
    println(container2.getValue())
    //---------------------------------------------
    // list, map are also generic classes
    val list1 = listOf<Int>(1, 2, 3)
    val list2 = listOf<String>("One", "Two", "Three")
    addWithVararg(1,2,4,5,6,18,1)
    addWithVararg(1,1,1,1,1,1,2)
}

fun addWithVararg(vararg n: Int) {
    var sum =0
    for (i in n) {
        sum +=i
    }
    println(sum)
}

//generic class
class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}


class IntContainer(var data: Int) {
    fun setValue(value: Int) {
        data = value
    }

    fun getValue(): Int {
        return data
    }
}

class StringContainer(var data: String) {
    fun setValue(value: String) {
        data = value
    }

    fun getValue(): String {
        return data
    }
}
