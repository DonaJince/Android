package com.example.program9;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e1,e2;
    RadioButton r1,r2,r3,r4;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
        r3=(RadioButton) findViewById(R.id.r3);
        r4=(RadioButton) findViewById(R.id.r4);
        t=(TextView) findViewById(R.id.t1);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
    if(view.getId()==R.id.r1)
        t.setText(String.valueOf(a+b));
    else if (view.getId()==R.id.r2)
        t.setText(String.valueOf(a-b));
    else if (view.getId()==R.id.r3)
        t.setText(String.valueOf(a*b));
    else if (view.getId()==R.id.r4)
        t.setText(String.valueOf(a/b));
    }

}
