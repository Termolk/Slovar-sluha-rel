package com.example.slovarsluha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.slovarsluha.adapter.CategoryAdapter;
import com.example.slovarsluha.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Природа"));
        categoryList.add(new Category(2, "Животные"));
        categoryList.add(new Category(3, "Транспорт"));
        categoryList.add(new Category(4, "Пиротехника"));
        categoryList.add(new Category(4, "Пиротехника"));
        categoryList.add(new Category(4, "Пиротехника"));
        categoryList.add(new Category(4, "Пиротехника"));
        categoryList.add(new Category(4, "Пиротехника"));
        categoryList.add(new Category(4, "Пиротехника"));

        setCategoryRecycler(categoryList);

    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        categoryRecycler = findViewById(R.id.recyclerViewCategories);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}