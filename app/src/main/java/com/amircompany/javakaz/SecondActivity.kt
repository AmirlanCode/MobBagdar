package com.amircompany.javakaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

//class SecondActivity : AppCompatActivity() {
//
//    private lateinit var listView : ListView
//    private lateinit var arr : ArrayList<JavaBasic>
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
//
//        arr = arrayListOf()
//        arr.add(JavaBasic(getString(R.string.history_java),getString(R.string.history_java_info)))
//        arr.add(JavaBasic(getString(R.string.types),getString(R.string.types_info) ))
//        arr.add(JavaBasic(getString(R.string.operator),getString(R.string.operator_info)))
//        arr.add(JavaBasic(getString(R.string.condition_operators),getString(R.string.condition_operators_info)))
//        arr.add(JavaBasic(getString(R.string.cyclers),getString(R.string.cyclers_info)))
//
//        listView = findViewById(R.id.list_second)
//        val adapter : ArrayAdapter<JavaBasic> = ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1 ,arr)
//        listView.adapter = adapter
//        listView.setOnItemClickListener { adapterView, view, i, l ->
//            val javaBasic = arr.get(i)
//            val intent = Intent(applicationContext,JavaBasicDetails::class.java)
//            intent.putExtra("title",javaBasic.title)
//            intent.putExtra("info",javaBasic.info)
//            startActivity(intent)
//        }
//    }
//}