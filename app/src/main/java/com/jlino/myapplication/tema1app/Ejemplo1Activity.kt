package com.jlino.myapplication.tema1app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import com.jlino.myapplication.R

class Ejemplo1Activity : AppCompatActivity() {
    private lateinit var et1:EditText
    private lateinit var et2:EditText
    private lateinit var tv1:TextView
    private lateinit var btn1:Button
    private lateinit var rbtn1:RadioButton
    private lateinit var rbtn2:RadioButton
    private lateinit var rbtn3:RadioButton
    private lateinit var rbtn4:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        et1=findViewById<EditText>(R.id.et1)
        et2=findViewById<EditText>(R.id.et2)
        tv1=findViewById<TextView>(R.id.tv1)
        btn1 =findViewById<Button>(R.id.btn1)
        rbtn1 =findViewById<RadioButton>(R.id.rbtn1)
        rbtn2 =findViewById<RadioButton>(R.id.rbtn2)
        rbtn3 =findViewById<RadioButton>(R.id.rbtn3)
        rbtn4 =findViewById<RadioButton>(R.id.rbtn4)
    }

    fun operacion(view: android.view.View) {
        if (rbtn1.isChecked) {
            sumar(view)
        } else if (rbtn2.isChecked) {
            restar(view)
        } else if (rbtn3.isChecked) {
            multiplicar(view)
        } else if (rbtn4.isChecked) {
            dividir(view)
        } else {
            tv1.text = "SELECCIONA UN VALOR"
        }
    }

    fun sumar(view:android.view.View){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        val resultado = valor1.toDouble()+valor2.toDouble()
        tv1.text=resultado.toString()
    }

    fun restar(view:android.view.View){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        val resultado = valor1.toDouble()-valor2.toDouble()
        tv1.text=resultado.toString()
    }

    fun multiplicar(view:android.view.View){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        val resultado = valor1.toDouble()*valor2.toDouble()
        tv1.text=resultado.toString()
    }

    fun dividir(view:android.view.View){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        val resultado = valor1.toDouble()/valor2.toDouble()
        tv1.text=resultado.toString()
    }

}