package com.jlino.myapplication.TemasKotlin

class usuario(){
    val materia:String=""
}

class usuarios2(val id: Int,val nombre:String){
    val materia:String=""
    fun hola(){
        println("Hola")
    }
}

fun main(){
    val alumno = usuario()
    val alumno2 = usuarios2(1,"Carlos")

    println(alumno2.id)
    println(alumno2.nombre)
}