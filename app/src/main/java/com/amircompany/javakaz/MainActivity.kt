package com.amircompany.javakaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list_view)
        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> {
                    val intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent = Intent(this,MainActivity4::class.java);
                    startActivity(intent);
                }
            }
        }
    }
}