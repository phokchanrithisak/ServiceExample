package com.example.admin.serviceexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
 Button starting,stopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startMethod(View v)
    {
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }
    public void stopMethod(View v)
    {
        Intent i = new Intent(this, MyService.class);
        stopService(i);
    }
}
