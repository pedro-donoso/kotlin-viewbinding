package com.example.vistas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class ButtonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el layout del fragmento
        val view = inflater.inflate(R.layout.fragment_button, container, false)

        // Obtener referencia al botón
        val btnAceptar: Button = view.findViewById(R.id.btnAceptar)

        // Agregar evento de clic al botón usando expresión lambda
        btnAceptar.setOnClickListener {
            Toast.makeText(
                requireContext(),
                "¡Desde Fragment!",
                Toast.LENGTH_SHORT
            ).show()
        }

        return view
    }
}