package com.example.rentsl.moduletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rentsl.c.hello;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(hello.hello);
    }
}
