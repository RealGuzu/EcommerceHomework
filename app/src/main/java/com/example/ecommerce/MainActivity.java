package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.ecommereceredo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.eREC);

        List<item> items = new ArrayList<>();
        items.add(new item("Clothing from the top designer brands","Apparel",R.drawable.clothing ));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),items));


        List<SliderItems> sliderItems = new ArrayList<>();
        sliderItems.add (new SliderItems(R.drawable.boots));
        sliderItems.add (new SliderItems(R.drawable.coat));
        sliderItems.add (new SliderItems(R.drawable.bro));



        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2));


    }
}