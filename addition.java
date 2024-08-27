package com.example.sumof2nos;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{
   EditText n1,n2,res;
   Button sum;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       n1 = (EditText) findViewById(R.id.num1);
       n2 = (EditText) findViewById(R.id.num2);
       res = (EditText) findViewById(R.id.res);
       sum = (Button)findViewById(R.id.btn);
       sum.setOnClickListener(this);


   }
   @Override
   public void onClick(View view)
   {
       if (view.getId()==R.id.btn)
       {
           int a = Integer.parseInt(n1.getText().toString());
           int b = Integer.parseInt(n2.getText().toString());
           int c =a+b;
           res.setText(String.valueOf(c));
       }
   }


}
