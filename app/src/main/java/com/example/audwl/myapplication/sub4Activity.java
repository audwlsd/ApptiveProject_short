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
import static com.example.audwl.myapplication.NickName.*;

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
                binding.text4.setText(array_112[random_number]);
                break;
            case 113:
                binding.text4.setText(array_113[random_number]);
                break;
            case 114:
                binding.text4.setText(array_114[random_number]);
                break;
            case 121:
                binding.text4.setText(array_121[random_number]);
                break;
            case 122:
                binding.text4.setText(array_122[random_number]);
                break;
            case 123:
                binding.text4.setText(array_123[random_number]);
                break;
            case 124:
                binding.text4.setText(array_124[random_number]);
                break;
            case 131:
                binding.text4.setText(array_131[random_number]);
                break;
            case 132:
                binding.text4.setText(array_132[random_number]);
                break;
            case 133:
                binding.text4.setText(array_133[random_number]);
                break;
            case 134:
                binding.text4.setText(array_134[random_number]);
                break;
            case 141:
                binding.text4.setText(array_141[random_number]);
                break;
            case 142:
                binding.text4.setText(array_142[random_number]);
                break;
            case 143:
                binding.text4.setText(array_143[random_number]);
                break;
            case 144:
                binding.text4.setText(array_144[random_number]);
                break;

            case 211:
                binding.text4.setText(array_211[random_number]);
                break;
            case 212:
                binding.text4.setText(array_212[random_number]);
                break;
            case 213:
                binding.text4.setText(array_213[random_number]);
                break;
            case 214:
                binding.text4.setText(array_214[random_number]);
                break;
            case 221:
                binding.text4.setText(array_221[random_number]);
                break;
            case 222:
                binding.text4.setText(array_222[random_number]);
                break;
            case 223:
                binding.text4.setText(array_223[random_number]);
                break;
            case 224:
                binding.text4.setText(array_224[random_number]);
                break;
            case 231:
                binding.text4.setText(array_231[random_number]);
                break;
            case 232:
                binding.text4.setText(array_232[random_number]);
                break;
            case 233:
                binding.text4.setText(array_233[random_number]);
                break;
            case 234:
                binding.text4.setText(array_234[random_number]);
                break;
            case 241:
                binding.text4.setText(array_241[random_number]);
                break;
            case 242:
                binding.text4.setText(array_242[random_number]);
                break;
            case 243:
                binding.text4.setText(array_243[random_number]);
                break;
            case 244:
                binding.text4.setText(array_244[random_number]);
                break;

            case 311:
                binding.text4.setText(array_311[random_number]);
                break;
            case 312:
                binding.text4.setText(array_312[random_number]);
                break;
            case 313:
                binding.text4.setText(array_313[random_number]);
                break;
            case 314:
                binding.text4.setText(array_314[random_number]);
                break;
            case 321:
                binding.text4.setText(array_321[random_number]);
                break;
            case 322:
                binding.text4.setText(array_322[random_number]);
                break;
            case 323:
                binding.text4.setText(array_323[random_number]);
                break;
            case 324:
                binding.text4.setText(array_324[random_number]);
                break;
            case 331:
                binding.text4.setText(array_331[random_number]);
                break;
            case 332:
                binding.text4.setText(array_332[random_number]);
                break;
            case 333:
                binding.text4.setText(array_333[random_number]);
                break;
            case 334:
                binding.text4.setText(array_334[random_number]);
                break;
            case 341:
                binding.text4.setText(array_341[random_number]);
                break;
            case 342:
                binding.text4.setText(array_342[random_number]);
                break;
            case 343:
                binding.text4.setText(array_343[random_number]);
                break;
            case 344:
                binding.text4.setText(array_344[random_number]);
                break;
        }
    }
}
