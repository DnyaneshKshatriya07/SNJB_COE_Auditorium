package com.example.snjbcoeauditorium;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.example.snjbcoeauditorium.*;


public class NavActivity extends AppCompatActivity{

    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle1;

    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav); // Ensure your XML layout filename matches here

        // Setting up the DrawerLayout and NavigationView
        drawerLayout = findViewById(R.id.drawer_layout);
        buttonDrawerToggle1 = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.nav_view);

        buttonDrawerToggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId =item.getItemId();

                if(itemId == R.id.nav_home){
                    Toast.makeText(NavActivity.this,"Home clicked",Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.nav_settings){
                    Toast.makeText(NavActivity.this,"Settings clicked",Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.nav_about){
                    Toast.makeText(NavActivity.this,"About clicked",Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.nav_view){
                    Toast.makeText(NavActivity.this,"View clicked",Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.nav_logout){
                    Intent intent= new Intent(NavActivity.this, MainActivity.class);
                    Toast.makeText(NavActivity.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }

                if(itemId == R.id.nav_share){
                    Toast.makeText(NavActivity.this,"Share clicked",Toast.LENGTH_SHORT).show();
                }

                drawerLayout.close();
                return false;
            }
        });
    }
}
