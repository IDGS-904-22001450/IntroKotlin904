package com.jlino.myapplication.Tema3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jlino.myapplication.R

class Example3 : AppCompatActivity() {
    private lateinit var editext:EditText;
    private lateinit var button: Button;
    private var num=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3)

        editext=findViewById<EditText>(R.id.et1);
        num=(Math.random()*10001).toInt()
        val cadena = num.toString()
        val notificacion = Toast.makeText(this,cadena,Toast.LENGTH_LONG)
        notificacion.show()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        fun controlar(view:android.view.View){
            val valorIngresado:String = editext.text.toString()
            val valor =valorIngresado.toInt()
            if(valor == num){
                val notificacion = Toast.makeText(this,"Correcto",Toast.LENGTH_LONG)
                notificacion.show()
            }else{
                val notificacion = Toast.makeText(this,"Incorrecto",Toast.LENGTH_LONG)
                notificacion.show()
            }
        }

    }
}