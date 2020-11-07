package com.example.w3e

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_get_user_info.*

class GetUserInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_user_info)

        next_btn.setOnClickListener {
            val intent = Intent(this, ChoosePerson::class.java)
            startActivity(intent)
        }
    }
}