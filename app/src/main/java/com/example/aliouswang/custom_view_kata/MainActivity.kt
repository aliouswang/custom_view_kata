package com.example.aliouswang.custom_view_kata

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var ch1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    fun initView() {
        ch1 = findViewById(R.id.btn_ch1);
        ch1.setOnClickListener {

        }
    }
}
