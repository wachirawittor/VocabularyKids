package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class animal_quiz1 extends MainActivity implements View.OnClickListener {
    protected Button B1, B2, B3, B4;
    protected ImageView home_btn_image, speaker;
    //HomeWatcher mHomeWatcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_quiz1);
        addButton();


//        doBindService();
//        Intent music = new Intent();
//        music.setClass(this, MusicService.class);
//        startService(music);
//
//        mHomeWatcher = new HomeWatcher(this);
//        mHomeWatcher.setOnHomePressedListener(new HomeWatcher.OnHomePressedListener() {
//            @Override
//            public void onHomePressed() {
//                if (mServ != null) {
//                    mServ.pauseMusic();
//                }
//            }
//            @Override
//            public void onHomeLongPressed() {
//                if (mServ != null) {
//                    mServ.pauseMusic();
//                }
//            }
//        });
//        mHomeWatcher.startWatch();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.home_btn_every_page1) {
            Intent intent_home = new Intent(animal_quiz1.this, MainActivity.class);
            startActivity(intent_home);
            finish();
        }
        else if (v.getId() == R.id.B1) {
            Intent intent_true = new Intent(animal_quiz1.this, popup_true.class);
            startActivity(intent_true);
        }
        else if (v.getId() == R.id.B2) {
            Intent intent_false = new Intent(animal_quiz1.this, popup_false_page1.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.B3) {
            Intent intent_false = new Intent(animal_quiz1.this, popup_false_page1.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.B4) {
            Intent intent_false = new Intent(animal_quiz1.this, popup_false_page1.class);
            startActivity(intent_false);
        }
        else if (v.getId() == R.id.speker_animal_page1) {
            final MediaPlayer lion_sound = MediaPlayer.create(this, R.raw.lion_sound);
            lion_sound.start();
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


        speaker = findViewById(R.id.speker_animal_page1);
        speaker.setOnClickListener(this);
        home_btn_image = findViewById(R.id.home_btn_every_page1);
        home_btn_image.setOnClickListener(this);

    }

//    private boolean mIsBound = false;
//    private MusicService mServ;
//    private ServiceConnection Scon =new ServiceConnection(){
//
//        public void onServiceConnected(ComponentName name, IBinder
//                binder) {
//            mServ = ((MusicService.ServiceBinder)binder).getService();
//        }
//
//        public void onServiceDisconnected(ComponentName name) {
//            mServ = null;
//        }
//    };
//
//    void doBindService(){
//        bindService(new Intent(this,MusicService.class),
//                Scon, Context.BIND_AUTO_CREATE);
//        mIsBound = true;
//    }
//
//    void doUnbindService()
//    {
//        if(mIsBound)
//        {
//            unbindService(Scon);
//            mIsBound = false;
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        if (mServ != null) {
//            mServ.resumeMusic();
//        }
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        PowerManager pm = (PowerManager)
//                getSystemService(Context.POWER_SERVICE);
//        boolean isScreenOn = false;
//        if (pm != null) {
//            isScreenOn = pm.isScreenOn();
//        }
//
//        if (!isScreenOn) {
//            if (mServ != null) {
//                mServ.pauseMusic();
//            }
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//        doUnbindService();
//        Intent music = new Intent();
//        music.setClass(this,MusicService.class);
//        stopService(music);
//
//    }

}
