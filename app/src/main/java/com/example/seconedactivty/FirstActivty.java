package com.example.seconedactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class FirstActivty extends AppCompatActivity {

    public FirstActivty(Intent packageContext) {
        this.packageContext = packageContext;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activty);
    }

    private Intent packageContext;
    Intent i=new Intent(packageContext:MainActivity.this,FirstActivty.class)
    i.putExtra(name:"NAME", value:"Techiloft")
    startActivty(i);
    void finsh();
}