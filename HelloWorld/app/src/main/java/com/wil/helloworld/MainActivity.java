package com.wil.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button buttonUri, buttonLoc, buttonShare;
    EditText editTextUri, editTextLoc, editTextShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");

        initialiseUI();
    }

    public void initialiseUI() {
        buttonUri = findViewById(R.id.button);
        buttonLoc = findViewById(R.id.button2);
        buttonShare = findViewById(R.id.button3);

        editTextUri = findViewById(R.id.editText);
        editTextLoc = findViewById(R.id.editText2);
        editTextShare = findViewById(R.id.editText3);
    }

    public void openLocation(View view) {
        /*
        String location = editTextLoc.getText().toString();

        Uri addressUri = Uri.parse("geo:51.5,0.07?q=" + location);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
         */

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 51.5, 0.07"));
        startActivity(intent);

    }

    public void launchWebsite(View view) {
        /*
        String url = editTextUri.getText().toString();

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }

         */

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"));
        startActivity(intent);

    }

    public void shareText(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 12345"));
        startActivity(intent);

    }

}