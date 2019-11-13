package com.example.pmdmodeportesfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FamosoActivity extends AppCompatActivity {

    private ImageView imFamoso;
    private TextView tvNombre, tvLogro;

    private String deporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famoso);
        initComponents();

        deporte = getIntent().getStringExtra("deporte");

        switch (deporte){
            case "baloncesto":
                imFamoso.setImageResource(R.drawable.willy);
                tvNombre.setText("Guillermo Gustavo Hernangómez Geuer, más conocido como Willy Hernangómez");
                tvLogro.setText("Ha logrado su tope anotador de la temporada, 22 puntos en solo 23 minutos de partido.");
                break;
            case "ciclismo":
                imFamoso.setImageResource(R.drawable.miguel);
                tvNombre.setText("Miguel Induraín");
                tvLogro.setText("Ganador del Tour de Francia 5 años seguidos (1991 - 95).");
                break;
            case "futbol":
                imFamoso.setImageResource(R.drawable.casillas);
                tvNombre.setText("Iker Casillas");
                tvLogro.setText("Ha ganado una copa Welmeister con la Selección Española en 2010, " +
                        "una copa under 16 European Champion (1997), " +
                        "dos copas UEFA-Supercup_Sieger (2002-03 y 2014-15), " +
                        "una copa U20-Weltmeister (1999), " +
                        "una copa Portugiesischer Meister (2017-18), " +
                        "dos copas Spanischer Pokalsieger (2010-11 y 2013-14), " +
                        "etc. Sumando un total de 29 copas.");
                break;
        }
    }

    private void initComponents() {
        imFamoso = findViewById(R.id.imFamoso);
        tvNombre = findViewById(R.id.tvNombre);
        tvLogro = findViewById(R.id.tvLogro);
    }


}
