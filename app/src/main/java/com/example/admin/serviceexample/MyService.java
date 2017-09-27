package com.example.admin.serviceexample;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by ADMIN on 9/26/2017.
 */

public class MyService extends Service
{
    MediaPlayer mp;
    @Override
    public void onCreate() {
        mp = MediaPlayer.create(MyService.this,R.raw.christiansong);
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mp.start();
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_SHORT).show();
        mp.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "Service Bound", Toast.LENGTH_SHORT).show();

        return null;
    }
}
