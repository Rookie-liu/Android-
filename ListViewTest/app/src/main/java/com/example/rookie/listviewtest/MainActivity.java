package com.example.rookie.listviewtest;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new MyClickListaner());
    }

    class  MyClickListaner implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText editText = (EditText) findViewById(R.id.text_id);
            editText.setText("按钮被点击了");
        }
    }
}
