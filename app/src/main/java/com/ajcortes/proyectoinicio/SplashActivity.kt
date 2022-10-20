package com.ajcortes.proyectoinicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("QUE SI FUNCIONA")
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}