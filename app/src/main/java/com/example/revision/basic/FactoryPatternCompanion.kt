package com.example.revision.basic

fun main() {

    val p1 = Pizza1.createPizza("Onion")
    println(p1.toppings)

//    if we want everyone must call create method to make piza then make constructor private
    //i.e. this is not possible ->
// val p= Pizza1("","")

}

public class Pizza1 private constructor(val type: String, val toppings: String) {
    companion object Factory {
        fun createPizza(pizzaType: String): Pizza1 {
            return when (pizzaType) {
                "Cheeze" -> Pizza1("Cheeze", "Cheeze,tomato")
                "Onion" -> Pizza1("Onion", "Onion,Tomato")
                else ->
                    Pizza1("paneer", "paneer,tomato")
            }
        }
    }

}