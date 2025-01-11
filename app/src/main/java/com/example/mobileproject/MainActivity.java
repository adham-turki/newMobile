package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button btnAddCustomer, btnAddCarDetails, btnScheduleMaintenance, btnTrackServices;
    private Button btnExpensesReport, btnFeedback, btnUserSettings, btnHelpSupport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializeButtons();
        setupClickListeners();
    }

    private void initializeButtons() {
        btnAddCustomer = findViewById(R.id.btnAddCustomer);
        btnAddCarDetails = findViewById(R.id.btnAddCarDetails);
        btnScheduleMaintenance = findViewById(R.id.btnScheduleMaintenance);
        btnTrackServices = findViewById(R.id.btnTrackServices);
        btnExpensesReport = findViewById(R.id.btnExpensesReport);
        btnFeedback = findViewById(R.id.btnFeedback);
        btnUserSettings = findViewById(R.id.btnUserSettings);
        btnHelpSupport = findViewById(R.id.btnHelpSupport);
    }

    private void setupClickListeners() {
        btnAddCustomer.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AddCustomerActivity.class)));
        btnAddCarDetails.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AddCarDetailsActivity.class)));
        btnScheduleMaintenance.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ScheduleMaintenanceActivity.class)));
        btnTrackServices.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TrackOngoingServicesActivity.class)));
        btnExpensesReport.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ExpensesReportActivity.class)));
        btnFeedback.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FeedbackActivity.class)));
        btnUserSettings.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, UserSettingsActivity.class)));
        btnHelpSupport.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HelpSupportActivity.class)));
    }
}