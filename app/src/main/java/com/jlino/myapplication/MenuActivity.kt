package com.jlino.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jlino.myapplication.Tem2App.Ejemplo2Activity
import com.jlino.myapplication.tema1app.Ejemplo1Activity

class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnEjemplo =findViewById<Button>(R.id.btn1);
        val btnEjemplo2 =findViewById<Button>(R.id.btn2);

        btnEjemplo.setOnClickListener(){
            navegateToEjemplo()
        }

        btnEjemplo2.setOnClickListener(){
            navegateToEjemplo2()
        }
    }

    private fun navegateToEjemplo(){
        val intent = Intent(this,Ejemplo1Activity::class.java);
        startActivity(intent);
    }

    private fun navegateToEjemplo2(){
        val intent = Intent(this,Ejemplo2Activity::class.java);
        startActivity(intent);
    }



}