package com.jlino.myapplication.TemasKotlin

/*
* Lista
* Map
* MutableMap
* MutableSet
* SetOf
* MutableSetOf
* */

/*
val readOnlyFiguras = listOf("cuadrado","triangulo","circulo")

var mutableFiguras = mutableListOf("cuadrado","triangulo","circulo")

val coches= mapOf("Uno" to 3)
*/
fun main(){
    val readOnlyFiguras = listOf("cuadrado", "triangulo", "circulo")
    println("La primera figura es ${readOnlyFiguras[0]}")
    println("El primer elemento es ${readOnlyFiguras.first()}")
    println("numero de elementos ${readOnlyFiguras.count()}")
    println("circulo" in readOnlyFiguras)
   //readOnlyFiguras .add("pentagono")
    var figura: MutableList<String> = mutableListOf("cuadrado2","triangulo2","circulo2")
    println(figura)
    figura.remove("cuadrado2")

}