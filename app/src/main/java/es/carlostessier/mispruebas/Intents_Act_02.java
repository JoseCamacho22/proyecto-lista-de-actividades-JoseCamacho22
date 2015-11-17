package es.carlostessier.mispruebas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Intents_Act_02 extends AppCompatActivity {

    private final static int INTENTS_ACT_O2_B = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_02);
    }

        public void pulsarBoton(View view){
        Intent intent = new Intent(this, Intents_Act_02_b.class);
        startActivityForResult(intent, INTENTS_ACT_O2_B);
    }

    @Override

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == INTENTS_ACT_O2_B) {
            if (resultCode == RESULT_OK) {

                try {
                    String name = data.getData().toString();

                    Toast.makeText(this, name, Toast.LENGTH_LONG).show();

                }catch (Exception e){
                    Toast.makeText(this, "Excepcion", Toast.LENGTH_LONG).show();
                }
            }

            else if (resultCode!=RESULT_CANCELED){
                            Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();

            }
        }

    }

}
