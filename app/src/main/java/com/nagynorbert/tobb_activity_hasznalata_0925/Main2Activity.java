package com.nagynorbert.tobb_activity_hasznalata_0925;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button buttonVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonVissza = findViewById(R.id.buttonVissza);

        buttonVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vissza = new Intent(Main2Activity.this, MainActivity.class);

                startActivity(vissza);
                finish();
            }
        });
    }
}
