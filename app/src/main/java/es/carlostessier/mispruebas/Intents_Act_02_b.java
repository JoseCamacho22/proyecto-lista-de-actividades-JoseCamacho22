package es.carlostessier.mispruebas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class Intents_Act_02_b extends AppCompatActivity {
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_02_b);
    }


        /*EditText editText = (EditText) findViewById(R.id.editText);
        String sEditText = editText.getText().toString();

        // Creamos un intent para devolver los datos
        Intent intent = new Intent();
        intent.putExtra("edittext", sEditText);
        setResult(RESULT_OK,intent);

        finish();*/

        public void pulsarBoton(View view){
                Intent intent = new Intent();
                try {
                    EditText eName = (EditText) findViewById(R.id.editText);
                    String sName = eName.getText().toString();
                    intent.setData(Uri.parse(sName));
                    setResult(RESULT_OK, intent);

                }
                catch(Exception e){
                    setResult(0, intent);
                }
                finish();
            }
        }






