package es.carlostessier.mispruebas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class Intents_Act_01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_01);
    }


        //Con este metodo nos iriamos a la otra ventana
        public void pulsarBoton(View view) {
            startActivity(new Intent(this, Intents_Act_01_b.class));
        }


      @Override
        public boolean onOptionsItemSelected(MenuItem item) {
              // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
          int id = item.getItemId();

                     //noinspection SimplifiableIfStatement
                               if (id == R.id.action_settings) {
                    return true;
                   }

                    return super.onOptionsItemSelected(item);
        }

}








