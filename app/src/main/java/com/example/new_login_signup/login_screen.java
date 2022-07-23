package com.example.new_login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class login_screen extends AppCompatActivity {
    TextInputLayout email,pass;
    RadioGroup RadioGroup;
    RadioButton RadioButton;

    Button logintohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        RadioGroup=findViewById(R.id.RadioGroup);
         logintohome= (Button) findViewById(R.id.logintohome);
         email=findViewById(R.id.login_email);
        pass=findViewById(R.id.login_pass);

        logintohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId=RadioGroup.getCheckedRadioButtonId();
                System.out.println(radioId);
                if(radioId==2131296623){
                    Intent intent = new Intent(login_screen.this,HomePageStudent.class);
                    startActivity(intent);
                }
                else{
                    System.out.println("Proff");
                    Intent intent = new Intent(login_screen.this,HomePageProff.class);
                    startActivity(intent);
            }}

        });




    }
    public void checkButton(View v){
        int radioId=RadioGroup.getCheckedRadioButtonId();
        RadioButton=findViewById(radioId);

            }

}