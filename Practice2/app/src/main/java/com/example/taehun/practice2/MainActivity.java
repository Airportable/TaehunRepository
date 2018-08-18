package com.example.taehun.practice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"버튼눌렸데챠", Toast.LENGTH_SHORT).show();
            }
        });

        //(new ~~(){}); 에서 괄호필요없는듯
        clickListener listener = new clickListener() {
            @Override
            public void print() {
                Toast.makeText(getApplicationContext(),"확인데수웅", Toast.LENGTH_SHORT).show();
            }
        };
        listener.print();
    }
}

interface clickListener{
    void print();
}