package com.ied.vigiles;

import android.support.annotation.DrawableRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


        //serve per modificare
        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.drawable.ic_iconapp);
    }
}
