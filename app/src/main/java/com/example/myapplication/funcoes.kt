package com.example.myapplication

fun multiplo(a: Int = 10 , b: Int): Boolean{
    val c: Int = a % b
    if (c ==0){
        return true
    }
    return false
}

//single expression
fun multiplo2(a: Int = 10 , b: Int) = a % b == 0


//if-else como ternario
fun multiplo3(a: Int = 10 , b: Int) = if (a % b == 0) true else false



fun Int.multiploo(b: Int):Boolean{
    return multiplo(this,b)
}

infix fun Int.multiplooo(b: Int):Boolean{
    return multiplo(this,b)
}


fun main(){
    println(multiplo(10,2))
    println(10.multiploo(3))
    println(10 multiplooo 3)

}