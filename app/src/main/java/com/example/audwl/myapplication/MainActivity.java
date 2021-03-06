package com.example.audwl.myapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.example.audwl.myapplication.databinding.*;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @BindView(R.id.button1)
    ImageButton button1;

    static int gValue;

    public static int getGlobalValue() {
        return gValue;
    }

    public static void setGlobalValue(int mValue) {
        gValue = mValue;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivity.setGlobalValue(0);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button1)
    void gotoNextPage(View view) {
        //Toast Example
        //Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();

        //Intent Example with Animation
        //We must res/anim/anim... file creation.
        Intent intent = new Intent(this, subActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);

    }

}
