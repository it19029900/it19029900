package com.example.it19029900;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textVMsg2 = findViewById(R.id.TvMsg2);
        textVMsg2.setText(R.string.Msg2);

        Log.d( "Lifecycle", "on create...");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d( "Lifecycle", "on start...");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d( "Lifecycle", "on Resume...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d( "Lifecycle", "on Pause...");

    }
}