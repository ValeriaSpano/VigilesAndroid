package com.ied.vigiles;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
<<<<<<< HEAD
<<<<<<< HEAD
                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search);
                    return true;
                case R.id.navigation_reports:
                    mTextMessage.setText(R.string.title_reports);
                    return true;
                case R.id.navigation_historical:
                    mTextMessage.setText(R.string.title_historical);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
=======
                case R.id.navigation_reports:
                    mTextMessage.setText(R.string.title_reports);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
>>>>>>> Revert "TapBar"
=======
                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search);
                    return true;
                case R.id.navigation_reports:
                    mTextMessage.setText(R.string.title_reports);
                    return true;
                case R.id.navigation_historical:
                    mTextMessage.setText(R.string.title_historical);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
>>>>>>> Commit 11-03
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //ric
    }

}
