package com.amircompany.javakaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    private ListView listViewBasic;
    private ArrayList<JavaBas> basics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        basics = new ArrayList<>();
        basics.add(new JavaBas(getString(R.string.java_classes) , getString(R.string.java_classes_info)));
        basics.add(new JavaBas(getString(R.string.java_OOP),getString(R.string.java_incap)));
        basics.add(new JavaBas(getString(R.string.polymorphism),getString(R.string.polymorphism_info)));
        basics.add(new JavaBas(getString(R.string.abstract_classes),getString(R.string.abstract_classes_info)));
        basics.add(new JavaBas(getString(R.string.interfaces),getString(R.string.interfaces_info)));
        listViewBasic = findViewById(R.id.list_as);
        ArrayAdapter<JavaBas> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,basics);
        listViewBasic.setAdapter(adapter);

        listViewBasic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                JavaBas javaBas = basics.get(i);
                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                intent.putExtra("title",javaBas.getTitle());
                intent.putExtra("info",javaBas.getInfo());
                startActivity(intent);

            }
        });

    }
}