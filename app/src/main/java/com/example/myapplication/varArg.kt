package com.example.myapplication

fun multiplica(vararg numeros: Double) =
    if (numeros.size == 0)
        0.0
    else {
        var resultado: Double = 1.0
        numeros.forEach { resultado *= it }
     resultado
    }

fun main(){
    println(multiplica(2.0,3.0,3.0))

    val listaPar = listOf(1.2,3.5,4.0,20.3)
   // println(multiplica(*listaPar))

}