package com.example.infomanor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.infomanor.ui.customerservices.CustomerServicesFragment;

public class CustomerServices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_services_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CustomerServicesFragment.newInstance())
                    .commitNow();
        }
    }
}
