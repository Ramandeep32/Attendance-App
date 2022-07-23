package com.example.new_login_signup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Qrscanner extends AppCompatActivity {
    Button btScan;

    DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_scanner);
        dbref= FirebaseDatabase.getInstance().getReference("B20CS051");
        btScan = findViewById(R.id.bt_scan);

        btScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator intentIntegrator = new IntentIntegrator(
                        Qrscanner.this
                );
                intentIntegrator.setPrompt("For flash use volume up key");
                intentIntegrator.setBeepEnabled(true);
                intentIntegrator.setOrientationLocked(true);
                intentIntegrator.setCaptureActivity(com.example.new_login_signup.Capture.class);
                intentIntegrator.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult intentResult = IntentIntegrator.parseActivityResult(
                requestCode,resultCode,data
        );
        if (intentResult.getContents() != null){
            AlertDialog.Builder builder = new AlertDialog.Builder(
                    Qrscanner.this
            );
            builder.setTitle("Result");
            builder.setMessage("Attendence marked succesfully");
            Toast.makeText(getApplicationContext()
                    ,"Attendence marked succesfully",Toast.LENGTH_SHORT)
                    .show();
            //builder.setMessage(intentResult.getContents());
            dbref.child("attendance").setValue("Present");
//                    .addOnCompleteListener(new OnCompleteListener<Void>(){
//                        @Override
//                        public void onComplete(@NonNull Task<Void> task){
//                            MainActivity.qrtext.setText("Attendence marked succesfully");
//                        }
//                    });


            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            builder.show();
        }else {
            Toast.makeText(getApplicationContext()
                    ,"You didn't scan anything",Toast.LENGTH_SHORT)
                    .show();
        }
    }
}