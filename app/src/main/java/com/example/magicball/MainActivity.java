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
private String  [] respuestaArray={"\"Es cierto\", \"Definitivamente es así\", \"Sin duda\", \"Sí definitivamente\", \"Puede confiar en él\", \"Como yo lo veo, sí\",\n" +
        "        \"Lo más probable\", \"Perspectiva buena\", \"Sí\", \"Las señales apuntan a sí\", \"Respuesta confusa intente de nuevo\", \"Pregunte de nuevo más tarde\",\n" +
        "        \"Mejor no decirte ahora\", \"No puedo predecir ahora\", \"Concéntrate y pregunta de nuevo\", \"No cuentes con eso\",\n" +
        "        \"Mi respuesta es no\", \"Mis fuentes dicen que no\", \"Outlook no es tan bueno\", \"Muy dudoso\""}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia la imagen
        ball = findViewById(R.id.btn);
        //refencia texto
        respuesta = findViewById(R.id.respuesta);

        //proceso

        ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Consulta tu suerte", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onClick(View view){
    //creación metodo switch
      switch (v.getID()){
          case R.id.btn:

              int rand = new Random().nextInt(respuestaArray.length);
              respuesta.setText(respuestaArray[rand]);
              break;
      }
    }

}
