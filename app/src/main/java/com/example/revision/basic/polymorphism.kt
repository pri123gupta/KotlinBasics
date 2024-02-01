package com.example.revision.basic

fun main() {
    val c = Circle(5.0)
    val sq = Square(4.0)
    val t = Triangle(4.0, 5.0)
    val ar = arrayOf(c, sq, t)
//    printArea(ar)
    dragShape(arrayOf(c, sq, t, Player()))
//    cloneShape(arrayOf(c,sq,t, Player()))
//    dragSpeed(arrayOf(c,sq,t, Player()))
//    dragShape(arrayOf(c,sq,t, Player()))

}

fun printArea(ar: Array<Shape>) {
    for (i in ar) {
        println(i.area())
    }
}


fun dragShape(ar: Array<Draggable>) {
    for (i in ar) {
        i.drag()
    }
}

fun dragSpeed(ar: Array<Draggable>) {
    for (i in ar) {
        println(i.dragSpreed)
    }
}

fun cloneShape(ar: Array<Cloneable>) {
    for (i in ar) {
        i.clone()
    }
}

abstract class Shape() : Draggable, Cloneable {
    abstract fun area(): Double
}

interface Draggable {
    abstract fun drag()
    val dragSpreed: Int  // property
    val dragObjName: String //prperty
}

interface Cloneable {
    abstract fun clone()
}

class Square(val r: Double) : Shape() {
    override fun area(): Double {
        return r * r
    }

    override fun drag() {
        println("Dragging Square, as $dragObjName, at speed =$dragSpreed")
    }

    override var dragSpreed: Int
        get() = 89
        set(value) {}
    override val dragObjName: String
        get() = "SquareBlock"

    override fun clone() {

        println("Cloning square")
    }
}

class Triangle(val h: Double, val b: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * h * b
    }

    override fun drag() {
        println("Dragging triangle, as $dragObjName, at speed =$dragSpreed")
    }

    override var dragSpreed: Int
        get() = 100
        set(value) {}
    override val dragObjName: String
        get() = "trianglePrism"

    override fun clone() {

        println("Cloning triangle")
    }
}

class Circle(val r: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * r * r
    }

    override fun drag() {
        println("Dragging circle, as $dragObjName, at speed =$dragSpreed")
    }

    override var dragSpreed: Int
        get() = 10
        set(value) {}
    override val dragObjName: String
        get() = "CircularTyre"

    override fun clone() {
        println("Cloning circle")
    }
}

class Player() : Draggable, Cloneable {
    override fun drag() {
        println(" Dragging Player, as $dragObjName, at speed =$dragSpreed")
    }

    override var dragSpreed: Int
        get() = 23
        set(value) {}
    override val dragObjName: String
        get() = "PlayerFootball"

    override fun clone() {
        println("Cloning player")
    }
}