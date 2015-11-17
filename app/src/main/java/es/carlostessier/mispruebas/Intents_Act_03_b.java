package es.carlostessier.mispruebas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Intents_Act_03_b extends AppCompatActivity {
    EditText nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03_b);
        nombre=(EditText)findViewById(R.id.editText2);


        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("str");
        String str2 = bundle.getString("str2");
        int num1 = bundle.getInt("num1");
        int num2 = bundle.getInt("num2");
        //Dentro del toast les pasamos las cadenas y los enteres que hemos declarado
       // anteriormente
        Toast.makeText(this, str + "\n" + str2 + "\n" + Integer.toString(num1)+"\n" +Integer.toString(num2), Toast.LENGTH_LONG).show();

    }

    //Metodo para volver a la actividad anterior pasando el mensaje de editText
    public void volverActividadPrincipal(View view){

            Intent intent = new Intent();
            intent.setData(Uri.parse(nombre.getText().toString()));
            setResult(RESULT_OK, intent);
            finish();

        }

    }





