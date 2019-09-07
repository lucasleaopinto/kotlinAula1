package com.example.myapplication

fun main (args:Array<String>){
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Mae","Maria"),Pair("Pai","Tiao"),Pair("FilhaOld","Katia"),Pair("Filho","Lucas"),Pair("Filha","Luana"))

    println(familiaMap.values)
    println(familiaMap.keys)
    familiaMap.forEach{println("${it.key}: ${it.value}")}

    //familiaMap.forEach{t,u -> println("$t - $u")}


}