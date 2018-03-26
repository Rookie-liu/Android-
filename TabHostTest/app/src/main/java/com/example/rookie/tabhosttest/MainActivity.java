package com.example.rookie.tabhosttest;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();
        LayoutInflater.from(this).inflate(R.layout.activity_main,tabHost.getTabContentView(),true);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("已接电话").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("呼出电话", getResources().getDrawable(R.drawable.ic_launcher_background)).setContent(R.id.tab2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("未接电话").setContent(R.id.tab3));

    }
}
