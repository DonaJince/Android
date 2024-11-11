package com.example.program12;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int[] image={R.drawable.img,R.drawable.img_1,R.drawable.img_2};
    Spinner sp ;
    ImageView img;
    String[] names;
/*<resources>
    <string name="app_name">program12</string>
    <string-array name="Country">
        <item>France</item>
        <item>Argentina</item>
        <item>Germany</item>
          </string-array>
</resources>*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spinid);
        img=(ImageView)findViewById(R.id.img);
        sp.setOnItemSelectedListener(this);
        names=getResources().getStringArray(R.array.Country);
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,names);
        sp.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {

        img.setImageResource(image[i]);
        TextView mytext=(TextView) view;
        Toast toast = Toast.makeText(this, "you selected:" + mytext.getText(), Toast.LENGTH_LONG);
        toast.show();
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Do you know the flag of"+names[i]+"?");
        builder.setPositiveButton("YES",null);
        builder.setNegativeButton("NO",null);
        AlertDialog a=builder.create();
        a.show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
