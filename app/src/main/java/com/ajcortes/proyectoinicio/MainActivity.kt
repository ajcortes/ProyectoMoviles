package com.ajcortes.proyectoinicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enlace al botón e incorporación de evento "click".
        val btnAnswer = findViewById<Button>(R.id.buttonCredit)
        btnAnswer.setOnClickListener {
            goToContact()
        }

    }

    fun goToContact() {
        //crear el intent
        val intent = Intent(this@MainActivity, CreditActivity::class.java)
        //tomar el valor del cuadro de texto.
        val etNombre = this.findViewById<EditText>(R.id.etName)
        //añadimos la información necesaria al intent
        intent.putExtra("NAME", etNombre.text.toString())

        //iniciar la nueva actividad
        startActivity(intent)
    }
}