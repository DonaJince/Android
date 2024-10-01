package com.example.program11;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView l;
    ImageView v;
    String [] imgs={"Racoon","dog","Koala","Polar Bear","Cat"};
    int [] images={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=  (ListView) findViewById(R.id.list);
        v=(ImageView) findViewById(R.id.img);
        ArrayAdapter <String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,imgs) ;
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        v.setImageResource(images[i]);
    }
}
