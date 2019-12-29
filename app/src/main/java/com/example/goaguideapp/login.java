package com.example.goaguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView newuser=(TextView)findViewById(R.id.textlogbtn);
        newuser.setOnClickListener(newuserListener);
        Button logBtn=(Button) findViewById(R.id.Lbtn);
        logBtn.setOnClickListener(newuserListener);
    }
    private View.OnClickListener newuserListener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.textlogbtn:
                    Intent intent = new Intent(login.this, TakePhoto.class);
                    startActivity(intent);
                case R.id.Lbtn:
                    Intent intent1 = new Intent(login.this, TakePhoto.class);
                    startActivity(intent1);
            }
        }
    };

}
