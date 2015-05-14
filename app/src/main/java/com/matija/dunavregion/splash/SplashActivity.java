package com.matija.dunavregion.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.matija.dunavregion.R;
import com.matija.dunavregion.base.BaseActivity;
import com.matija.dunavregion.main.MainActivity;

/**
 * Created by Matija on 27.4.2015..
 */
public class SplashActivity extends BaseActivity {

    private final int SPLASH_DURATION = 2000;

    private final Handler mHandler = new Handler();

    private final Runnable mNextActivityRunnable = new Runnable() {
        @Override
        public void run() {
            startNextActivity();
        }
    };

    private void startNextActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mHandler.postDelayed(mNextActivityRunnable, SPLASH_DURATION);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeCallbacks(mNextActivityRunnable);
    }
}
