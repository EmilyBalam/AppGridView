package com.example.appgridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas: ArrayList<String> = ArrayList()
        frutas.add("Manzana")
        frutas.add("Durazno")
        frutas.add("Platano")
        frutas.add("Sandia")

        var grid:GridView= findViewById(R.id.Grid)
        var adaptador = ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,frutas)
        grid.adapter= adaptador

        grid.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,frutas.get(position),Toast.LENGTH_SHORT).show()
        }
    }
}