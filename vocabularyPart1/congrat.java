package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class congrat extends AppCompatActivity implements View.OnClickListener {
    protected ImageView return_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrat);
        addButton();
    }

    public void addButton() {
        return_home = findViewById(R.id.return_home);
        return_home.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.return_home) {
            Intent intent_return = new Intent(congrat.this, Select_mode.class);
            startActivity(intent_return);
            finish();
        }
    }
}
