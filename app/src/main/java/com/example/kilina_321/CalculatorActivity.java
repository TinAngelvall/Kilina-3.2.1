 package com.example.kilina_321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class CalculatorActivity extends AppCompatActivity {

     private TextView input;
     private Button btn0;
     private Button btn1;
     private Button btn2;
     private Button btn3;
     private Button btn4;
     private Button btn5;
     private Button btn6;
     private Button btn7;
     private Button btn8;
     private Button btn9;
     private Button btnPoint;
     private Button btnC;
     private Button btnPM;
     private Button btnPlus;
     private Button btnMinus;
     private Button btnPercent;
     private Button btnDivision;
     private Button btnMultiplication;
     private Button btnEqually;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_calculator);

         initView();
     }

     private void initView() {
         input = findViewById(R.id.number);
         btn0 = findViewById(R.id.btn0);
         btn1 = findViewById(R.id.btn1);
         btn2 = findViewById(R.id.btn2);
         btn3 = findViewById(R.id.btn3);
         btn4 = findViewById(R.id.btn4);
         btn5 = findViewById(R.id.btn5);
         btn6 = findViewById(R.id.btn6);
         btn7 = findViewById(R.id.btn7);
         btn8 = findViewById(R.id.btn8);
         btn9 = findViewById(R.id.btn9);
         btnPoint = findViewById(R.id.btnPoint);
         btnC = findViewById(R.id.btnC);
         btnPM = findViewById(R.id.btnPM);
         btnPlus = findViewById(R.id.btnPlus);
         btnMinus = findViewById(R.id.btnMinus);
         btnPercent = findViewById(R.id.btnPercent);
         btnDivision  = findViewById(R.id.btnDivision);
         btnMultiplication  = findViewById(R.id.btnMultiplication);
         btnEqually = findViewById(R.id.btnEqually);

         btn0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("0");
             }
         });
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("1");
             }
         });
         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("2");
             }
         });
         btn3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("3");
             }
         });
         btn4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("4");
             }
         });
         btn5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("5");
             }
         });
         btn6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("6");
             }
         });
         btn7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("7");
             }
         });
         btn8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("8");
             }
         });
         btn9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append("9");
             }
         });
         btnPoint.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.append(".");
             }
         });

         btnC.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 input.setText("");
             }
         });

     }
 }