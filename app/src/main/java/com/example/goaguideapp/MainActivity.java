package com.example.goaguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth mfirebaseauth;
    EditText emailId,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView alreadyreg=(TextView)findViewById(R.id.textbtn);
        alreadyreg.setOnClickListener(linkListener);
        Button regBtn=(Button) findViewById(R.id.registerBtn);
        regBtn.setOnClickListener(linkListener);
        mfirebaseauth=FirebaseAuth.getInstance();
        emailId=findViewById(R.id.etEmail);
        password=findViewById(R.id.etPassword);
    }
    private View.OnClickListener linkListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.textbtn:
                    Intent intent = new Intent(MainActivity.this, login.class);
                    startActivity(intent);
                break;
                case R.id.registerBtn:
                    Intent intent1 = new Intent(MainActivity.this, TakePhoto.class);
                    startActivity(intent1);

            }
        }
    };
}
