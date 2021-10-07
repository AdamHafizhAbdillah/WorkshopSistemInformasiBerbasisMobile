package com.hafizh.tugasmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class tgsautocomplete extends AppCompatActivity {

    //Daftar Item Menggunakan Array
    private static final String[] CITIES = new String[]{
           "Ambon","Banyuwangi", "Jember", "Pasuruan", "Probolinggo", "Malang", "Bondowoso", "Situbondo", "Surabaya", "Madiun", "Blitar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgsautocomplete);

        //Membuat find view untuk mencari activity autocomplete menggunakan id
        AutoCompleteTextView editText = findViewById(R.id.tgsautocomplete);
        //Membuat Adapter untuk mengatur bagaimana Item/Konten itu tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CITIES);
        editText.setAdapter(adapter);
    }
}