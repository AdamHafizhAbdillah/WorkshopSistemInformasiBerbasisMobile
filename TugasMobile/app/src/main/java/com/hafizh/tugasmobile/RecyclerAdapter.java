package com.hafizh.tugasmobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolderRecycler>{
    private ArrayList<Mahasiswa> datalist;
    public RecyclerAdapter(ArrayList<Mahasiswa> datalist){
        this.datalist = datalist;
    }

    @Override
    public ViewHolderRecycler onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_mahasiswa, parent, false);
        return new ViewHolderRecycler(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderRecycler holder, int position){
        holder.txtNama.setText(datalist.get(position).getNama());
        holder.txtNpm.setText(datalist.get(position).getNpm());
        holder.txtNoHp.setText(datalist.get(position).getNohp());
    }

    @Override
    public int getItemCount(){
        return (datalist != null ) ? datalist.size() : 0;
    }

    public class ViewHolderRecycler extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;

        public ViewHolderRecycler(View itemView){
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
