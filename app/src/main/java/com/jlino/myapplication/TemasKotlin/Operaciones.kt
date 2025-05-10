package com.jlino.myapplication.TemasKotlin

fun main(){
    menu()

}
fun menu(){
    var num1 =0.0
    var num2=0.0
    var exit:Boolean = false

    var operacion =0
    do {
        println("Que operacion vas a realizar? \n 1.Suma \n 2.Resta \n 3.Multipliacion \n4.Division \n5. Salir")

        operacion= readln().toInt()

       when(operacion){
           1 -> {
               //Suma
               println("Ingresa el primer numero: ")
               num1=readln().toDouble()
               println("Ingresa el primer numero: ")
               num2=readln().toDouble()
               println("Tu resultado es: ${sum(num1,num2)}")
           }

           2 ->{
               //Resta
               println("Ingresa el primer numero: ")
               num1=readln().toDouble()
               println("Ingresa el primer numero: ")
               num2=readln().toDouble()
               println("Tu resultado es: ${res(num1,num2)}")
           }

           3 ->{
               println("Ingresa el primer numero: ")
               num1=readln().toDouble()
               println("Ingresa el primer numero: ")
               num2=readln().toDouble()
               println("Tu resultado es: ${mul(num1,num2)}")
           }

           4 ->{
               println("Ingresa el primer numero: ")
               num1=readln().toDouble()
               println("Ingresa el primer numero: ")
               num2=readln().toDouble()
               num2=isZero(num2)
               println("Tu resultado es: ${div(num1,num2)}")
           }
           5 ->{
               //Salir
               println("Hasta Luego!!!")
               exit = true
           }
       }

    } while(exit == false)
}


fun sum(a:Double, b:Double)= a+b
fun res(a:Double, b:Double)= a+b
fun mul(a:Double, b:Double)= a+b
fun div(a:Double, b:Double) = a/b
fun isZero(num:Double):Double{
    var newNum = num
    if (newNum==0.0){
        while(newNum == 0.0){
            println("No se puede dividir entre 0, ingresa otro digito: ")
            newNum=readln().toDouble()
        }
    }
    return  newNum
}
