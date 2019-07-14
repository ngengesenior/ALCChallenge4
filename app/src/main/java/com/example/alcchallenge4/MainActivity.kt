package com.example.alcchallenge4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAbout.setOnClickListener{
            startActivity(Intent(this@MainActivity,AboutAndelaActivity::class.java))
        }

        buttonProfile.setOnClickListener{
            startActivity(Intent(this@MainActivity,MyProfileActivity::class.java))

        }
    }
}
