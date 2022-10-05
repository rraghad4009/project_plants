package com.example.myapplication

fun main() {
    var sum = 0.0

    var num = arrayListOf<Double>(2.4, 6.7, 7.9, 5.6, 4.6)
   for  (index in 0 until num.size){
        sum  += num [index]
    }
     sum= sum/5
println(sum)
}