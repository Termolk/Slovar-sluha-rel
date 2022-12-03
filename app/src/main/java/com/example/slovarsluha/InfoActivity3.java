package com.example.slovarsluha;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class InfoActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);




        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("ВНИМАНИЕ!!!!!!!")
                .setMessage("!ДАННАЯ КУРСОВАЯ СДЕЛАНА ПОД ЗАКАЗ ДЛЯ ВЫПОЛНЕНИЯ ДЗ!")
                .setCancelable(false)
                .setNegativeButton("ГОТОВЫЕ КУРСОВЫЕ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(InfoActivity3.this, "КУРСОВУЮ СДЕЛАЛИ ПОД ЗАКАЗ", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();





    }
}