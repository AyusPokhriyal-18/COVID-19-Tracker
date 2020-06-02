package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
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
                switch (item.getItemId()){
                    case R.id.Home:
                     Toast.makeText(getApplicationContext(),"Home Fragment",Toast.LENGTH_SHORT).show();
                        Fragment homeFrag= new  HomeFrag();
                        FragmentManager fragmentManager= getSupportFragmentManager();

                        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                      fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        fragmentTransaction.replace(R.id.container.homeFrag);
                        break;
                    case  R.id.India:
                        Toast.makeText(getApplicationContext(),"India Fragment",Toast.LENGTH_SHORT).show();
                        break;
                    case  R.id.AllCountries:
                        Toast.makeText(getApplicationContext(),"AllCountries Fragment",Toast.LENGTH_SHORT).show();
                        break;
                    case  R.id.Symptoms:
                        Toast.makeText(getApplicationContext(),"Symptoms Fragment",Toast.LENGTH_SHORT).show();
                        break;
                }}
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
