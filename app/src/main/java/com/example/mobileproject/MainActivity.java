package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnAddCustomer, btnAddCarDetails, btnScheduleMaintenance, btnTrackServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddCustomer = findViewById(R.id.btnAddCustomer);
        btnAddCarDetails = findViewById(R.id.btnAddCarDetails);
        btnScheduleMaintenance = findViewById(R.id.btnScheduleMaintenance);
        btnTrackServices = findViewById(R.id.btnTrackServices);

        btnAddCustomer.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddCustomerActivity.class);
            startActivity(intent);
        });

        btnAddCarDetails.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddCarDetailsActivity.class);
            startActivity(intent);
        });

        btnScheduleMaintenance.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ScheduleMaintenanceActivity.class);
            startActivity(intent);
        });

        btnTrackServices.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TrackOngoingServicesActivity.class);
            startActivity(intent);
        });
    }
}