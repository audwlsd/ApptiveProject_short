package com.example.audwl.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.audwl.myapplication.databinding.*;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.audwl.myapplication.MainActivity.getGlobalValue;
import static com.example.audwl.myapplication.MainActivity.setGlobalValue;

public class subActivity extends AppCompatActivity {
    ActivitySubBinding binding;

    @BindView(R.id.button_next)
    Button button_next;

    @BindView(R.id.button_love)
    Button button_love;

    @BindView(R.id.button_friend)
    ImageButton button_friend;

    @BindView(R.id.button_game)
    Button button_game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub);
        ButterKnife.bind(this);
    }

    // love -> global value is 100
    @OnClick(R.id.button_love)
    void selectLoveButton(View view) {
        //global variable test
        setGlobalValue(100);

        //Toast Example
        //Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();

        //Intent Example with Animation
        //We must res/anim/anim... file creation.
        Intent intent = new Intent(this, sub2Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }

    // friend -> global value is 200
    @OnClick(R.id.button_friend)
    void selectFriendButton(View view) {
        //global variable test
        setGlobalValue(200);

        //Toast Example
        //Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();

        //Intent Example with Animation
        //We must res/anim/anim... file creation.
        Intent intent = new Intent(this, sub2Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }

    // game -> global value is 300
    @OnClick(R.id.button_game)
    void selectGameButton(View view) {
        //global variable test
        setGlobalValue(300);

        //Toast Example
        //Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();

        //Intent Example with Animation
        //We must res/anim/anim... file creation.
        Intent intent = new Intent(this, sub2Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }
}
