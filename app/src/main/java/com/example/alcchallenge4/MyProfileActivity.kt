package com.example.alcchallenge4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MyProfileActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "My Profile"
        }
    }
}