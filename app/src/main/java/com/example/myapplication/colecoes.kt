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

    val listaCursos: MutableList<String> = mutableListOf("Analise e Desenvolvimento de SistemaDS","Desenvolvimeto Dispositivos Móveis");

    listaCursos.forEach{ println(it)}
    println("-------------")

    listaCursos.add("Tecnico em informática")

    println(" ")
    listaCursos.forEach{ println(it)}

    //Set e Mutable
    val setCursos: MutableSet<String> = mutableSetOf("ADS","SDM","TII")

    setCursos.add("ADS")

    println("----Set Mutable Set ---------")
    setCursos.forEach{ println(it)}

    // Map e Muta ble
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai","Tiao"),Pair("Filho","Lucas"))

    familiaMap.put("Irmao","Luana")



}
