package com.example.slovarsluha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.slovarsluha.adapter.CategoryItemsAdapter;
import com.example.slovarsluha.model.CategoryItems;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity implements RecyclerViewInterface{
    RecyclerView categoryRecycler;
    CategoryItemsAdapter categoryItemsAdapter;
    List<CategoryItems> categoryItemsList = new ArrayList<>();
    TextView textViewListName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        textViewListName = findViewById(R.id.textViewListName);

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();

        switch (name){
            case "Природа":
                categoryItemsList = Data.natureList;
                break;
            case "Животные":
                categoryItemsList = Data.animalsList;
                break;
            case "Транспорт":
                categoryItemsList = Data.transportList;
                break;
            case "Пиротехника":
                categoryItemsList = Data.piroList;
                break;
        }

        textViewListName.setText(name);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        categoryRecycler = findViewById(R.id.recyclerViewList);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryItemsAdapter = new CategoryItemsAdapter(this, categoryItemsList, this);
        categoryRecycler.setAdapter(categoryItemsAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("NAME", categoryItemsList.get(position).getName());
        intent.putExtra("UPPER", categoryItemsList.get(position).getUpper());
        intent.putExtra("DOWNER", categoryItemsList.get(position).getDowner());
        intent.putExtra("URL", categoryItemsList.get(position).getUrlVideo());


        startActivity(intent);
    }
}