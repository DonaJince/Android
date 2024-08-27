package com.example.login;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


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
               Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
           else
               Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show();
       }
   }


}
