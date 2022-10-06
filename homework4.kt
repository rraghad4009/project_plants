package com.example.myapplication

fun main() {
num(1.7 , 2.4)
}
fun num(num1 : Double , num2 : Double , name : String = "+"){
    when (name) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "/" -> println(num1 / num2)
        "*" -> println(num1 * num2)
        else -> println("UnKnown")
    }
}