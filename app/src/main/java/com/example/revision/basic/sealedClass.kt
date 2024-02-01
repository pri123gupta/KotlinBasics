package com.example.revision.basic

fun main() {
    /*  enum -> value is instance, cannot change state, same object not multiple objects,
      value is restricted
      sealed class->
              type is restricted*/

    /*   val tile1 = Red("Mushroom", 25)
       val tile2 = Red("Fire", 30)
       println("Tile 1 => ${tile1.type} - ${tile1.points}")
       println("Tile 2 => ${tile2.type} - ${tile2.points}")*/

//    test case -> if a red ball comes, give 4n coins, if blue ball comes give 2n coins

//    val t: Tile = Red("Mushroom", 25)
    val t: Tile = Blue( 25)
    val coins = when (t) {
        is Blue -> t.points * 2
        is Red -> t.points * 4
    }
    println("coins = $coins")


}

sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()