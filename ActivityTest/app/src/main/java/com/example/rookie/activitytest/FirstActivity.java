package com.example.rookie.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return  true;

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "添加",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.remove_item:
                Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FirstActivity", "onRestart ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity", "Task id is" + getTaskId());
        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //弹出一个Toast
//                Toast.makeText(FirstActivity.this, "点击button", Toast.LENGTH_LONG).show();

                // 当前活动销毁
//                finish();

                // 显示intent  直接启用当前 进入到下一个class
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                String data = "你好呀, 我是字符串";
//                intent.putExtra("extra_data", data);
//                startActivityForResult(intent,1);
//                startActivity(intent);

                // 隐性intent 定义响应的action
                // 在manifest.xml 注册时候定义的 ...
//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
//                intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                startActivity(intent);

                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    Toast.makeText(this,  data.getStringExtra("data_return"), Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }


    }
}
