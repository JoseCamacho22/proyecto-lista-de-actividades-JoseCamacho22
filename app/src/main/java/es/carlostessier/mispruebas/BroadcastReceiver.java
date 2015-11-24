package es.carlostessier.mispruebas;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BroadcastReceiver extends AppCompatActivity {

    BroadcastReceiver miReceptor;
    IntentFilter intentFilter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);



        miReceptor = new BroadcastReceiver();
        intentFilter = new IntentFilter("CUSTOM_INTENT");}


    //EL METODO QUE ENVIA EL BROADCAST AL CUAL AÑADIMOS EL STRING SOLICITADO

    public void onClickSendBroadcast(View view){
        Intent intent = new Intent("CUSTOM_INTENT");
        intent.putExtra("message", "Hello world");
        //intent.setAction("es.carlostessier.mispruebas.BroadcastReceiver.CUSTOM_INTENT");
        sendBroadcast(intent);

        }


}
