package com.example.learningone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btntheme, btnProceed;
    int flag = 0; //0 -> day 1-> light
    LinearLayout ll_main;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntheme = findViewById(R.id.darkLight);
        ll_main = findViewById(R.id.ll_main);
        btnProceed = findViewById(R.id.btnProceed);
        Intent iNext;

        iNext = new Intent(MainActivity.this, secondActivity.class);
        btntheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag == 0){
                    ll_main.setBackgroundColor(getResources().getColor(R.color.day));
                    flag = 1;
                }
                else if (flag == 1){
                    ll_main.setBackgroundColor(getResources().getColor(R.color.night));
                    flag = 0;
                }
            }
        });


        iNext.putExtra("title", "Home");
        iNext.putExtra("Student name", "Abhishek");
        iNext.putExtra("Roll No", 10);

        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iNext);
            }
        });
    }

}