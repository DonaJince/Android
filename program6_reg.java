package com.example.program6;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registration extends AppCompatActivity implements View.OnClickListener {
    EditText e1 = (EditText) findViewById(R.id.n),e2;
    RadioButton f,m;
    RadioGroup genderGroup;
    CheckBox c1,c2;
    Button b;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        e2=(EditText) findViewById(R.id.p);
        f=(RadioButton) findViewById(R.id.f);
        m=(RadioButton) findViewById(R.id.m);
        genderGroup = findViewById(R.id.genderGroup);
        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        b=(Button)findViewById(R.id.b);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String name=e1.getText().toString();
        String phno=e2.getText().toString();
        int selectedId = genderGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);
        String gender = selectedRadioButton.getText().toString();
        sp=getSharedPreferences("mypref",MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        boolean isDancingChecked = c1.isChecked();
        boolean isMusicChecked = c2.isChecked();
        if (isDancingChecked) {
            ed.putString("dance",c1.getText().toString());
        }
        if(isMusicChecked){
            ed.putString("music",c2.getText().toString());
        }
        ed.putString("Name",name);
        ed.putString("phno",phno);
        ed.putString("gen",gender);
        ed.apply();
        Intent i=new Intent(this,display.class);
        startActivity(i);

    }
}
