package com.example.audwl.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.audwl.myapplication.databinding.*;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.audwl.myapplication.MainActivity.getGlobalValue;
import static com.example.audwl.myapplication.NickName.array_111;

public class sub4Activity extends AppCompatActivity {
    ActivitySub4Binding binding;

    @BindView(R.id.text4)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub4);
        ButterKnife.bind(this);
        Random generator = new Random();


        int random_number =generator.nextInt(2);
        switch (getGlobalValue()){
            case 111:
                binding.text4.setText(array_111[random_number]);
                break;
            case 112:
            case 113:
            case 114:
            case 121:
            case 122:
            case 123:
            case 124:
            case 131:
            case 132:
            case 133:
            case 134:
            case 141:
            case 142:
            case 143:
            case 144:

            case 211:
            case 212:
            case 213:
            case 214:
            case 221:
            case 222:
            case 223:
            case 224:
            case 231:
            case 232:
            case 233:
            case 234:
            case 241:
            case 242:
            case 243:
            case 244:

            case 311:
            case 312:
            case 313:
            case 314:
            case 321:
            case 322:
            case 323:
            case 324:
            case 331:
            case 332:
            case 333:
            case 334:
            case 341:
            case 342:
            case 343:
            case 344:
        }
    }
}
