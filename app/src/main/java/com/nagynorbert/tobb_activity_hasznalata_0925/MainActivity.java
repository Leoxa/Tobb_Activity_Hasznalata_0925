package com.nagynorbert.tobb_activity_hasznalata_0925;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonTovabb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTovabb = findViewById(R.id.buttonTovabb);

        buttonTovabb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tovabb = new Intent(MainActivity.this, Main2Activity.class); //--> kövi activityre lép
                //Intent tovabb = new Intent(getApplicationContext(), Main2Activity.class); <- másik verzió, ha nem tudjuk h melyik activityn vagyunk

                startActivity(tovabb);
                finish();
            }
        });
    }
}
