package com.example.revision.basic

val CLASS_TAG = "****PRIYANKA"
class OneSingleton{
    // call singleton
    fun callSingleton(){
        println(" fun called ")
        var testobj = object {
            val a = 20
            fun displayNum(){
                println(" num is $a ")
//                println(" display fun num is ")
            }
        }
        val a = 10
        var b=11
        val res= a==10 ||(b++ ==11)
        println(res)
        println("6888867866776"+testobj.displayNum())
    }

}
fun main() {
    OneSingleton().callSingleton()
}

