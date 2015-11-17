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
        android.util.Log.i(TAG,"onStar");
        android.util.Log.i(TAG,"onRestart");
        android.util.Log.i(TAG, "onResume");
        android.util.Log.i(TAG,"onPause");
        android.util.Log.i(TAG,"onStop");
        android.util.Log.i(TAG,"onDestroy");

    }

    @Override

    protected void onStart() {
        super.onStart();
       android.util.Log.i(TAG, "onStar");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i(TAG,"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i(TAG,"onDestroy");
    }




}