package com.example.slovarsluha;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import com.example.slovarsluha.adapter.CategoryItemsAdapter;
import com.example.slovarsluha.model.CategoryItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchActivity extends AppCompatActivity implements RecyclerViewInterface{
    List<CategoryItems> categoryItemsList = new ArrayList<>();
    RecyclerView categoryRecycler;
    CategoryItemsAdapter categoryItemsAdapter;
    EditText editTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editTextView = findViewById(R.id.editTextView);

        editTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });

        categoryItemsList.addAll(Data.animalsList);
        categoryItemsList.addAll(Data.natureList);
        categoryItemsList.addAll(Data.transportList);
        categoryItemsList.addAll(Data.piroList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        categoryRecycler = findViewById(R.id.recyclerViewList1);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryItemsAdapter = new CategoryItemsAdapter(this, categoryItemsList, this);
        categoryRecycler.setAdapter(categoryItemsAdapter);
    }

    private void filter(String text){
        ArrayList<CategoryItems> filteredList = new ArrayList<>();

        for (CategoryItems item : categoryItemsList){
            if (item.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        categoryItemsAdapter.filterList(filteredList);
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