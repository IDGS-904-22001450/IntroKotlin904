package com.jlino.myapplication.Tema4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.jlino.myapplication.R
import java.io.FileNotFoundException

class Ejemplo4 : AppCompatActivity() {
    private val fileName ="datos.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo4)
        val inputText = findViewById<EditText>(R.id.inputText);
        val outputText = findViewById<TextView>(R.id.outputText);
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val btnGuardar = findViewById<Button>(R.id.saveButton);
        val btnLeer = findViewById<Button>(R.id.readButton)

        btnBorrar.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmacion")
            builder.setMessage("Estas seguro que deseas borrar los datos?")
            builder.setPositiveButton("Si"){_, _->
                try {
                    openFileOutput("datos.txt", MODE_PRIVATE).use {
                        it.write("".toByteArray())
                    }
                    Toast.makeText(this,"Datos borrados",Toast.LENGTH_LONG)
                }catch (e: Exception){
                    e.printStackTrace()
                    Toast.makeText(this,"Error al borrar los datos", Toast.LENGTH_LONG)
                }
                builder.setNegativeButton("Cancelar"){dialog,_->
                    dialog.dismiss()
                }
                val dialog =builder.create()
                dialog.show()
            }
        }

        btnGuardar.setOnClickListener{
            val text=inputText.text.toString()+"\n"
            try {
                openFileOutput(fileName, MODE_APPEND).use {
                    it.write(text.toByteArray())
                }
                inputText.text.clear()
            }catch (e: Exception){
                e.printStackTrace()
            }
        }

        btnLeer.setOnClickListener{
            try {
                val contenido =openFileInput(fileName).bufferedReader().useLines { lines ->
                    lines.joinToString("\n")
                }
                outputText.text=contenido
            }catch (e: FileNotFoundException){
                outputText.text = "Archivo no encontrado"
            }catch (e: Exception){
                e.printStackTrace()
            }
        }

    }
}