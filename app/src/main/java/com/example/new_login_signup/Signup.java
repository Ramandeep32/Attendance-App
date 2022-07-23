package com.example.new_login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {
    TextInputLayout regRoll,regEmail,regpass,regcpass;
    Button signupdata;
    FirebaseDatabase rootnode;
    DatabaseReference reference;
    android.widget.RadioGroup RadioGroup;
    android.widget.RadioButton RadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        RadioGroup=findViewById(R.id.RadioGroup);
        regEmail=findViewById(R.id.reg_Email);
        regRoll=findViewById(R.id.reg_Roll);
        regpass=findViewById(R.id.reg_pass);
        regcpass=findViewById(R.id.reg_cpass);
        signupdata=findViewById(R.id.sigup_data);
        signupdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootnode=FirebaseDatabase.getInstance();
                reference=rootnode.getReference("qrdata");
                String roll=regRoll.getEditText().getText().toString();
                String email=regEmail.getEditText().getText().toString();
                String pass=regpass.getEditText().getText().toString();
                String cpass=regcpass.getEditText().getText().toString();
                UserHelperClass helperClass=new UserHelperClass(roll,email,pass,cpass);
                reference.child(roll).setValue(helperClass);
            }
        });
    }

    public void checkButton(View v){
        int radioId=RadioGroup.getCheckedRadioButtonId();
        RadioButton=findViewById(radioId);
    }
}