package com.example.slovarsluha;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewNameCategory;
    TextView textViewUpperCategory;
    TextView textViewDownerCategory;
    GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("ВНИМАНИЕ!!!!!!!")
                .setMessage("!ДАННАЯ КУРСОВАЯ СДЕЛАНА ПОД ЗАКАЗ ДЛЯ ВЫПОЛНЕНИЯ ДЗ!")
                .setCancelable(false)
                .setNegativeButton("ГОТОВЫЕ КУРСОВЫЕ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity2.this, "КУРСОВУЮ СДЕЛАЛИ ПОД ЗАКАЗ", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();





        textViewNameCategory = findViewById(R.id.textViewNameCategory);
        textViewUpperCategory = findViewById(R.id.textViewUpperCategory);
        textViewDownerCategory = findViewById(R.id.textViewDownerCategory);
        gifImageView = findViewById(R.id.imageView);



        String name = getIntent().getStringExtra("NAME");
        String upper = getIntent().getStringExtra("UPPER");
        String downer = getIntent().getStringExtra("DOWNER");
        String url = getIntent().getStringExtra("URL");


        textViewNameCategory.setText(name);
        textViewUpperCategory.setText(upper);
        textViewDownerCategory.setText(downer);
        setGigSrc(url);


    }

    void setGigSrc(String url){
        switch (url){
            case "0":
                gifImageView.setImageResource(R.drawable.grom);
                break;
            case "1":
                gifImageView.setImageResource(R.drawable.avtobus);
                break;
            case "2":
                gifImageView.setImageResource(R.drawable.dog);
                break;
            case "3":
                gifImageView.setImageResource(R.drawable.fly);
                break;
            case "4":
                gifImageView.setImageResource(R.drawable.metro);
                break;
            case"5":
                gifImageView.setImageResource(R.drawable.piro);
                break;
            default:
                gifImageView.setImageResource(R.drawable.grom);
                break;
        }
    }
}