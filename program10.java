package com.example.program10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,clr,eq;
    TextView t;
    String input="";
    String operator="";
    double value1=0 , value2=0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView) findViewById(R.id.t);
        b0=(Button) findViewById(R.id.b0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        clr=(Button) findViewById(R.id.clr);
        eq=(Button) findViewById(R.id.eq);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        clr.setOnClickListener(this);
        eq.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        double result;
        int id = view.getId();
        if (id == R.id.b0 || id == R.id.b1 || id == R.id.b2 || id == R.id.b3 ||
                id == R.id.b4 || id == R.id.b5 || id == R.id.b6 || id == R.id.b7 ||
                id == R.id.b8 || id == R.id.b9) {
            input += ((Button) view).getText().toString();
            t.setText(input);
        } else if (id == R.id.add || id == R.id.sub || id == R.id.mul || id == R.id.div) {
            value1 = Double.parseDouble(input);
            operator = ((Button) view).getText().toString();
            input = "";
        } else if (id == R.id.eq) {
            value2 = Double.parseDouble(input);
            result = 0;
            switch (operator) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "*":
                    result = value1 * value2;
                    break;
                case "/":
                    result = value1 / value2;
                    break;
            }
            t.setText(String.valueOf(result));
            input = String.valueOf(result);
        } else if (id == R.id.clr) {
            input = "";
            value1 = 0;
            value2 = 0;
            t.setText("");
        }

    }
}
