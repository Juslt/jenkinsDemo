package com.example.daytestdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_hello_world).let {
            it.setOnClickListener {
                startActivity(Intent(this,MainActivity2::class.java))
            }
            it.text = BuildConfig.APP_BUILD_TYPE
        }
    }
}