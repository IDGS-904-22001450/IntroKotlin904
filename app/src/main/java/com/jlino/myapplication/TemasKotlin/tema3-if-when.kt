package com.jlino.myapplication.TemasKotlin

fun main(){
    val d: Int
    val check = true

    if(check){
        d = 1
    }else{
        d=2
    }
    println(d)

    val d2 = if (check) 1 else 2
    println(d2)

    println("---------------------------------------------------------------------------")
    print("Ingrese el suelo del empleado: ")
    val sueldo = readln().toDouble()
    if(sueldo > 3000){
        println("Debe pagar impuestos!")
    }

    val obj = "Hello"

    when (obj){
        "1" -> println("Uno")
        "Hello" -> println("Dos")
        else -> println("No hay coincidenecia")
    }
}


