package com.example.program8;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView m1,m2;
    TextView t;
    LinearLayout l;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(LinearLayout)findViewById(R.id.ll);
        m1=(ImageView) findViewById(R.id.img1);
        m2=(ImageView) findViewById(R.id.img2);
        t=(TextView) findViewById(R.id.t1);
        Typeface myfont= Typeface.createFromAsset(getAssets(),"fonts/font1.ttf");
        t.setTypeface(myfont);
        m1.setOnClickListener(this);
        m2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    if(view.getId()==m1.getId())
    {
        m1.setVisibility(View.GONE);
        l.setVisibility(View.VISIBLE);
    }
    else {
        m1.setVisibility(View.VISIBLE);
        l.setVisibility(View.GONE);
    }
    }
}
