package com.xvin

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello();
    val h = Human()
    h.hello()
    var age : Int = 19
    age = age.plus(1)
    var weight = 66.5f
    val enroll : Boolean = true
    var name : String
    name = "Hank"
    println(age)
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}