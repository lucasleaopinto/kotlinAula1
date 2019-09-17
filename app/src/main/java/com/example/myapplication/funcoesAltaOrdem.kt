package com.example.myapplication

fun processaTexto(str1: String, str2: String, processa:(String, String) -> String ) = processa(str1,str2)

fun concatena(a: String, b: String) = "${ a + b }"

fun inverte(a: String, b: String) = "${a.reversed() + b.reversed()}"

fun List<String>.paraCadaString(funcao: (String) -> String):List<String>{
    val listaStrings: MutableList<String> = mutableListOf()

   // for (s in this){
   //     listaStrings.add(funcao(s))
   // }

    this.forEach{listaStrings.add(funcao(it))}
    return listaStrings.toList()
}

fun <P> List<P>.paraCada(funcao: (P) -> P): List<P>{
    val retornoList: MutableList<P> = mutableListOf()

    this.forEach{retornoList.add(funcao(it))}

    return retornoList
}

fun incrementa(i: Int) = i + 1
fun dobra(f: Float) = f * 2

fun primeiraLetra(str: String): String = str.first().toString()

fun main(){
    val listaNomes: List<String> = listOf("Lucas", "Ursula", "Carlos", "Ana", "Sandra")

    val listaPrimeiraLetra = listaNomes.paraCadaString (::primeiraLetra)

    listaPrimeiraLetra.forEach{ println(it)}

    val listInteiros: List<Int> = (1..10).toList()
    val listaIncrementados: List<Int> = listInteiros.paraCada(::incrementa)
    listaIncrementados.forEach{println(it)}

    val listaFloats: List<Float> = listOf(1f,2f,2.5f,4f)
    val listaDobrados: List<Float> = listaFloats.paraCada { x -> dobra(x) }
    listaDobrados.forEach{ println(it)}

}

/*
fun main(){

    println(processaTexto("ola ", "mundo", ::concatena))

    println(processaTexto("ola ", "mundo", ::inverte))

    println(processaTexto("ola ", "mundo", {a: String, b: String -> "${a + a + b +b }"}))

    println(processaTexto("ola ", "mundo") {a: String, b: String -> "${a + a + b +b }"})

}*/
