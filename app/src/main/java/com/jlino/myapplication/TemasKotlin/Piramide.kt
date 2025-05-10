package com.jlino.myapplication.TemasKotlin

fun main(){
 menuPiramid()
}

fun menuPiramid(){
    var renglones = 0
    var exit:Boolean = false

    do {
        println("Ingresa la cantidad de renglones para la piramide: ")
        renglones = readln().toInt()

        if(renglones == 0){
            println("Hastas luego!!!")
            exit = true
        }

        makePiramid(renglones)

    } while(exit == false)
}

fun makePiramid(r:Int){
    var renglon = ""
   var iteracinoPorRenglon = 1
    println("PIRAMIDE GENERADA")
    do{
        renglon = renglon + '*'
        println(renglon)
        iteracinoPorRenglon++
    }while(iteracinoPorRenglon <= r )
}
