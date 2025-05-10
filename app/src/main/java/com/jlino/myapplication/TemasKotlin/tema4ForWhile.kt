package com.jlino.myapplication.TemasKotlin

/*
* Range = ..
* 1..4=1,2,3,4
* 1..<4=1,2,3,4
* DownTo 4.4=1,2,3,4
* 1.. 5 step 2=1,3,5
* 'a'..'f'='a'......'f'
* */

fun main() {
    for (n in 1..5) {
        println(n)
    }

    val figuras = listOf("Cuadrado", "Triangulo","Circulo")
    for(figura in figuras){
        println(figura)
    }
    /*While*/
}


