package com.example.revision.basic;

public class TestJavaClass {
    public static void main(String[] args) {
        //we donot get companion function here without obj, by default
        // so, kolin's companion != java's static
        // but if want to tell compiler okotlin to make companion obj's function work as static function in java, make it jvm static

       // Myclass.sayName();   // error
        Myclass.Abc.sayName();
        Myclass.sayName();  // after making sayName() as @JvmStatic
    }
}
