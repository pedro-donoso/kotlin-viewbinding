package com.example.vistas

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Verificar si el estado guardado es nulo para evitar volver a cargar el fragmento
        if (savedInstanceState == null) {
            // Crear una instancia del fragmento que contiene el botón
            val buttonFragment = ButtonFragment()
            // Iniciar una transacción de fragmento
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, buttonFragment)
                .commit()
        }
    }
}


