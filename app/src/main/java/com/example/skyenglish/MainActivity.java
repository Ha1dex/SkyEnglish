package com.example.skyenglish;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Created";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");

    }
    @Override
    protected void onStart()
    {
        super .onStart();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Start activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }
}