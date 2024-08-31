package com.example.program7;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button login;
    EditText username, password;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.usr);
        password = (EditText) findViewById(R.id.pass);
        login = (Button)findViewById(R.id.btn);
        login.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        if (view.getId()==R.id.btn)
        {
            String a = username.getText().toString();
            String b = password.getText().toString();
            if (a.equals("dona")&&b.equals("123"))
            {
                LayoutInflater lf=getLayoutInflater();
                View v=lf.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.toastid1));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(v);
                toast.show();
            }
            else
            {
                LayoutInflater lf=getLayoutInflater();
                View v=lf.inflate(R.layout.customtoast2,(ViewGroup) findViewById(R.id.toastid2));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(v);
                toast.show();
            }
        }
    }


}
