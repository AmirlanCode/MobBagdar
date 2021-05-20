package com.amircompany.javakaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView textViewTitle;
    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textViewTitle = findViewById(R.id.textInfo);
        textViewInfo = findViewById(R.id.textView);

        Intent intent = getIntent();
        if(intent.hasExtra("title") && intent.hasExtra("info")) {
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            textViewTitle.setText(title);
            textViewInfo.setText(info);

        }else {
            Intent backToCategory = new Intent(this,MainActivity.class);
            startActivity(backToCategory);
        }
    }
}