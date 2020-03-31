package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.lang.reflect.Array;

public class popup_true extends Activity implements View.OnClickListener {

    protected Button next_btn_true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_true);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.5), (int)(height*0.3));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);

        addButton();
    }

    public void addButton() {
        next_btn_true = findViewById(R.id.next_btn_true);
        next_btn_true.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent_animal_quiz2 = new Intent(popup_true.this, animal_quiz2.class);
        startActivity(intent_animal_quiz2);
        finish();
    }

}
