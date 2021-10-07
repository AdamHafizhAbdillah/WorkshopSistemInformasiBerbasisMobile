package com.hafizh.tugasmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class tgsrecycler extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgsrecycler);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new RecyclerAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(tgsrecycler.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Andi", "3338989", "081456789444"));
        mahasiswaArrayList.add(new Mahasiswa("Rendi", "565468", "087654321454"));
        mahasiswaArrayList.add(new Mahasiswa("Aris", "455646", "08764876545646"));
        mahasiswaArrayList.add(new Mahasiswa("Adam Hafizh Abdillah", "23213244", "087581245646"));
    }

    }
