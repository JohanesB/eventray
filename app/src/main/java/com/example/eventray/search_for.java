package com.example.eventray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class search_for extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_for);

        setupViewpager();

        button= findViewById(R.id.butto);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),search.class);
                startActivity(intent);

            }
        });
    }




    private void setupViewpager(){
        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new one());
        adapter.addFragment(new two());

        ViewPager vp=(ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(adapter);

        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorPrimaryDark));

        tabLayout.getTabAt(0).setText("Events");
        tabLayout.getTabAt(1).setText("Event organizers");

    }


    static class SectionsPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment>mFragmentList=new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        public Fragment getItem(int position){
            return mFragmentList.get(position);
        }
        public int getCount(){
            return mFragmentList.size();
        }
        public void addFragment(Fragment fragment){
            mFragmentList.add(fragment);
        }
    }


}
