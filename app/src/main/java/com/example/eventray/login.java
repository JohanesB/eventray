package com.example.eventray;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class login extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bottomNavigationView = findViewById(R.id.log_bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.log_bottom);

    }
    user userfragment=new user();
    e_organizer e_organizerfragment=new e_organizer();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navigation_users:
                getSupportFragmentManager().beginTransaction().replace(R.id.log_frame, userfragment).commit();
                return true;
        }
        switch (menuItem.getItemId()){
            case R.id.navigation_e_organizer:
                getSupportFragmentManager().beginTransaction().replace(R.id.log_frame, e_organizerfragment).commit();
                return true;
        }
        return false;
    }



}
