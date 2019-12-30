package com.example.eventray;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class mainevent_organizer extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainevent_organizer);
        bottomNavigationView1=findViewById(R.id.bottomNavigationView3);
        bottomNavigationView1.setOnNavigationItemSelectedListener(this);
        bottomNavigationView1.setSelectedItemId(R.id.bottomNavigationView3);

        getSupportFragmentManager().beginTransaction().replace(R.id.Emain, EprofileFragment).commit();
    }
    Eprofile EprofileFragment=new Eprofile();
    Oevent OeventFragment=new Oevent();
    Onotification OnotificationFragment=new Onotification();
    barcode barcodeFragment=new barcode();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navigation_eprofile:
                getSupportFragmentManager().beginTransaction().replace(R.id.Emain, EprofileFragment).commit();
                return true;
        }
        switch (menuItem.getItemId()){
            case R.id.navigation_event:
                getSupportFragmentManager().beginTransaction().replace(R.id.Emain, OeventFragment).commit();
                return true;
        }
        switch (menuItem.getItemId()){
            case R.id.navigation_enotification:
                getSupportFragmentManager().beginTransaction().replace(R.id.Emain, OnotificationFragment).commit();
                return true;
        }
        switch (menuItem.getItemId()){
            case R.id.navigation_barcode:
                getSupportFragmentManager().beginTransaction().replace(R.id.Emain, barcodeFragment).commit();
                return true;
        }
        return false;
    }
}
