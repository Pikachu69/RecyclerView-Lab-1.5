package com.example.eduardo.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by eduardo on 25/02/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private String[] nombres;
    private String[] carreras;
    private String[] noControl;

    public RecyclerAdapter(String[] nombres, String[] carreras, String [] noControl) {
        this.nombres = nombres;
        this.carreras = carreras;
        this.noControl = noControl;
    }


    @Override
    public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.RecyclerViewHolder holder, int position) {
        holder.campo_nombre.setText(nombres[position]);
        holder.campo_noControl.setText(noControl[position]);
        holder.campo_carrera.setText(carreras[position]);
    }

    @Override
    public int getItemCount() {
        return nombres.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView campo_nombre;
        TextView campo_noControl;
        TextView campo_carrera;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            campo_nombre = itemView.findViewById(R.id.nombre);
            campo_noControl = itemView.findViewById(R.id.control);
            campo_carrera = itemView.findViewById(R.id.carrera);
        }
    }
}
