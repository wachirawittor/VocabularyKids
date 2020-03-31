package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class popup_false_mybody_page5 extends Activity implements View.OnClickListener {
    protected Button close_btn_false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_false_mybody_page5);

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

    public void onClick(View v) {
        if (v.getId() == R.id.close_btn_false_mybody_page5) {
            finish();
        }
    }

    public void addButton() {
        close_btn_false = findViewById(R.id.close_btn_false_mybody_page5);
        close_btn_false.setOnClickListener(this);
    }
}
