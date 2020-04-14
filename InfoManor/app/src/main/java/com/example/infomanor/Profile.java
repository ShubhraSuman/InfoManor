package com.example.infomanor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.infomanor.ui.profile.ProfileFragment;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ProfileFragment.newInstance())
                    .commitNow();
        }
    }
}
