package com.example.rookie.planegame;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    private  int spped = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final  PlaneView planeView = new PlaneView(this);
        setContentView(planeView);
        planeView.setBackgroundResource(R.drawable.ic_launcher_foreground);

        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();

        int sureenWidth = display.getWidth();
        int sureenHeight = display.getHeight();
        planeView.currentX = sureenWidth / 2;
        planeView.currentY = sureenHeight - 40;

        planeView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                switch (event.getKeyCode()) {

                    case KeyEvent.KEYCODE_DPAD_DOWN:
                        planeView.currentY += spped;
                        break;
                    case KeyEvent.KEYCODE_DPAD_UP:
                        planeView.currentY -= spped;
                        break;
                    case KeyEvent.KEYCODE_DPAD_LEFT:
                        planeView.currentX -= spped;
                        break;
                    case KeyEvent.KEYCODE_DPAD_RIGHT:
                        planeView.currentX += spped;
                        break;
                }
                planeView.invalidate();;
                return true;
            }
        });

    }
}
