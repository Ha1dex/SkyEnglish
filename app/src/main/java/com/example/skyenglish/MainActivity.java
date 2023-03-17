package com.example.skyenglish;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.editLogin);
        myTextView.setText("User_Login");
        ImageView myImageView = findViewById(R.id.imageLog);
        myImageView.setImageResource(R.drawable.unnamed);


    }
    TextView butOut;
    static final String message ="Exit";
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
    @Override
    protected void onResume()
    {
        super .onResume();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Resume activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }
    @Override
    protected void onPause()
    {
        super .onPause();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Pause activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }

    @Override
    protected void onStop()
    {
        super .onStop();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Stop activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }
    @Override
    protected void onRestart()
    {
        super .onRestart();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Restart activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }
    @Override
    protected void onDestroy()
    {
        super .onDestroy();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Destroy activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }

    public void onClick(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        TextView myTextView = (TextView) findViewById(R.id.editText);
        intent.putExtra("login", myTextView.getText());
        Log.d(TAG, "Произошло нажатие на кнопку 'Вперед'");
        startActivity(intent);
    }
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        public void onActivityResult(ActivityResult result) {
            butOut = findViewById(R.id.textView23);
            Intent intent = result.getData();
            if (intent!=null) {
                butOut.setText(intent.getStringExtra(message));
            }
        }
    });
}
