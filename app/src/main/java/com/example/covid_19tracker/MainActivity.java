package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
TextView t1, t2, t3;
Toolbar toolbar;
BottomNavigationView bottomNavigationView;
CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain2);

      ViewInit()


    }

    private void ViewInit() {
    t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t1);
        t3=findViewById(R.id.t1);
        toolbar= findViewById(R.id.toolbar);
        bottomNavigationView=findViewById(R.id.bottommenu);
        collapsingToolbarLayout=findViewById(R.id.colLayout);

    }
}
