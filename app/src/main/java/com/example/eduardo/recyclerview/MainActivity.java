package com.example.eduardo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] nombres = {
            "Aranda Patron Nomar Jaziel",
            "Cardenas Ramos Francisco Emanuel",
            "Castillo Corrales Victor Emmanuel",
            "Cervantes Jiménez José Miguel",
            "Coredero Rivera Selva Yazmin",
            "Cordero Villa Oscar Alberto",
            "Espinoza Abando Denisse Yaneth",
            "Figueroa Cueto Juan Ramón",
            "Gallegos Godines Francisco Javier",
            "Gil Llanos Juan Pedro"
    };

    String [] noControl = {
            "13400400",
            "13400401",
            "13400402",
            "13400403",
            "13400404",
            "13400405",
            "13400406",
            "13400407",
            "13400408",
            "13400409",
            "13400410"
    };

    String [] carrera = {
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //crear referencias hacia el componente RecyclerView
        recyclerView = findViewById(R.id.recycler_id);

        //Crear un objeto de tipo RecyclerAdapter que recibe un arreglo de cadenas
        adapter = new RecyclerAdapter(nombres,noControl,carrera);

        //Crea un objeto de tipo LinearLayoutManager
        layoutManager = new LinearLayoutManager(this);

        //Establecer el LayoutManager
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        //Establecer el adapter
        recyclerView.setAdapter(adapter);
    }
}
