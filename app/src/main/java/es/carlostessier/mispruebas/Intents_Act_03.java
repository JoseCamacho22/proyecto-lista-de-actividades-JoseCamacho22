package es.carlostessier.mispruebas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Intents_Act_03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03);

    }

    public void pulsarBoton(View view) {
        Intent intent = new Intent(this, Intents_Act_03_b.class);

       /* Vamos a enviar mediante un objeto Intent dos cadenas de texto. Para ello utilizaremos
        dos formas diferentes. El primero mediante el método putExtra(nombre,valor) del
        objeto Intent enviaremos dos par nombre/valor. nombre “str1” con valor “Esto es un
        String” y nombre “num1” con el valor entero 25*/
            intent.putExtra("str", "Esto es un string");
            intent.putExtra("num1", 25);
        //otra forma de hacerlo además de utilizar el método putExtra(), es crear un objeto
        //Bundle y unirlos mediante el método putExtras(Bundle bundle) al objeto inten anterior.
            Bundle bundle = new Bundle();
            bundle.putString("str2", "Este es otro string");
            bundle.putInt("num2", 35);

           // añadimos al intent el bundle con el método putExtras().
            intent.putExtras(bundle);

            //Por último solo tenemos que llamar a la actividad para enviarle los datos
            startActivityForResult(intent, 2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d("mensaje", "recibiendo");
        if (requestCode == 2) {
            Log.d("mensaje", "mensaje requestCod 2");

            if (resultCode == RESULT_OK) {
                Log.d("mensaje", "mensaje OK");

                String message =data.getData().toString();
                Log.d("mensaje", message);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

            }
        }
    }
}