package com.example.revision.basic

fun main() {
    /*    companionobject is the singleton object associated with class,
        which is companion friend of class and
        whose functions can be used
        by class directly without the object call*/

    Myclass.Abc.sayName()
    Myclass.def.sayContinent()
    //now if we want class directly to call functions of one of object, make it companion friend
    Myclass.sayName()
    //companion object can be only 1 in a class

   //JVM STATIC
    // static method in java is one for which we need not to create an object, it is associated with class not object
    // since companion obj, is associated with obj, not class, it is not static
    // see class TestJavaClass

    //- companion is used for factory patern i.e. a simple func, in which parameter is passed and it returns an obj

}

class Myclass {
    companion object Abc {
        @JvmStatic
        fun sayName() {
            println("telling name")
        }
    }

    object def {
        fun sayContinent() {
            println("telling continent")
        }
    }
}