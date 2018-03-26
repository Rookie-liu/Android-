package com.example.rookie.notificationtest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button senNotice = (Button) findViewById(R.id.send_notice);
        senNotice.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_notice:
                Intent intent1 = new Intent(this, NotificationActivity.class);
                PendingIntent pi = PendingIntent.getActivity(this, 0 , intent1, 0);

                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification notification = new NotificationCompat.Builder(this)
                        .setContentTitle("this is content title")
                        .setContentText("this is content text")
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                        .setContentIntent(pi)
                        .setAutoCancel(true) // 设置点击去掉通知
                        .setSound(Uri.fromFile(new File("/system/media/audio/ringtones/Luna.ogg")))  // 设置语音
                        .setVibrate(new long[] {0, 1000, 1000, 1000}) // 设置振动
                        .setLights(Color.GREEN, 1000, 1000) // 设置闪灯
                        .setDefaults(NotificationCompat.DEFAULT_ALL)  // 设置默认
                        .setPriority(NotificationCompat.PRIORITY_MAX)   // 设置通知级别
                        .build();
                manager.notify(1, notification);
                break;

            default:
                break;
        }
    }
}
