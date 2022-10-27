package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//@RunWith(JUnit4::class)
public class MainActivityTest {

    @Test
    public void minTest() {
        assertEquals(1, com.example.myapplication.MainActivity.min(1,2,3));
        assertEquals(2, com.example.myapplication.MainActivity.min(5,5,2));
        assertEquals(3, com.example.myapplication.MainActivity.min(4,3,3));
        assertEquals(4, com.example.myapplication.MainActivity.min(4,4,4));
    }

    @Test
    public void maxTest() {
        assertEquals(1, com.example.myapplication.MainActivity.max(1,1,1));
        assertEquals(2, com.example.myapplication.MainActivity.max(1,1,2));
        assertEquals(3, com.example.myapplication.MainActivity.max(0,3,1));
        assertEquals(4, com.example.myapplication.MainActivity.max(4,3,2));
    }
}