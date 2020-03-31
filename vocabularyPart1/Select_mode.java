package com.example.vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Select_mode extends MainActivity implements View.OnClickListener{
    protected ImageView animal_mode, mybody_mode, fruit_mode, kitchen_mode;
    //protected Button fruit_mode;
    HomeWatcher mHomeWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);
        addButton();
        getParent();


        doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        startService(music);

        mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new HomeWatcher.OnHomePressedListener() {
            @Override
            public void onHomePressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
            @Override
            public void onHomeLongPressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
        });
        mHomeWatcher.startWatch();
    }

    public void addButton() {
        animal_mode = findViewById(R.id.animal_mode);
        animal_mode.setOnClickListener(this);

        mybody_mode = findViewById(R.id.mybody_mode);
        mybody_mode.setOnClickListener(this);

        kitchen_mode = findViewById(R.id.kitchen_mode);
        kitchen_mode.setOnClickListener(this);

        fruit_mode = findViewById(R.id.fruit_mode);
        fruit_mode.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.animal_mode) {
            Intent intent_animalmode = new Intent(Select_mode.this, animal_quiz1.class);
            startActivity(intent_animalmode);

        }

        else if (v.getId() == R.id.mybody_mode) {
            Intent intent_mybody = new Intent(Select_mode.this, mybody_quiz1.class);
            startActivity(intent_mybody);

        }
        else if (v.getId() == R.id.kitchen_mode) {
            Intent intent_every = new Intent(Select_mode.this, everthings_quiz1.class);
            startActivity(intent_every);

        }
        else if (v.getId() == R.id.fruit_mode) {
            Intent intent_fruit = new Intent(Select_mode.this, fruit_quiz1.class);
            startActivity(intent_fruit);

        }
    }

    private boolean mIsBound = false;
    private MusicService mServ;
    private ServiceConnection Scon =new ServiceConnection(){

        public void onServiceConnected(ComponentName name, IBinder
                binder) {
            mServ = ((MusicService.ServiceBinder)binder).getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            mServ = null;
        }
    };

    void doBindService(){
        bindService(new Intent(this,MusicService.class),
                Scon, Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService()
    {
        if(mIsBound)
        {
            unbindService(Scon);
            mIsBound = false;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mServ != null) {
            mServ.resumeMusic();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        PowerManager pm = (PowerManager)
                getSystemService(Context.POWER_SERVICE);
        boolean isScreenOn = false;
        if (pm != null) {
            isScreenOn = pm.isScreenOn();
        }

        if (!isScreenOn) {
            if (mServ != null) {
                mServ.pauseMusic();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this,MusicService.class);
        stopService(music);

    }
}
