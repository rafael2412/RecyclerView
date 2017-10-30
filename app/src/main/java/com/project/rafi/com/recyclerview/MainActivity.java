package com.project.rafi.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // lista de alarmas
    ArrayList<Vista> alarmas;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmas = new ArrayList<>();
        llenarLista(); // llenar la lista de alarmas

        //traer el recyclerview al codigo desde xml haciendo referencia a su ID
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // creando la disposicion en lo que se mostraron los elementos en la lista
        // en este casi sera de forma lineal verticalmente
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        // se asigna la disposicion
        recyclerView.setLayoutManager(linearLayoutManager);

        // se crea una instancia de la clase Adaptador
        Adaptador adaptador = new Adaptador(alarmas);

        // se le asigna el adaptador al recyclerview
        recyclerView.setAdapter(adaptador);

    }

    private void llenarLista(){// Llenar la lista con alarmas
        alarmas.add(new Vista("Cena del perro", "08:00 PM"));
        alarmas.add(new Vista("Llamar a Rafi", "11:00 AM"));
        alarmas.add(new Vista("Clase de piano", "02:30 PM"));
        alarmas.add(new Vista("Programar", "06:00 PM"));
        alarmas.add(new Vista("Pasear el perro", "04:00 PM"));
        alarmas.add(new Vista("Sacar la basura", "09:00 PM"));
        //estos datos son falsos para testear pero esta informacion
        //podria venir de un servidor web o la app de alarmas incorporada en el sistema.
    }
}
