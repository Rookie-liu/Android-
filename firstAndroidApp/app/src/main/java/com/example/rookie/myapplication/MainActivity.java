package com.example.rookie.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// 继承与appcompatactivity  向下兼容activity 最低兼容到Android 2.1
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 逻辑和试图分离/ 在布局文件中编写界面, 然后在活动中引入捡来
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: exextue");

    }
}


//mipmac 放引用图标的
// drawable  放图片的 ..