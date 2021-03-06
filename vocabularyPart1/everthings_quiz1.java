package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class everthings_quiz1 extends MainActivity implements View.OnClickListener {
    protected Button B1, B2, B3, B4;
    protected ImageView home_btn_image, speaker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_everthings_quiz1);
        addButton();
    }

    public void onClick(View v) {
        if (v.getId() == R.id.B1) {
            Intent intent_false = new Intent(everthings_quiz1.this, popup_false_every_allpage.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.B2) {
            Intent intent_true = new Intent(everthings_quiz1.this, popup_true_every_page1.class);
            startActivity(intent_true);
        }
        else if (v.getId() == R.id.B3) {
            Intent intent_false = new Intent(everthings_quiz1.this, popup_false_every_allpage.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.B4) {
            Intent intent_false = new Intent(everthings_quiz1.this, popup_false_every_allpage.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.home_btn_every_page1) {
            Intent intent_home = new Intent(everthings_quiz1.this, MainActivity.class);
            startActivity(intent_home);
            finish();
        }
        else if (v.getId() == R.id.speker_every_page1) {
            final MediaPlayer basket_sound = MediaPlayer.create(this, R.raw.basket_sound);
            basket_sound.start();
        }
    }

    public void addButton() {
        B1 = findViewById(R.id.B1);
        B1.setOnClickListener(this);
        B2 = findViewById(R.id.B2);
        B2.setOnClickListener(this);
        B3 = findViewById(R.id.B3);
        B3.setOnClickListener(this);
        B4 = findViewById(R.id.B4);
        B4.setOnClickListener(this);

        speaker = findViewById(R.id.speker_every_page1);
        speaker.setOnClickListener(this);
        home_btn_image = findViewById(R.id.home_btn_every_page1);
        home_btn_image.setOnClickListener(this);
    }
}
