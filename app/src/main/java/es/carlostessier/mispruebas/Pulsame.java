package es.carlostessier.mispruebas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Pulsame extends AppCompatActivity {

    public static int numVeces; //numero de veces que pulsamoz
    static final String STATE_PULSA = "numVeces";
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsame);
        boton = (Button) findViewById(R.id.button);

        if(savedInstanceState != null){
            numVeces=savedInstanceState.getInt(STATE_PULSA);
            boton.setText("pulsado "+ numVeces);
        }

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numVeces<30) {
                    numVeces++;
                    boton.setText("pulsado " + numVeces + " veces");
                }else{
                    boton.setText("Pulsa el boton");
                }

            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_PULSA, numVeces);
    }



    }
