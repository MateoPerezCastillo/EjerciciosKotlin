package com.example.pruebamovil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InventarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventario)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerProductos)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ProductoAdapter(MainActivity.listaProductos)

        recyclerView.adapter = adapter
    }
}