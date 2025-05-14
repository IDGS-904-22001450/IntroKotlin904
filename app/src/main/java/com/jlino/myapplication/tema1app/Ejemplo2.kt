package com.jlino.myapplication.tema1app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.jlino.myapplication.R

class Ejemplo2 : AppCompatActivity() {

    private lateinit var et1:EditText
    private lateinit var et2:EditText
    private lateinit var tvResult: TextView
    private lateinit var btnCalcular: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo2)
        et1=findViewById<EditText>(R.id.et1)
        et2=findViewById<EditText>(R.id.et1)
        tvResult=findViewById<TextView>(R.id.tvResult)



    }

    fun multiplicarConSuma(view:android.view.View){
        var a = et1.text.toString().toDouble()
        var b = et2.text.toString().toDouble()
        var i :Int = 1
        var aux :Double=0.0
        while (i<=b){
            aux = a
            aux+=
                i++
        }
        tvResult.text="$aux"
    }



}