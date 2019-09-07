package com.example.myapplication

fun main(args:Array<String>){

    val listaCursos: MutableList<String> = mutableListOf("Sistemas para Dispositivos Moveis","Analise e Desenvolvimento de Sistemas")

    val listaCursoSistema = mutableListOf<String>()
    listaCursos.add("Tecnico em Informatica para Internet")
    listaCursos.add("Manutencao de Aeronaves")
    listaCursos.add("Tecnico em Células")
    listaCursos.add("Processos Gerencias")


    for (i in listaCursos) {

        if (i.contains("Sistemas")){
            println("$i - $listaCursos")
        }

    }

    val listaCursoSistemaFiltro = listaCursos.filter { it.contains("Sistemas") }

    listaCursoSistemaFiltro.withIndex().forEach{ println("${it.index} - ${it.value})")}
}