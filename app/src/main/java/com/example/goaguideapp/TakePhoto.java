package com.example.goaguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TakePhoto extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_photo);
        Button tphotobtn=(Button) findViewById(R.id.takephotobtn);
        tphotobtn.setOnClickListener(takephotoListener);
    }
    private View.OnClickListener takephotoListener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TakePhotoIntent();

        }
    };

    private void TakePhotoIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
        //Intent intent1 = new Intent(TakePhoto.this, info.class);
        //startActivity(intent1);
    }
}
