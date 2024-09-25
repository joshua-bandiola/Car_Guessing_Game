package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    Switch ifSwitch;
    Button btnBrand, btnCar, btnSearch;
    public String switchON = "no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBrand = findViewById(R.id.btnBrand);
        btnCar = findViewById(R.id.btnCar);
        btnSearch  = findViewById(R.id.btnSearch);
        ifSwitch = findViewById(R.id.switch1);

        //Check if switch is on or off using 'isChecked'
        ifSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    switchON = "yes";
                } else {
                    switchON = "no";
                }
            }
        });

        //Once button is clicked it goes to another activity.
        btnBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), identifyTheBrand.class);
                i.putExtra("switch", switchON); //Pass switch value to the next activity
                startActivity(i);
            }
        });

        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), identifyTheCar.class);
                i.putExtra("switch", switchON);
                startActivity(i);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), searchCarBrand.class);
                i.putExtra("switch", switchON);
                startActivity(i);
            }
        });
    }
}