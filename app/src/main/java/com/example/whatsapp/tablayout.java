package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
public class tablayout extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager2 viewPager;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);

        tablayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);

        TabLayout.Tab first=tablayout.newTab();
        first.setText("Chats");
        tablayout.addTab(first);

        TabLayout.Tab second=tablayout.newTab();
        second.setText("Status");
        tablayout.addTab(second);

        TabLayout.Tab third=tablayout.newTab();
        third.setText("Contacts");
        tablayout.addTab(third);

        FragmentManager fm=getSupportFragmentManager();
         myAdapter =new MyAdapter(fm,getLifecycle());
        viewPager.setAdapter(myAdapter);

        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tablayout.selectTab(tablayout.getTabAt(position));
            }
        });
    }
}