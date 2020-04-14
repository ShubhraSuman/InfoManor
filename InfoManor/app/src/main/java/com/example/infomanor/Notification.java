package com.example.infomanor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.infomanor.ui.notification.NotificationFragment;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NotificationFragment.newInstance())
                    .commitNow();
        }
    }
}
