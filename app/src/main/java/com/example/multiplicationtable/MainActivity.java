package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);


        textView1 = findViewById(R.id.textView13);
        textView2 = findViewById(R.id.textView14);
        textView3 = findViewById(R.id.textView15);
        textView4 = findViewById(R.id.textView16);
        textView5 = findViewById(R.id.textView17);
        textView6 = findViewById(R.id.textView18);
        textView7 = findViewById(R.id.textView19);
        textView8 = findViewById(R.id.textView20);
        textView9 = findViewById(R.id.textView21);
        textView10 = findViewById(R.id.textView22);


        editText = findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                long a = Integer.parseInt(s);

                textView1.setText(a+" X 1 = "+a*1);
                textView2.setText(a+" X 2 = "+a*2);
                textView3.setText(a+" X 3 = "+a*3);
                textView4.setText(a+" X 4 = "+a*4);
                textView5.setText(a+" X 5 = "+a*5);
                textView6.setText(a+" X 6 = "+a*6);
                textView7.setText(a+" X 7 = "+a*7);
                textView8.setText(a+" X 8 = "+a*8);
                textView9.setText(a+" X 9 = "+a*9);
                textView10.setText(a+" X 10 = "+a*10);




            }
        });
    }
}