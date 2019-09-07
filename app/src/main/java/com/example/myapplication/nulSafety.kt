package com.example.myapplication

fun main(){
    var nome: String
    //nome = null

    var sobreNome : String?
    sobreNome = null

    var sn : String
    sn = (sobreNome?: "Pinto") // se sobrenome for null recebe "Pinto"

 //   println(sobreNome.capitalize())
 //   println(sobreNome.length)

  //  println(sobreNome?.capitalize())
  //  println(sobreNome?.length)

    println(sobreNome?.capitalize())
    println(sobreNome?.length)

    try{
        println(sobreNome.capitalize())
        println(sobreNome.length)

    }catch (Kne: KotlinNullPointerException){

    }
}