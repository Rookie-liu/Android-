package com.example.rookie.activitylifecycletest;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: 不可见变为可见的时候调用");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: 方法在活动准备和用户进行交互是调用");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: 准备去启动或者恢复另一个活动时候调用");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: 在活动在完全不可见的时候调用");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 活动销毁前调用");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: 活动由停止状态变为运行状态前调用");
    }

    // 这个方法可以保证活动呗回收之前一定会被调用
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        String tempData = "SomeThing You just typed";
        outState.putString("Data_key", tempData);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState != null) {
            String tempData = savedInstanceState.getString("Data_key");
            Log.d(TAG, tempData);
        }

        Log.d(TAG, "onCreate: 启动");
        Button startNormalActivity = (Button)findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button)findViewById(R.id.start_dialog_activity);


        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , DialogActivity.class);
                startActivity(intent);
            }
        });




    }
}
