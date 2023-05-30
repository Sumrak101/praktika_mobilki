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

public class vopros2 extends AppCompatActivity {

    public TextView mQuestionTextView;
    RadioButton vopros5,vopros6,vopros7,vopros8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent2 = new Intent(this, vopros3.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros2);
        vopros5 = findViewById(R.id.vopros5);
        vopros6 = findViewById(R.id.vopros6);
        vopros7= findViewById(R.id.vopros7);
        vopros8 = findViewById(R.id.vopros8);

        vopros5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros5.setBackgroundColor(Color.RED);
                vopros5.setTextColor(Color.RED);
                Toast vopros5 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros5.show();
                startActivity(intent2);
            }
        });

        vopros6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros6.setBackgroundColor(Color.RED);
                vopros6.setTextColor(Color.RED);
                Toast vopros6 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros6.show();
                startActivity(intent2);
            }
        });

        vopros7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                vopros7.setBackgroundColor(Color.GREEN);
                vopros7.setTextColor(Color.GREEN);
                Toast vopros3 = Toast.makeText(getApplicationContext(), "Правильно, молодец!", Toast.LENGTH_LONG);
                vopros3.show();

                vopros.Points+=1;
                // mQuestionTextView.setText(vopros.Points);
                startActivity(intent2);
            }
        });

        vopros8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros8.setBackgroundColor(Color.RED);
                vopros8.setTextColor(Color.RED);
                Toast vopros4= Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros4.show();
                startActivity(intent2);
            }
        });


    }

}
