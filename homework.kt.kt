package com.example.myapplication

fun main() {

    for (j in 0..100) {
        if (j != 71) {
            println(j)
        } else
            println("it is over 70!!")
    }

    println("---------------------------------------")

    var temperature = 35
    while (temperature <= 35 && temperature >= 10) {
        var num = when (temperature) {
            30 -> {
                println("it is hot")
            }
            20 -> {
                println("it is comfy")
            }
            15 -> {
                println("it is cold")
            }
            else ->
                println(temperature)
        }
        temperature--
    }
}








