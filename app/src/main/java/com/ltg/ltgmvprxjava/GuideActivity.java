package com.ltg.ltgmvprxjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ltg.ltgmvprxjava.ui.activity.main.MainActivity;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

    }

    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
