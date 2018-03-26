package com.example.rookie.uicustomviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.jar.Attributes;

/**
 * Created by rookie on 2018/3/2.
 */

public class TitleLayout extends LinearLayout {

    private Button backBut;
    private Button editBut;
    public  TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        initView();
    }

    public  void  initView() {
        backBut = (Button) findViewById(R.id.titile_back);
        editBut = (Button) findViewById(R.id.title_edit);


        backBut.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"返回按钮",Toast.LENGTH_SHORT).show();
            }
        });

        editBut.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"编辑按钮",Toast.LENGTH_SHORT).show();

            }
        });

    }
}

