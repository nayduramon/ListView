package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Andorid",
        "Phone",
        "Windows phone",
        "Blackberry",
        "Firefox Os",
        "Amazon Work",
        "Nokia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //se obtiene el viw lstSo
        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.lsvSO) as ListView
        //se crea un adaptador para llenar lista
        val adaptador: Any? =
            ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)
        //se asigna el adaptador a la view
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?
        // se genera el metdo setonItemClickLister de la view

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Position:  $position",
                Toast.LENGTH_SHORT

            ).show()
        }
    }
}