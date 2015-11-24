package es.carlostessier.mispruebas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ImplicitIntents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
    }

    public void onClickWebBrowser(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uem.es"));
        startActivity(browser);
    }

    public void onClickCall(View view) {

        String number = "tel:902232350";
        Uri call = Uri.parse("tel:" + number);
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, call);
        startActivity(dialIntent);
    }

    public void onClickMap(View view) {

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.3736,-3.919848"));
        startActivity(mapIntent);

    }
}
