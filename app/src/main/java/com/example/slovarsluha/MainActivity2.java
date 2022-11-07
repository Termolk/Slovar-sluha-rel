package com.example.slovarsluha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewNameCategory;
    TextView textViewUpperCategory;
    TextView textViewDownerCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewNameCategory = findViewById(R.id.textViewNameCategory);
        textViewUpperCategory = findViewById(R.id.textViewUpperCategory);
        textViewDownerCategory = findViewById(R.id.textViewDownerCategory);



        String name = getIntent().getStringExtra("NAME");
        String upper = getIntent().getStringExtra("UPPER");
        String downer = getIntent().getStringExtra("DOWNER");


        textViewNameCategory.setText(name);
        textViewUpperCategory.setText(upper);
        textViewDownerCategory.setText(downer);




    }
}