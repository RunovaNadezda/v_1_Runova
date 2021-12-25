package com.example.runova_v_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart =  findViewById(R.id.btnStart);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, foto.class);
        startActivity(intent);
    }
}