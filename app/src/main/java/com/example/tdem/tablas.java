package com.example.tdem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.VideoView;

import java.lang.reflect.Array;

public class tablas extends AppCompatActivity {
    private Spinner selec;
    private ImageView tablas;
    private VideoView fond;
    private Button creator;
    String tabl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablas);

        creator = (Button) findViewById(R.id.about);
        selec = (Spinner) findViewById(R.id.spinner);
        tablas = (ImageView) findViewById(R.id.IMcos);
        fond = (VideoView) findViewById(R.id.vvfobd);

        fond.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.fond));
        fond.start();

        String cosas[]= {"Gestion de tablas","Tabla 1","Tabla 2","Tabla 3","Tabla 4","Tabla 5","Tabla 6","Tabla 7","Tabla 8","Tabla 9","Tabla 10"};
        ArrayAdapter si = new ArrayAdapter(this,R.layout.spiner,cosas);
        selec.setAdapter(si);

        selec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                tabl = cosas[position];
                metodo();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        creator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),about.class);
                startActivity(a);
                finish();
            }
        });
    }


    public  void metodo(){

        if(tabl.equals("Gestion de tablas")){
            tablas.setImageDrawable(null);
        }
        if(tabl.equals("Tabla 1")){
            tablas.setImageResource(R.drawable.tabla1);
        }
        if(tabl.equals("Tabla 2")){
            tablas.setImageResource(R.drawable.tabla2);
        }
        if(tabl.equals("Tabla 3")){
            tablas.setImageResource(R.drawable.tabla3);
        }
        if(tabl.equals("Tabla 4")){
            tablas.setImageResource(R.drawable.tabla4);
        }
        if(tabl.equals("Tabla 5")){
            tablas.setImageResource(R.drawable.tabla5);
        }
        if(tabl.equals("Tabla 6")){
            tablas.setImageResource(R.drawable.tabla6);
        }
        if(tabl.equals("Tabla 7")){
            tablas.setImageResource(R.drawable.tabla7);
        }
        if(tabl.equals("Tabla 8")){
            tablas.setImageResource(R.drawable.tabla8);
        }
        if(tabl.equals("Tabla 9")){
            tablas.setImageResource(R.drawable.tabla9);
        }
        if(tabl.equals("Tabla 10")){
            tablas.setImageResource(R.drawable.tabla10);
        }


    }
}