package com.zakariaahnaf.collepsingtoolber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.Toast;

import com.zakariaahnaf.collepsingtoolber.utils.MyReceiver;

public class MainActivity extends AppCompatActivity {
    private BroadcastReceiver MyReceiver = null;

    //NetworkChangeListener networkChangeListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //networkChangeListener = new NetworkChangeListener();
        MyReceiver = new MyReceiver();
        broadcastIntent();
    }

    public void broadcastIntent() {
        registerReceiver(MyReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(MyReceiver);
    }

    @Override
    protected void onStart() {
        //broadcastIntent();
        Toast.makeText(MainActivity.this, "calledStart", Toast.LENGTH_SHORT).show();
        //IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        //registerReceiver(networkChangeListener, intentFilter);
        super.onStart();

    }

    @Override
    protected void onStop() {
        //broadcastIntent();
        //Toast.makeText(MainActivity.this, "calledStop", Toast.LENGTH_SHORT).show();
        //unregisterReceiver(networkChangeListener);
        super.onStop();
    }
}