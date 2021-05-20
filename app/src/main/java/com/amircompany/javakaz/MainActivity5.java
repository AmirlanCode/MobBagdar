package com.amircompany.javakaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private TextView textViewTitle1;
    private TextView textViewInfo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textViewTitle1 = findViewById(R.id.textInfo1);
        textViewInfo1 = findViewById(R.id.textView1);

        Intent intent = getIntent();
        if(intent.hasExtra("title") && intent.hasExtra("info")) {
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            textViewTitle1.setText(title);
            textViewInfo1.setText(info);

        }else {
            Intent backToCategory = new Intent(this,MainActivity.class);
            startActivity(backToCategory);
        }

    }
}