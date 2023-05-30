package ru.rsue.dop_app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class razrab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
    }


    public void OnCloseButtonClick(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(razrab.this);
        builder.setTitle("Выход из приложения")
                .setIcon(R.drawable.krestik)
                .setMessage("Вы уверены что хотите закрыть приложение?")
                .setPositiveButton("Ок",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                finishAffinity();
                            }
                        })
                .setNegativeButton("Отмена",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}
