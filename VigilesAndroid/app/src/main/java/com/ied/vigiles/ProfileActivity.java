package com.ied.vigiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;


public class ProfileActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_historical:
                    mTextMessage.setText(R.string.title_home);
                    Intent g = new Intent(ProfileActivity.this, MapsActivity.class);
                    startActivity(g);
                    return true;
                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search);
                    Intent h = new Intent(ProfileActivity.this, SearchActivity.class);
                    startActivity(h);
                    return true;
                case R.id.navigation_reports:
                    mTextMessage.setText(R.string.title_reports);
                    Intent i = new Intent(ProfileActivity.this, ReportActivity.class);
                    startActivity(i);
                    return true;
                case R.id.navigation_historical:
                    mTextMessage.setText(R.string.title_historical);
                    Intent j = new Intent(ProfileActivity.this, HistoryActivity.class);
                    startActivity(j);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation_historical);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}