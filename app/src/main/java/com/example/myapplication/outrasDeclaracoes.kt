package com.example.myapplication

fun main(args: Array<String>){
    //string explicito
    var nome: String = "Lucas"

    //String implicito
    var sobrenome = "Pinto"

    //inicialização tardia
    var nomeMeio: String
    nomeMeio = "Leao"

    //Float
    val altura: Float = 1.71f

    //inteiro
    var idade: Int = 33

    //Casting tudo em kotlin é objeto
    var peso: Double = 72.toDouble()

    println("Nome: ${nome} $nomeMeio $sobrenome \nAltura: $altura \nIdade: $idade \nPeso: $peso")
}