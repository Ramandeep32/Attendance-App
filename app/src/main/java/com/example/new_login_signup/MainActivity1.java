package com.example.new_login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {
    public Button btnfqr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btnfqr = (Button) findViewById(R.id.btnqr);
        btnfqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity1.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}