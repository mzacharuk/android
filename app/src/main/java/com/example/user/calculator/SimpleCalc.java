package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* first try
* did not work properly
 */

public class SimpleCalc extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine, dot, plus, minus, multiply, divide, equals, changeSign, allClear, clear;
    TextView textView;
    boolean addition, substract, multiplication, division;
    float firstValue, secondValue, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplecalc);

        final TextView textView = (TextView) findViewById(R.id.textView);
        Button zero = findViewById(R.id.zero);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button dot = findViewById(R.id.dot);
        Button add = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button equals = findViewById(R.id.equals);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);
        Button clear = findViewById(R.id.clear);
        Button clearAll = findViewById(R.id.allClear);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null){
                    textView.setText(firstValue+"");
                }else{
                    firstValue = Float.parseFloat(textView.getText() + "");
                    addition = true;
                    textView.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null){
                    textView.setText("");
                }else{
                    firstValue = Float.parseFloat(textView.getText() + "");
                    substract = true;
                    textView.setText(null);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null){
                    textView.setText("");
                }else{
                    firstValue = Float.parseFloat(textView.getText() + "");
                    division = true;
                    textView.setText(null);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null){
                    textView.setText("");
                }else{
                    firstValue = Float.parseFloat(textView.getText() + "");
                    multiplication = true;
                    textView.setText(null);
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                secondValue = Float.parseFloat(textView.getText()+"");

                if(addition == true){
                    result = firstValue+secondValue;
                    textView.setText(firstValue + secondValue + "");
                    firstValue=result;
                    addition = false;
                }else if(substract == true){
                    result = firstValue-secondValue;
                    textView.setText(firstValue - secondValue + "");
                    firstValue=result;
                    substract = false;
                }else if(multiplication == true){
                    result = firstValue*secondValue;
                    textView.setText(firstValue * secondValue + "");
                    firstValue=result;
                    multiplication = false;
                }else if(division == true){
                    result = firstValue/secondValue;
                    textView.setText(firstValue / secondValue + "");
                    firstValue=result;
                    division = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textView.setText("");
            }
        });

    }
}
