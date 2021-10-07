package com.hafizh.tugasmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tgslistview extends AppCompatActivity {

    ListView ListViewKota;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgslistview);

        ListViewKota  = findViewById(R.id.listViewKotaAct);

        //berfungsi untuk menampilkan data list ke list biew melalui adapter
        adapter = ArrayAdapter.createFromResource(this,R.array.kota, android.R.layout.simple_list_item_1);
        ListViewKota.setAdapter(adapter);

        //action click jika di clikc memunculkan text anda klik negara ke  = (posisi)
        ListViewKota.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Anda Klik Kota : "+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}