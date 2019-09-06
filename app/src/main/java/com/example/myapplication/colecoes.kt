package com.example.myapplication

fun main(args: Array<String>){
    //List(imutável)
    var familia: List<String> = listOf("Lucas", "Ana","Luana", "Maria", "Tiao")

    //percorre com for
    for (integrantes in familia){
        println(integrantes)
    }
}