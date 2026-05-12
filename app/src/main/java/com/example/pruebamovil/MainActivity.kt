package com.example.pruebamovil

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        val listaProductos = mutableListOf<Producto>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Kotlin Basics
        var a = 4
        var b = 7

        Log.d("SERIE", "$a")
        Log.d("SERIE", "$b")

        for (i in 3..10) {
            val siguiente = a + b
            Log.d("SERIE", "$siguiente")
            a = b
            b = siguiente
        }

        val btnRegistro = findViewById<Button>(R.id.btnRegistro)
        val btnInventario = findViewById<Button>(R.id.btnInventario)

        btnRegistro.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }

        btnInventario.setOnClickListener {
            val intent = Intent(this, InventarioActivity::class.java)
            startActivity(intent)
        }
    }
}