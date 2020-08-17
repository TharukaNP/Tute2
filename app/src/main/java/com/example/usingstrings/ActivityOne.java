package com.example.usingstrings;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {

    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        //txtVMsg2.setText(R.string.Msg2);
        nextBtn = findViewById(R.id.DnBt);
        setListeners();

        Log.i("Lifecycle", "OnCreate called...");
    }

    public void setListeners(){

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityOne.this, MainActivity2.class);
                startActivity(intent);
                finish();
                Log.i("Lifecycle", "clicked");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle", "OnStart called...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("Lifecycle", "OnRestart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle", "OnResume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle", "OnPause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle", "OnStop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle", "OnDestroy called...");
    }
}