package com.example.audwl.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.audwl.myapplication.MainActivity.getGlobalValue;
import com.example.audwl.myapplication.databinding.ActivitySub2Binding;

public class sub2Activity extends AppCompatActivity {
    ActivitySub2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub2);
        binding.text3.setText(Integer.toString(getGlobalValue()));
    }
}
