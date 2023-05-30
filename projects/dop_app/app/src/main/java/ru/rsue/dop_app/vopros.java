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

public class vopros extends AppCompatActivity {
     public static int Points;
    RadioButton vopros1,vopros2,vopros3,vopros4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) { Intent intent1 = new Intent(this, vopros2.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros);
        vopros1 = findViewById(R.id.vopros1);
        vopros2 = findViewById(R.id.vopros2);
        vopros3 = findViewById(R.id.vopros3);
        vopros4 = findViewById(R.id.vopros4);

        vopros1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros1.setBackgroundColor(Color.RED);
                vopros1.setTextColor(Color.RED);
                Toast vopros1 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros1.show();
                startActivity(intent1);
            }
        });

        vopros2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros2.setBackgroundColor(Color.RED);
                vopros2.setTextColor(Color.RED);
                Toast vopros2 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros2.show();
                startActivity(intent1);
            }
        });

        vopros3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros3.setBackgroundColor(Color.GREEN);
                vopros3.setTextColor(Color.GREEN);
                Toast vopros3 = Toast.makeText(getApplicationContext(), "Правильно, молодец!", Toast.LENGTH_LONG);
                vopros3.show();
                Points+=1;
                startActivity(intent1);
            }
        });

        vopros4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros4.setBackgroundColor(Color.RED);
                vopros4.setTextColor(Color.RED);
                Toast vopros4= Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros4.show();
                startActivity(intent1);
            }
        });


    }

}
