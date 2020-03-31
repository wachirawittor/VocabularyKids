package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class popup_true_mybody_page10 extends Activity implements View.OnClickListener {
    protected Button next_btn_true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_true_mybody_page10);

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
        next_btn_true = findViewById(R.id.next_btn_true_mybody_page10);
        next_btn_true.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_btn_true_mybody_page10) {
            Intent intent_true = new Intent(popup_true_mybody_page10.this, congrat.class);
            startActivity(intent_true);
            finish();
        }
    }
}
