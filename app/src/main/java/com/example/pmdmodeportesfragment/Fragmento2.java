package com.example.pmdmodeportesfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmento2 extends Fragment {

    private Button btFamoso;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.lo_fragmento2, container);

        btFamoso = vista.findViewById(R.id.btFamoso);
        btFamoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Selecciona una categoria", Toast.LENGTH_SHORT).show();
            }
        });

        return vista;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
