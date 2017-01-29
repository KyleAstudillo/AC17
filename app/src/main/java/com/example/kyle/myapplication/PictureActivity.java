package com.example.kyle.myapplication;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class PictureActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView;
    private boolean changed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        imageView = (ImageView) findViewById(R.id.image_view);
        imageView.setOnClickListener(this);
        changed = false;
    }

    @Override
    public void onClick(View v){
        changed = ! changed;
        if (changed){
            imageView.setImageResource(R.drawable.incorgnito);
        }else{
            imageView.setImageResource(R.drawable.phone);
        }
    }

}
