package es.carlostessier.mispruebas;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

// Metodo onReciver es el receptor de la emisión del BroadCast

    @Override
    public void onReceive(Context context, Intent intent) {


        String message = intent.getStringExtra("message");
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();


    }
}
