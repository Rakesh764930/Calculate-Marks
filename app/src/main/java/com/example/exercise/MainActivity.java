package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.lang.Integer;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnGoNext;
public Integer sum=0;
    EditText txtM1;
    EditText txtM2;
    EditText txtM3;
    EditText txtM4;
    EditText txtM5;
    TextView  result;
TextView txtRes;


    @Override
    protected void onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoNext=findViewById(R.id.btnGoNext);

        txtM1=findViewById(R.id.txtM1);
        txtM2=findViewById(R.id.txtM2);
        txtM3=findViewById(R.id.txtM3);
        txtM4=findViewById(R.id.txtM4);
        txtM5=findViewById(R.id.txtM5);
        result=findViewById(R.id.result);
        btnGoNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String num1=txtM1.getText().toString();
        final int a=Integer.parseInt(num1);

        String num2=txtM2.getText().toString();
        final int b=Integer.parseInt(num2);

        String num3=txtM3.getText().toString();
        final int c=Integer.parseInt(num3);

        String num4=txtM4.getText().toString();
        final int d=Integer.parseInt(num4);

        String num5=txtM5.getText().toString();
        final int e=Integer.parseInt(num5);
        sum=a+b+c+d+e;


       result.setText(String.valueOf(sum));
        Intent mIntent=new Intent(MainActivity.this,NextActivity.class);
        startActivity(mIntent);
    }
}
