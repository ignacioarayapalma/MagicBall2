package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ball;
    private TextView respuesta;
    private String[] respuestaArray = {"Si esperas que alguien ilumine tu camino, hoy es un buen día para empezar a viajar dentro de tu espíritu.",
            "Si estás deprimido estás viviendo en el pasado / si estás ancioso estás viviendo en el futuro / si estás en paz, estás viviendo en el presente.",
            "No escales la montaña para que el mundo te pueda ver, sino para que vos puedas ver el mundo.",
            "Sonrie aunque tu vida se una mierda....a nadie le importa como estas, sino como te ves.",
            "Especial es quien puede ver en nosotros lo que no mostramos a nadie.",
            "Callando es como se aprende a oir, escuchando es como se aprende a hablar: después, hablando se aprende a callar.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //referencia la imagen
        ball = findViewById(R.id.btn);
        //refencia texto
        respuesta = findViewById(R.id.respuestavista);

        //proceso

        ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Revela tu destino", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        //creación metodo switch
        switch (v.getId()) {
            case R.id.btn:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);
                break;
        }
    }
}