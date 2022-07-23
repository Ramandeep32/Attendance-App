package com.example.new_login_signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageProff extends AppCompatActivity {
    Button creat, class1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_proff);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        creat = (Button) findViewById(R.id.cc);
        creat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageProff.this,createclass.class);
                startActivity(intent);
            }
        });
        class1= (Button) findViewById(R.id.cls1);
        class1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageProff.this,MainActivity1.class);
                startActivity(intent);
            }
        });
    }
}