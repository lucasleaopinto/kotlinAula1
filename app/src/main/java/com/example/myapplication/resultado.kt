package com.example.myapplication

enum class TipoOperacao{
    ADD, MUL, DIV, SUB
}

fun div(a:Int, b: Int) = a / b

fun operacao(op: TipoOperacao): (Int, Int) -> Int{
    val sub = {a:Int,b:Int -> a - b}

    when(op){
        TipoOperacao.ADD -> return {a , b -> a + b} //lambda
        TipoOperacao.MUL -> return fun(a , b): Int = a * b //anonima
        TipoOperacao.DIV -> return ::div //funcao classica
        TipoOperacao.SUB -> return sub // varial de funcao
    }
}

fun Int.aplica(i:Int, b:(Int,Int) -> Int) = b(this,i)

fun main(){
    println(10.aplica(2, operacao(TipoOperacao.ADD)))
    println(10.aplica(2, operacao(TipoOperacao.MUL)))
    println(10.aplica(2, operacao(TipoOperacao.DIV)))
    println(10.aplica(2, operacao(TipoOperacao.SUB)))
}


