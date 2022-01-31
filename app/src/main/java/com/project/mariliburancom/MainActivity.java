package com.project.mariliburancom;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Home_Frag homeFragment = new Home_Frag();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, homeFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_tourtrip:
                    Tourtrip_Frag tourtripFragment = new Tourtrip_Frag();
                    FragmentTransaction fragmentTourTripTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTourTripTransaction.replace(R.id.content, tourtripFragment);
                    fragmentTourTripTransaction.commit();
                    return true;
                case R.id.navigation_akomodasi:
                    Akomodasi_Frag akomodasiFragment = new Akomodasi_Frag();
                    FragmentTransaction fragmentAkomodasiTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentAkomodasiTransaction.replace(R.id.content, akomodasiFragment);
                    fragmentAkomodasiTransaction.commit();
                    return true;
                case R.id.navigation_transport:
                    Transport_Frag transportFragment = new Transport_Frag();
                    FragmentTransaction fragmentTransportTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransportTransaction.replace(R.id.content, transportFragment);
                    fragmentTransportTransaction.commit();
                    return true;
                case R.id.navigation_transaksi:
                    Transaksi_Frag transaksiFragment = new Transaksi_Frag();
                    FragmentTransaction fragmentTransaksiTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaksiTransaction.replace(R.id.content, transaksiFragment);
                    fragmentTransaksiTransaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Home_Frag homeFragment = new Home_Frag();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, homeFragment);
        fragmentTransaction.commit();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
