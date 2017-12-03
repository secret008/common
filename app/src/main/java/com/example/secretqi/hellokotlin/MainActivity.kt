package com.example.secretqi.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.initView()
    }

    /**
     * Test fun
     */
    private fun initView() {
        val text1 = findViewById<TextView>(R.id.text1)
        text1.setText(R.string.str_hello_kotlin)
    }
}
