package com.example.project_df;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    TextView tv_hello, tv_answer_good, tv_answer_so_so;
    Button btn1, btn_good, btn_so_so;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hello = findViewById(R.id.tv_hello);
        tv_answer_good = findViewById(R.id.tv_answer_good);
        tv_answer_so_so = findViewById(R.id.tv_answer_so_so);
        btn1 = findViewById(R.id.btn1);
        btn_good =findViewById(R.id.btn_good);
        btn_so_so = findViewById(R.id.btn_so_so);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_hello.setVisibility(View.VISIBLE);
                btn_good.setVisibility(View.VISIBLE);
                btn_so_so.setVisibility(View.VISIBLE);
            }
        });
        btn_good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_answer_good.setVisibility(View.VISIBLE);

                btn_good.setVisibility(View.INVISIBLE);
                btn_so_so.setVisibility(View.INVISIBLE);
                btn1.setVisibility(View.INVISIBLE);
                tv_hello.setVisibility(View.INVISIBLE);
            }
        });
        btn_so_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_answer_so_so.setVisibility(View.VISIBLE);
                btn_good.setVisibility(View.INVISIBLE);
                btn_so_so.setVisibility(View.INVISIBLE);
                btn1.setVisibility(View.INVISIBLE);
                tv_hello.setVisibility(View.INVISIBLE);
            }
        });
    }
    int x = 340;
    Integer k = 88;
    double ggg = 5.0;
    float hh = 3.3F;
    boolean n = (3+5== 8);
    // true
    String name = "Алиса";
    String  number = "двадцать шесть";
    String  numberS = "26";
    private void jumping(double ggg ){
        double b = 6.7;

        int c = a * 2;
    }
}






