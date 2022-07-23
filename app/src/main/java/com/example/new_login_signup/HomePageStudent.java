package com.example.new_login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;

public class HomePageStudent extends AppCompatActivity {
    Button join,class2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_student);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        join= (Button) findViewById(R.id.jc);
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageStudent.this,joinclass.class);
                startActivity(intent);
            }
        });
        class2= (Button) findViewById(R.id.cls2);
        class2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageStudent.this,Qrscanner.class);
                startActivity(intent);
            }
        });

    }
}