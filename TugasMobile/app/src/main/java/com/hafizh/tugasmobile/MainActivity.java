package com.hafizh.tugasmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button 1 untuk menampilkan list view

        Button butonlistview=(Button)findViewById(R.id.buttonlistview);
        butonlistview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,tgslistview.class);
                startActivity(inten1);
            }
        });

        //button 1 untuk menampilkan list view

        Button buttonspinner=(Button)findViewById(R.id.buttonspinner);
        buttonspinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,tgsspinner.class);
                startActivity(inten1);
            }
        });

        //button 1 untuk menampilkan  list view

        Button buttonautocomplete=(Button)findViewById(R.id.buttonautocomplete);
        buttonautocomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,tgsautocomplete.class);
                startActivity(inten1);
            }
        });
        //button 1 untuk menampilkan list view

        Button buttonrecyler=(Button)findViewById(R.id.buttonrecycler);
        buttonrecyler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,tgsrecycler.class);
                startActivity(inten1);
            }
        });

    }
}