package com.project.rafi.com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rafic on 29/10/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private ArrayList<Vista> alarmas;

    public Adaptador(ArrayList<Vista> alarmas) {
        this.alarmas = alarmas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista, parent, false);
        return new Adaptador.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Vista elemento = alarmas.get(position); // se optine el objeto de alarma

        holder.mensaje.setText(elemento.getMensaje());
        holder.hora.setText(elemento.getHora());


    }

    @Override
    public int getItemCount() {
        return alarmas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView mensaje;
        TextView hora;
        public ViewHolder(View itemView) {
            super(itemView);
            mensaje = (TextView) itemView.findViewById(R.id.view_mensaje);
            hora = (TextView) itemView.findViewById(R.id.view_fecha);
        }
    }

}
