package com.example.rookie.listviewtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //定义一个字符串数组
    private String[] data = {"Apple", "Banana", "Orange", "Watermaelon", "Pear", "Grape","Pineapple", "Strawberry", "Cherry", "Mango","Apple", "Banana", "Orange", "Watermaelon", "Pear", "Grape","Pineapple", "Strawberry", "Cherry", "Mango", "Banana", "Orange", "Watermaelon", "Pear", "Banana", "Orange", "Watermaelon", "Pear", "Banana", "Orange", "Watermaelon", "Pear" };
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化数据
        iniFruits();
        // 创建一个adapter
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        // 添加item点击事件方法
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 通过position参数 判断出用户点击的是哪一个自相
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void iniFruits() {
        for (int i = 0 ; i < data.length; i++) {
            Fruit apple = new Fruit(data[i], R.drawable.avatar);
            fruitList.add(apple);
        }
    }
}
