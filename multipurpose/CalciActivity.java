package com.example.multipurpose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalciActivity extends AppCompatActivity {



    EditText et_num_1;
    EditText et_num_2;
    Button bt_add;
    Button bt_sub;
    Button bt_mul;
    Button bt_div;

    TextView tv_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);





        et_num_1 = findViewById(R.id.et_num_1);
        et_num_2 = findViewById(R.id.et_num_2);
        bt_add = findViewById(R.id.bt_add);
        bt_sub = findViewById(R.id.bt_sub);
        bt_mul = findViewById(R.id.bt_mul);
        bt_div = findViewById(R.id.bt_div);
        tv_result = findViewById(R.id.tv_res);

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(et_num_1.getText().toString().trim());
                int num_2 = Integer.parseInt(et_num_2.getText().toString().trim());


                tv_result.setText(""+(num_1+num_2));
            }

        });
        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(et_num_1.getText().toString().trim());
                int num_2 = Integer.parseInt(et_num_2.getText().toString().trim());


                tv_result.setText(""+(num_1-num_2));
            }

        });
        bt_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(et_num_1.getText().toString().trim());
                int num_2 = Integer.parseInt(et_num_2.getText().toString().trim());


                tv_result.setText(""+(num_1*num_2));
            }

        });
        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(et_num_1.getText().toString().trim());
                int num_2 = Integer.parseInt(et_num_2.getText().toString().trim());


                tv_result.setText(""+(num_1/num_2));
            }

        });

    }
}