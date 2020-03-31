package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class animal_quiz5 extends AppCompatActivity implements View.OnClickListener{
    protected Button B1, B2, B3, B4;
    protected ImageView home_btn_image, speaker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_quiz5);
        addButton();
    }

    public void onClick(View v) {
        if (v.getId() == R.id.B1) {
            Intent intent_false = new Intent(animal_quiz5.this, popup_false_animal_page5.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.B2) {
            Intent intent_false = new Intent(animal_quiz5.this, popup_false_animal_page5.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.B3) {
            Intent intent_true = new Intent(animal_quiz5.this, popup_true_animal_page5.class);
            startActivity(intent_true);
        }
        else if (v.getId() == R.id.B4) {
            Intent intent_false = new Intent(animal_quiz5.this, popup_false_animal_page5.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.home_btn_page5) {
            Intent intent_home = new Intent(animal_quiz5.this, MainActivity.class);
            startActivity(intent_home);
            finish();
        }
        else if (v.getId() == R.id.speker_animal_page5) {
            final MediaPlayer fish_sound = MediaPlayer.create(this, R.raw.fish_sound);
            fish_sound.start();
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

        speaker = findViewById(R.id.speker_animal_page5);
        speaker.setOnClickListener(this);
        home_btn_image = findViewById(R.id.home_btn_page5);
        home_btn_image.setOnClickListener(this);
    }
}
