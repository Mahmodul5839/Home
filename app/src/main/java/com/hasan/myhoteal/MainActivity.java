package com.hasan.myhoteal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ScrollView home ,trips,noti,me;
    Button button10,button11,button12,button13;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home = findViewById(R.id.home);
        trips = findViewById(R.id.trips);
        noti = findViewById(R.id.noti);
        me = findViewById(R.id.me);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);




        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             home.setVisibility(View.VISIBLE);
             trips.setVisibility(View.INVISIBLE);
             noti.setVisibility(View.INVISIBLE);
             me.setVisibility(View.INVISIBLE);




            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trips.setVisibility(View.VISIBLE);
                home.setVisibility(View.INVISIBLE);
                noti.setVisibility(View.INVISIBLE);
                me.setVisibility(View.INVISIBLE);





            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noti.setVisibility(View.VISIBLE);
                home.setVisibility(View.INVISIBLE);
                trips.setVisibility(View.INVISIBLE);
                me.setVisibility(View.INVISIBLE);




            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                me.setVisibility(View.VISIBLE);
                noti.setVisibility(View.INVISIBLE);
                home.setVisibility(View.INVISIBLE);
                trips.setVisibility(View.INVISIBLE);





            }
        });





























    }
}