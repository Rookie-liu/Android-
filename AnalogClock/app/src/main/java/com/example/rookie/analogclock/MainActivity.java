package com.example.rookie.analogclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] books = new  String[] {
            "ios开发",
            "Android 开发",
            "Java 开发",
            "Web 开发"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                books);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto);
        autoCompleteTextView.setAdapter(aa);
    }
}
