package com.example.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {


    //Variable declaradas
    TextView etiquetadatos; //El texto
    View cambiacolor; //el cuadro para el color
    private int Coloronresume; // metodo OnResume
    private int ColorOnStop; // metodo OnStop


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //try y catch evita que la app se cierra y a nivel de consola buscar el error


            etiquetadatos = findViewById(R.id.tvDAtos); //busca el texto exacto para mostrar
            cambiacolor = findViewById(R.id.colors); //busca el cuadro para mostrar
            Coloronresume = Color.rgb(0,255,255); //cambia el color a celeste en el metodo OnResume
            ColorOnStop = Color.rgb(255,165,0); // cambia el color a anaranjado EN EL METODO OnStop
            cambiacolor.setBackgroundColor(ColorOnStop); //hace que inicie con el color de OnStop para que despues cambie Por el de OnResume

    }


    @Override
    protected void onStop() {
        super.onStop();

        cambiacolor.setBackgroundColor(ColorOnStop);//el color al que cambia
        etiquetadatos.setTextColor(ColorOnStop);//el color al que cambia


    }
    @Override
    protected void onResume() {
        super.onResume();

            cambiacolor.setBackgroundColor(Coloronresume);//el color al que cambia
            etiquetadatos.setTextColor(Coloronresume);//el color al que cambia

    }


}


