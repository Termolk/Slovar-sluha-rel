package com.example.slovarsluha;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.slovarsluha.adapter.CategoryAdapter;
import com.example.slovarsluha.model.Category;
import com.example.slovarsluha.model.CategoryItems;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;
    ImageView imageView;

    Button buttonNature;
    Button buttonAnimals;
    Button buttonTransport;
    Button buttonPiro;

    Button buttonGoSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setClickListenersOnViews();
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        Intent intent1 = new Intent(this, SearchActivity.class);
        Intent intent2 = new Intent(this, InfoActivity3.class);


        if (view.getId() == R.id.buttonNature) {
            intent.putExtra("name", "Природа");
            startActivity(intent);
        }
        if (view.getId() == R.id.buttonAnimals) {
            intent.putExtra("name", "Животные");
            startActivity(intent);
        }
        if (view.getId() == R.id.buttonTransport) {
            intent.putExtra("name", "Транспорт");
            startActivity(intent);
        }
        if (view.getId() == R.id.buttonPiro) {
            intent.putExtra("name", "Пиротехника");
            startActivity(intent);
        }

        if (view.getId() == R.id.btn_search_view){
            startActivity(intent1);
        }

        if (view.getId() == R.id.imageView){
            startActivity(intent2);
        }

    }

    public void initViews(){
        buttonGoSearch = findViewById(R.id.btn_search_view);
        buttonNature = findViewById(R.id.buttonNature);
        buttonAnimals = findViewById(R.id.buttonAnimals);
        buttonTransport = findViewById(R.id.buttonTransport);
        buttonPiro = findViewById(R.id.buttonPiro);
        imageView = findViewById(R.id.imageView);
    }

    public void setClickListenersOnViews(){
        buttonGoSearch.setOnClickListener(this);
        buttonNature.setOnClickListener(this);
        buttonAnimals.setOnClickListener(this);
        buttonTransport.setOnClickListener(this);
        buttonPiro.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }
}