package com.example.basicviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.basicviewpager.adapter.MyPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager myViewPager;
    private List<View> viewList;
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager = findViewById(R.id.my_view_pager);
        viewList = new ArrayList<>();
        viewList.add(getLayoutInflater().inflate(R.layout.view_one, null, false));
        viewList.add(getLayoutInflater().inflate(R.layout.view_two, null, false));
        viewList.add(getLayoutInflater().inflate(R.layout.view_three, null, false));
        myPagerAdapter = new MyPagerAdapter(viewList);

        myViewPager.setAdapter(myPagerAdapter);


    }
}
