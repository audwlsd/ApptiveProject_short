package com.example.audwl.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.audwl.myapplication.databinding.ActivitySubBinding;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.audwl.myapplication.MainActivity.getGlobalValue;
import static com.example.audwl.myapplication.MainActivity.setGlobalValue;

public class subActivity extends AppCompatActivity {

    @BindView(R.id.text2)
    TextView textView;

    @BindView(R.id.button2)
    Button button2;

    ActivitySubBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub);
        binding.text2.setText(Integer.toString(getGlobalValue()));
        ButterKnife.bind(this);
    }


    @OnClick(R.id.button2)
    void gotoNextPage2(View view) {
        //global variable test
        setGlobalValue(1);

        //Toast Example
        //Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();

        //Intent Example with Animation
        //We must res/anim/anim... file creation.
        Intent intent = new Intent(this, sub2Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }
}
