package com.jlino.myapplication.TemasKotlin
import kotlin.math.*
fun main() {
menuFormula()
}

fun menuFormula(){
    var exit:Boolean = false
    var opcion:Int

    var a:Double
    var b:Double
    var c:Double
    do {
        println("Elije una opcion: \n1.Formula General \n0.Salir")

        opcion = readln().toInt()
        when(opcion){
            1 -> {
                println("Ingresa el valor de a: ")
                a = readln().toDouble()
                a= isZero(a)

                println("Ingresa el valor para b")
                b = readln().toDouble()
                println("Ingresa el valor para c")
                c = readln().toDouble()

                resolveForm(a,b,c)
            }
        }

        

    } while(exit == false)
}

fun resolveForm(a:Double, b:Double, c:Double ){
    var d = b * b - 4 * a * c

    if( d > 0){
        var x1 = (-b + sqrt(d.toDouble())) / (2 * a)
        var x2 = (-b - sqrt(d.toDouble())) / (2 * a)
        println("Dos soluciones reales: x1 = $x1 y x2 = $x2")

    }else if (d == 0.0) {
    val x = -b / (2 * a)
    println("Una solución real: x = $x")
    }else{
        println("El resultado es un numero imaginario por el discriminante: ${d}")
    }
}
