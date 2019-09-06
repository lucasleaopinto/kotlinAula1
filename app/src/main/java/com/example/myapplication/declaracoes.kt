package com.example.myapplication

fun main(args: Array<String>) {
    //Mutável - variavel

    var frase: String = "Hello World"

    println(frase)
    println("$frase")
    println("${frase}")

    println("Qtd de chars: ${frase.count()}")

    println("Qtd de chars: ${frase.length}")
    frase = "Alterando o texto"
    println("Qtd de chars: ${frase.toUpperCase()}")


    //Imutável - values
}
