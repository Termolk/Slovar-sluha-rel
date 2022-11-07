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
    public List<CategoryItems> natureList = new ArrayList<>();
    public List<CategoryItems> animalsList = new ArrayList<>();
    public List<CategoryItems> transportList = new ArrayList<>();
    public List<CategoryItems> piroList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        initAllList();

        textViewListName = findViewById(R.id.textViewListName);

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();

        switch (name){
            case "Природа":
                categoryItemsList = natureList;
                break;
            case "Животные":
                categoryItemsList = animalsList;
                break;
            case "Транспорт":
                categoryItemsList = transportList;
                break;
            case "Пиротехника":
                categoryItemsList = piroList;
                break;
        }

        textViewListName.setText(name);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        categoryRecycler = findViewById(R.id.recyclerViewList);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryItemsAdapter = new CategoryItemsAdapter(this, categoryItemsList, this);
        categoryRecycler.setAdapter(categoryItemsAdapter);
    }

    private void initAllList() {
        initNatureList();
        initAnimalsList();
        initTransportList();
        initPiroList();
    }


    private void initNatureList(){
        natureList.add(new CategoryItems(1, "ГРОМ/МОЛНИЯ/ГРОЗА", "Погода испортилась. Появились тучи. Пошёл сильный дождь. Гремел гром. Сверкала молния. \n" +
                "Марина очень испугалась.\n", "Не пугайся грома, молнии, грозы. Они громкие, но бояться их не надо. Будь осторожен, не подходи близко. Бери зонт.", "/"));
    }

    private void initAnimalsList(){
        animalsList.add(new CategoryItems(1, "СОБАКА", "Саша идёт по улице, видит собаку. Собака начинает лаять. Саша не знает, что делать. Он боится.", "Если увидел собаку со взрослым или одну, не подходи, не трогай руками. \n" +
                "Лучше держишь дальше, обходи с другой стороны дороги.\n", "/"));
        animalsList.add(new CategoryItems(2, "Что-то второе", "", "", "/"));
    }

    private void initTransportList(){
        transportList.add(new CategoryItems(1, "МАШИНА/ТРАМВАЙ/ТРОЛЛЕЙБУС/АВТОБУС", "Люда идёт по улице. Люда не видит машины, которая едет (трамвая, троллейбуса, автобуса), которая(ый) подаёт сигнал тормоза\n" +
                "Люда очень испугалась.\n", "Всегда смотри на левую и правую сторону дороги. Если стоит светофор, дождись зелёного света.", "/"));
        transportList.add(new CategoryItems(2, "САМОЛЁТ", "Дима гулял на улице вместе с папой. Дима посмотрел на небо. Увидел объект в небе. Он был большим и железным. Дима испугался. Папа объяснил, что это был самолёт.", "Не нужно пугаться самолетов. Они большие, но они очень нужно людям. Самолёты помогают взрослым и детям посещать разные страны и города.", "/"));
        transportList.add(new CategoryItems(3, "МЕТРО/ВАГОН/ПОЕЗД", "Аня с сестрой спустились в метро. Собиралось много людей. Аню пугает темнота из окон. Она начинает сильно волноваться.", "Метро-это вид транспорта, который довозит людей до нужных мест. Темнота из-за туннеля, по которому едет вагон. Боятся не нужно, метро приносит пользу людям.", "/"));

    }

    private void initPiroList(){
        piroList.add(new CategoryItems(1, "ПИРОТЕХНИКА", "Наташа с мамой вышли на улицу. Было темно. На небе появились искры. Искры были разных цветов. Наташа очень испугалась.", "Это салют. Салюта бояться не надо, он для радости. Люди запускают салюты в небо для красоты.", "/"));
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("NAME", categoryItemsList.get(position).getName());
        intent.putExtra("UPPER", categoryItemsList.get(position).getUpper());
        intent.putExtra("DOWNER", categoryItemsList.get(position).getDowner());

        startActivity(intent);
    }
}