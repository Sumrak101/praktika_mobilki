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

public class vopros5 extends AppCompatActivity {

    public TextView mQuestionTextView;
    RadioButton vopros17,vopros18,vopros19,vopros20;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent4 = new Intent(this, itog.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros5);
        vopros17 = findViewById(R.id.vopros17);
        vopros18 = findViewById(R.id.vopros18);
        vopros19= findViewById(R.id.vopros19);
        vopros20 = findViewById(R.id.vopros20);

        vopros17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros17.setBackgroundColor(Color.GREEN);
                vopros17.setTextColor(Color.GREEN);
                Toast vopros5 = Toast.makeText(getApplicationContext(), "ПРАВИЛЬНО", Toast.LENGTH_LONG);
                vopros.Points+=1;
                startActivity(intent4);
                // mQuestionTextView.setText(vopros.Points);
            }
        });

        vopros18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros18.setBackgroundColor(Color.RED);
                vopros18.setTextColor(Color.RED);
                Toast vopros6 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros6.show();
                startActivity(intent4);
            }
        });

        vopros19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                vopros19.setBackgroundColor(Color.RED);
                vopros19.setTextColor(Color.RED);
                Toast vopros3 = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros3.show();

                startActivity(intent4);
            }
        });

        vopros20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vopros20.setBackgroundColor(Color.RED);
                vopros20.setTextColor(Color.RED);
                Toast vopros4= Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vopros4.show();
                startActivity(intent4);
            }
        });


    }

}
