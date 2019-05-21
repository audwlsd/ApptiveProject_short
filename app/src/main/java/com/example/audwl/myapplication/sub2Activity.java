package com.example.audwl.myapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.audwl.myapplication.MainActivity.getGlobalValue;
import static com.example.audwl.myapplication.MainActivity.setGlobalValue;

import com.example.audwl.myapplication.databinding.*;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class sub2Activity extends AppCompatActivity {
    ActivitySub2Binding binding;
    @BindView(R.id.text2)
    TextView textView;

    @BindView(R.id.answer1)
    Button answer1;

    @BindView(R.id.answer2)
    Button answer2;

    @BindView(R.id.answer3)
    Button answer3;

    @BindView(R.id.answer4)
    Button answer4;
    private String[] question = {"운동문제1", "우정문제1", "게임문제1"};
    private String[] exercise_answer = {"운동1번", "운동2번", "운동3번", "운동4번"};
    private String[] friend_answer = {"우정1번", "우정2번", "우정3번", "우정4번"};
    private String[] game_answer = {"게임1번", "게임2번", "게임3번", "게임4번"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub2);
        ButterKnife.bind(this);

        switch (getGlobalValue()) {
            case (100):
                binding.text2.setText(question[getGlobalValue()/100 - 1]);
                binding.answer1.setText(exercise_answer[0]);
                binding.answer2.setText(exercise_answer[1]);
                binding.answer3.setText(exercise_answer[2]);
                binding.answer4.setText(exercise_answer[3]);
                break;
            case (200):
                binding.text2.setText(question[getGlobalValue() / 100 - 1]);
                binding.answer1.setText(friend_answer[0]);
                binding.answer2.setText(friend_answer[1]);
                binding.answer3.setText(friend_answer[2]);
                binding.answer4.setText(friend_answer[3]);
                break;
            case (300):
                binding.text2.setText(question[getGlobalValue() / 100 - 1]);
                binding.answer1.setText(game_answer[0]);
                binding.answer2.setText(game_answer[1]);
                binding.answer3.setText(game_answer[2]);
                binding.answer4.setText(game_answer[3]);
                break;
             default:
                 break;
        }
    }

    @OnClick(R.id.answer1)
    void selectAnswer1Button(View view) {
        setGlobalValue(getGlobalValue()+10);
        Intent intent = new Intent(this, sub3Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }

    @OnClick(R.id.answer2)
    void selectAnswer2Button(View view) {
        setGlobalValue(getGlobalValue()+20);

        Intent intent = new Intent(this, sub3Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }

    @OnClick(R.id.answer3)
    void selectAnswer3Button(View view) {
        setGlobalValue(getGlobalValue()+30);

        Intent intent = new Intent(this, sub3Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }

    @OnClick(R.id.answer4)
    void selectAnswer4Button(View view) {
        setGlobalValue(getGlobalValue()+40);

        Intent intent = new Intent(this, sub3Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_in_left);
    }
}
