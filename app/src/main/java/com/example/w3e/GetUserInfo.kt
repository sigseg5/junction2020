package com.example.w3e

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class GetUserInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_user_info)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
    }
}