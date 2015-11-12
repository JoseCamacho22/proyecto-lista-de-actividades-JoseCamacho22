package es.carlostessier.mispruebas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Ciclodevida extends AppCompatActivity {


    private static final String TAG = Ciclodevida.class.getName();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclodevida);
        android.util.Log.i(TAG, "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }




}