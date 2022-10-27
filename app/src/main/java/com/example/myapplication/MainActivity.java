package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.SensorManager;
import android.os.Bundle;

/**
 * Class for laboratory work №1 with functions <b>min</b> and <b>max</b>.
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Returns the minimum of three numbers.
     * @param x - number №1
     * @param y - number №2
     * @param z - number №3
     */
    public static int min(int x, int y, int z){
        if(x <= y && x <= z) return x;
        if(y <= x && y <= z) return y;
        return z;
    }

    /**
     * Returns the maximum of three numbers.
     * @param x - number №1
     * @param y - number №2
     * @param z - number №3
     */
    public static int max(int x, int y, int z){
        if(x >= y && x >= z) return x;
        if(y >= x && y >= z) return y;
        return z;
    }
}