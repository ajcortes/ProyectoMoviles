package com.ajcortes.proyectoinicio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        //obtener una referencia a la etiqueta de la activida
        val tvGreeting = findViewById<TextView>(R.id.tvUser)

        //recogemos el nombre del inten
        val nombre = intent.getStringExtra("NAME")
        //creamos la cadena del saludo
        tvGreeting.apply {
            //toma el valor de la cadena "greeting" y le incorpora el valor del nombre.
            text = getString(R.string.info,nombre)
        }
        val nombre_app = getResources().getString(R.string.app_name);
        val btnAnswer = findViewById<Button>(R.id.buttonCredit)
        val correoUsuario = "ajcortes21@gmail.com"
        btnAnswer.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND, Uri.parse(correoUsuario))
            emailIntent.type = "plain/text"
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Consulta sobre " + nombre_app)
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Escriba su consulta")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("dev1@gmail.com","dev2@gmail.com"))
            startActivity(Intent.createChooser(emailIntent, "aasda"))
        }
    }
}