package com.paradeeez.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity0 extends AppCompatActivity implements View.OnClickListener {

    int quizCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        Button btnAlphabets = findViewById(R.id.btnAlphabets);
        Button btnNumbers = findViewById(R.id.btnNumbers);
        Button btnColours = findViewById(R.id.btnColours);
        Button btnShapes = findViewById(R.id.btnShapes);
        Button btnBodyParts = findViewById(R.id.btnBodyParts);
        Button btnAnimals = findViewById(R.id.btnAnimals);

        btnAlphabets.setOnClickListener(this);
        btnNumbers.setOnClickListener(this);
        btnColours.setOnClickListener(this);
        btnShapes.setOnClickListener(this);
        btnBodyParts.setOnClickListener(this);
        btnAnimals.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity0.this, MainActivity.class);
        if (v.getId() == R.id.btnAlphabets) {
            intent.putExtra("option",0);
        } else if (v.getId() == R.id.btnNumbers) {
            intent.putExtra("option",1);
        } else if (v.getId() == R.id.btnColours) {
            intent.putExtra("option",2);
        } else if (v.getId() == R.id.btnShapes) {
            intent.putExtra("option",3);
        } else if (v.getId() == R.id.btnBodyParts) {
            intent.putExtra("option",4);
        } else if (v.getId() == R.id.btnAnimals) {
            intent.putExtra("option",5);
        }

        startActivity(intent);

    }
}