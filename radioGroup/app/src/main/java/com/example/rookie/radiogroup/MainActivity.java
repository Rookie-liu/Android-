package com.example.rookie.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        final LinearLayout test = (LinearLayout) findViewById(R.id.test);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    test.setOrientation(LinearLayout.HORIZONTAL);
                }else {
                    test.setOrientation(LinearLayout.VERTICAL);
                }
            }
        });
    }
}
