package com.example.myapplication

fun main(args: Array<String>) {
    //List(imutável)
    var familia: List<String> = listOf("Lucas", "Ana", "Luana", "Maria", "Tiao")

    //percorre com for
    for (integrantes in familia) {
        println(integrantes)
    }


    //Lista inteiros
    val listaInteiros: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i in 0..9) {
        println(listaInteiros[i])
    }

    val listaInteiros2: List<Int> = (1..10 step 2).toList()

    for (i in listaInteiros2) {
        println(i)
    }

}