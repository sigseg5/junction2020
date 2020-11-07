package com.example.w3e

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_fb_btn.setOnClickListener {
            val intent = Intent(this, GetUserInfo::class.java)
            startActivity(intent)
        }
    }
}