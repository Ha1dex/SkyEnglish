package com.example.skyenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle arguments = getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.textView23);
        textView.setText(arguments.getString("login"));
    }

    public void OnClickLogout(View view){
        Intent data = new Intent();
        data.putExtra(MainActivity.message,"Вы вышли из аккаунта");
        finish();
    }
}

