package ru.rsue.dop_app;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
public class startactivity extends AppCompatActivity{
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactivity);

        handler=new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(startactivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2200);

    }
}
