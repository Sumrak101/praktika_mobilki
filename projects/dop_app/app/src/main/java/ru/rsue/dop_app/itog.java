package ru.rsue.dop_app;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;

public class itog extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itog);
        TextView mTextView = findViewById(R.id.textView16);
        String strt = String.valueOf(vopros.Points);

        if (vopros.Points>=4) {
            mTextView.setText("Ваша оценка 5!");
        } else if (vopros.Points>=3) {
            mTextView.setText("Ваша оценка 4!");
        } else if (vopros.Points>=2) {
            mTextView.setText("Ваша оценка 3, стоило подготовиться лучше");
        }else{
            mTextView.setText("Ваша оценка 2, повторите тему и попробуйте снова");
        }

    }
    public void OnCloseButtonClick(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(itog.this);
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

    public void razrab(View view) {
        Intent intent3 = new Intent(this, razrab.class);
        startActivity(intent3);
    }
}
