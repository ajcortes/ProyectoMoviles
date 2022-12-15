package com.ajcortes.proyectoinicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //incluye un controlador de navegacion
        val navFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView6) as NavHostFragment
        val navController = navFragment.navController
        //establece la barra con controles
        NavigationUI.setupActionBarWithNavController(this,navController)

        val bottomNav : BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNav.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragmentContainerView6)
        return navController.navigateUp()
    }
}