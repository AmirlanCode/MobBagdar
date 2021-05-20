package com.amircompany.javakaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ListView listViewBasic;
    private ArrayList<JavaBas> basics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        basics = new ArrayList<>();
        basics.add(new JavaBas(getString(R.string.history_java) , getString(R.string.history_java_info)));
        basics.add(new JavaBas(getString(R.string.types),getString(R.string.types_info)));
        basics.add(new JavaBas(getString(R.string.operator),getString(R.string.operator_info)));
        basics.add(new JavaBas(getString(R.string.condition_operators),getString(R.string.condition_operators_info)));
        basics.add(new JavaBas(getString(R.string.cyclers),getString(R.string.cyclers_info)));
        listViewBasic = findViewById(R.id.list_2);
        ArrayAdapter<JavaBas> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,basics);
        listViewBasic.setAdapter(adapter);

        listViewBasic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                JavaBas javaBas = basics.get(i);
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("title",javaBas.getTitle());
                intent.putExtra("info",javaBas.getInfo());
                startActivity(intent);
            }
        });
    }
}