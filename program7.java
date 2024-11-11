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
                    Toast t1 = Toast.makeText(this," ", Toast.LENGTH_LONG);
                    LayoutInflater Lin = getLayoutInflater();
                    View appear = Lin.inflate(R.layout.customtoast1, (ViewGroup) findViewById(R.id.toastid1));
                    t1.setGravity(Gravity.TOP,0,1200);
                    t1.setView(appear);
                    t1.show();

            }
            else
            {
                Toast t1 = Toast.makeText(this," ", Toast.LENGTH_LONG);
                LayoutInflater Lin = getLayoutInflater();
                View appear = Lin.inflate(R.layout.customtoast2, (ViewGroup) findViewById(R.id.toastid2));
                t1.setGravity(Gravity.TOP,0,1200);
                t1.setView(appear);
                t1.show();

            }
        }
    }


}
