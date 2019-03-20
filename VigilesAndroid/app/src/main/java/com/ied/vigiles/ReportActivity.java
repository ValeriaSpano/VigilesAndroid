package com.ied.vigiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.ied.vigiles.MapsActivity;


public class ReportActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    Intent g = new Intent(ReportActivity.this, MapsActivity.class);
                    startActivity(g);
                    return true;
                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search);
                    Intent h = new Intent(ReportActivity.this, SearchActivity.class);
                    startActivity(h);
                    return true;
                case R.id.navigation_reports:
                    mTextMessage.setText(R.string.title_reports);
                    return true;
                case R.id.navigation_historical:
                    mTextMessage.setText(R.string.title_historical);
                    Intent j = new Intent(ReportActivity.this, HistoryActivity.class);
                    startActivity(j);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
                    Intent k = new Intent(ReportActivity.this, ProfileActivity.class);
                    startActivity(k);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}