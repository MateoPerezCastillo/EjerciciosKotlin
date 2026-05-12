package com.example.pruebamovil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCantidad = findViewById<EditText>(R.id.etCantidad)
        val etPrecio = findViewById<EditText>(R.id.etPrecio)

        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener {

            val nombre = etNombre.text.toString()
            val cantidad = etCantidad.text.toString().toIntOrNull()
            val precio = etPrecio.text.toString().toDoubleOrNull()

            if (nombre.isNotEmpty() && cantidad != null && precio != null) {

                val producto = Producto(nombre, cantidad, precio)

                MainActivity.listaProductos.add(producto)

                Toast.makeText(this, "Producto guardado", Toast.LENGTH_SHORT).show()

                finish()

            } else {
                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}