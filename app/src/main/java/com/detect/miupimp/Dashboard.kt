package com.detect.miupimp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.detect.miupimp.databinding.ActivityDasboardBinding


class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDasboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDasboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            startActivity(Intent(this@Dashboard, MainActivity::class.java))
        }
        binding.btnCheck.setOnClickListener {
            startActivity(Intent(this@Dashboard, ListPimple::class.java))
        }
        binding.btnAbout.setOnClickListener {
            startActivity(Intent(this@Dashboard, About::class.java))
        }
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes") { dialog, id -> this@Dashboard.finish() }
                .setNegativeButton("No") { dialog, id -> dialog.cancel() }
        val alert = builder.create()
        alert.show()
    }

}
