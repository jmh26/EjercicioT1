package com.example.ejerciciot1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val boton = findViewById<Button>(R.id.button)

        boton.setOnClickListener{
            boton.text="Enviado"

        }
    }
}