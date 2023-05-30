package ru.rsue.dop_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class vopros3 extends AppCompatActivity {

    public TextView mQuestionTextView;
    RadioButton vopros9,vopros10,vopros11,vopros12;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent3 = new Intent(this, vopros4.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros3);
        vopros9 = findViewById(R.id.vopros9);
        vopros10 = findViewById(R.id.vopros10);
        vopros11= findViewById(R.id.vopros11);
        vopros12 = findViewById(R.id.vopros12);

        vopros9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros9.setBackgroundColor(Color.GREEN);
                vopros9.setTextColor(Color.GREEN);
                Toast vopros5 = Toast.makeText(getApplicationContext(), "Правильно!", Toast.LENGTH_LONG);

                vopros.Points+=1;
                // mQuestionTextView.setText(vopros.Points);
                startActivity(intent3);
            }
        });

        vopros10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros10.setBackgroundColor(Color.RED);
                vopros10.setTextColor(Color.RED);
                Toast vopros6 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros6.show();
                startActivity(intent3);
            }
        });

        vopros11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                vopros11.setBackgroundColor(Color.RED);
                vopros11.setTextColor(Color.RED);
                Toast vopros3 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros3.show();
                startActivity(intent3);
            }
        });

        vopros12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros12.setBackgroundColor(Color.RED);
                vopros12.setTextColor(Color.RED);
                Toast vopros4= Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros4.show();
                startActivity(intent3);
            }
        });


    }

}
