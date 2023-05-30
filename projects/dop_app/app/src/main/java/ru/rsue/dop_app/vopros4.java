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

public class vopros4 extends AppCompatActivity {

    RadioButton vopros13,vopros14,vopros15,vopros16;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent4 = new Intent(this, vopros5.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros4);
        vopros13 = findViewById(R.id.vopros13);
        vopros14 = findViewById(R.id.vopros14);
        vopros15= findViewById(R.id.vopros15);
        vopros16 = findViewById(R.id.vopros16);

        vopros13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros13.setBackgroundColor(Color.RED);
                vopros13.setTextColor(Color.RED);
                Toast vopros5 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                startActivity(intent4);
            }
        });

        vopros14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros14.setBackgroundColor(Color.RED);
                vopros14.setTextColor(Color.RED);
                Toast vopros6 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros6.show();
                startActivity(intent4);
            }
        });

        vopros15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                vopros15.setBackgroundColor(Color.GREEN);
                vopros15.setTextColor(Color.GREEN);
                Toast vopros3 = Toast.makeText(getApplicationContext(), "Красава!", Toast.LENGTH_LONG);
                vopros3.show();

                vopros.Points+=1;
                startActivity(intent4);
            }
        });

        vopros16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros16.setBackgroundColor(Color.RED);
                vopros16.setTextColor(Color.RED);
                Toast vopros4= Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros4.show();
                startActivity(intent4);
            }
        });


    }

}
