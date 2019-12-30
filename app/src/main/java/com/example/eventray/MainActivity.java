package com.example.eventray;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.ads.MobileAds;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.main,homefragmnet).commit();

    }
    home homefragmnet=new home();
    profile favoritefragment=new profile();
    search searchfragment=new search();
    notification morefragment=new notification();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navigation_home:
            getSupportFragmentManager().beginTransaction().replace(R.id.main, homefragmnet).commit();
            return true;

        }
        switch (menuItem.getItemId()){
            case R.id.navigation_search:
                getSupportFragmentManager().beginTransaction().replace(R.id.main, searchfragment).commit();
                return true;

        }
        switch (menuItem.getItemId()){
            case R.id.navigation_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.main, favoritefragment).commit();
                return true;

        }
        switch (menuItem.getItemId()){
            case R.id.navigation_notification:
                getSupportFragmentManager().beginTransaction().replace(R.id.main, morefragment).commit();
                return true;

        }

        return false;
    }
}
