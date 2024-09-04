package com.example.program6;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class display extends AppCompatActivity {
    SharedPreferences sp;
    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        sp=getSharedPreferences("mypref",MODE_PRIVATE);
        if(sp.contains("Name"))
            t1.setText(sp.getString("Name",""));
        if(sp.contains("phno"))
            t2.setText(sp.getString("phno",""));
        if(sp.contains("gen"))
            t3.setText(sp.getString("gen",""));
        if(sp.contains("dance"))
            t4.setText(sp.getString("dance",""));
        if(sp.contains("music"))
            t5.setText(sp.getString("music",""));
    }
}
