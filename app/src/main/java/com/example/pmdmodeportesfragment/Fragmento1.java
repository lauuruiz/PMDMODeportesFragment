package com.example.pmdmodeportesfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmento1 extends Fragment {
    private ImageButton ibtBaloncesto, ibtCiclismo, ibtFutbol;
    private ImageView imDeporte;
    private Button btFamoso;

    private static String deporte = "deporte";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.lo_fragmento1, container);
        initcomponents(vista);
        return vista;
    }

    private void initcomponents(View view){
        ibtBaloncesto = view.findViewById(R.id.ibtBaloncesto);
        ibtCiclismo = view.findViewById(R.id.ibtCiclismo);
        ibtFutbol = view.findViewById(R.id.ibtFutbol);

        //eventos
        ibtBaloncesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imDeporte = getActivity().findViewById(R.id.imDeporte);
                imDeporte.setImageResource(R.drawable.baloncesto);

                btFamoso = getActivity().findViewById(R.id.btFamoso);
                btFamoso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), FamosoActivity.class);
                        i.putExtra(deporte, "baloncesto");
                        startActivity(i);
                    }
                });
            }
        });

        ibtCiclismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imDeporte = getActivity().findViewById(R.id.imDeporte);
                imDeporte.setImageResource(R.drawable.ciclismo);

                btFamoso = getActivity().findViewById(R.id.btFamoso);
                btFamoso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), FamosoActivity.class);
                        i.putExtra(deporte, "ciclismo");
                        startActivity(i);
                    }
                });
            }
        });

        ibtFutbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imDeporte = getActivity().findViewById(R.id.imDeporte);
                imDeporte.setImageResource(R.drawable.futbol);

                btFamoso = getActivity().findViewById(R.id.btFamoso);
                btFamoso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), FamosoActivity.class);
                        i.putExtra(deporte, "futbol");
                        startActivity(i);
                    }
                });
            }
        });
    }
}
