package com.example.learningone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent fromAct = getIntent();
        String title = fromAct.getStringExtra("title");
        String studentName = fromAct.getStringExtra("Student name");
        int rollNo = fromAct.getIntExtra("Roll No", 0);

        TextView studName;
        studName = findViewById(R.id.nameInfo);
        studName.setText("Roll No. " + rollNo + ",Name" + studentName);

    }
}