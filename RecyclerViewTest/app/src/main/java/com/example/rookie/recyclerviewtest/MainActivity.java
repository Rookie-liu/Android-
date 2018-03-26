package com.example.rookie.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"Apple", "Banana", "Orange", "Watermaelon", "Pear", "Grape","Pineapple", "Strawberry", "Cherry", "Mango","Apple", "Banana", "Orange", "Watermaelon", "Pear", "Grape","Pineapple", "Strawberry", "Cherry", "Mango", "Banana", "Orange", "Watermaelon", "Pear", "Banana", "Orange", "Watermaelon", "Pear", "Banana", "Orange", "Watermaelon", "Pear" };
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        // 布局方式
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        FruitAdapter adapter = new FruitAdapter(fruitList);
//        recyclerView.setAdapter(adapter);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0 ; i < data.length; i++) {
            Fruit fruit = new Fruit(data[i], R.drawable.avatar);
            fruitList.add(fruit);
        }
    }
}
