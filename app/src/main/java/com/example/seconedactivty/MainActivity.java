package com.example.seconedactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String Name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle =getIntent().getExtras();
        if (bundle!=null){
            Name=bundle.getString("NAME")

        }
        tv=findViewById(R.id.showText);
        tv.setText(Name);
    }
}