package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


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

      ViewInit();
toolbarSetup();
bottomSetup();
    }

    private void bottomSetup() {
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId())
                    case R.id.Home;
            }
        });
    }

    private void toolbarSetup() {
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Menu button Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void ViewInit() {
    t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        toolbar= findViewById(R.id.toolbar);
        bottomNavigationView=findViewById(R.id.bottommenu);
        collapsingToolbarLayout=findViewById(R.id.colLayout);

    }
}
