package com.detect.miupimp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler(Looper.getMainLooper()).postDelayed({

            // Logic pindah activity
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish()

        }, 3000)

    }
}