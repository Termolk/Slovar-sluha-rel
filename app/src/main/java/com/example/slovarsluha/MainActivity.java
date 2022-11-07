package com.example.slovarsluha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.slovarsluha.adapter.CategoryAdapter;
import com.example.slovarsluha.model.Category;
import com.example.slovarsluha.model.CategoryItems;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;

    Button buttonNature;
    Button buttonAnimals;
    Button buttonTransport;
    Button buttonPiro;
    List<Category> categoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();
        setClickListenersOnViews();

        initCategoryList();
        setCategoryRecycler(categoryList);
    }

    private void initCategoryList(){
        categoryList.add(new Category(1, "Природа"));
        categoryList.add(new Category(2, "Животные"));
        categoryList.add(new Category(3, "Транспорт"));
        categoryList.add(new Category(4, "Пиротехника"));
        categoryList.add(new Category(5, "Какой-то раздел"));
        categoryList.add(new Category(6, "123"));
        categoryList.add(new Category(7, "7"));
        categoryList.add(new Category(8, "8888пвап"));
        categoryList.add(new Category(9, "234324а"));
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        categoryRecycler = findViewById(R.id.recyclerViewCategories);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ListActivity.class);
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
    }

    public void initViews(){
        buttonNature = findViewById(R.id.buttonNature);
        buttonAnimals = findViewById(R.id.buttonAnimals);
        buttonTransport = findViewById(R.id.buttonTransport);
        buttonPiro = findViewById(R.id.buttonPiro);
    }

    public void setClickListenersOnViews(){
        buttonNature.setOnClickListener(this);
        buttonAnimals.setOnClickListener(this);
        buttonTransport.setOnClickListener(this);
        buttonPiro.setOnClickListener(this);
    }
}