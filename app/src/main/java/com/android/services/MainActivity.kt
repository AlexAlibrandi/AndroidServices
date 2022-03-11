package com.android.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.JobIntentService
import com.android.services.services.ClassicService
import com.android.services.services.IntentService
import com.android.services.services.IntentService.Companion.myBackgroundService

class MainActivity : AppCompatActivity() {

    lateinit var classic : Button
    lateinit var stop : Button
    lateinit var intent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intent = findViewById(R.id.intent)
        classic = findViewById(R.id.classic)
        stop = findViewById(R.id.stop)

        classic.setOnClickListener {
            val intent = Intent(this@MainActivity,ClassicService::class.java)
            startService(intent)
        }

        intent.setOnClickListener {

            val intent = Intent(this@MainActivity,IntentService::class.java)
            IntentService.myBackgroundService(this@MainActivity,intent)
        }

        stop.setOnClickListener {
            val intent = Intent(this@MainActivity,ClassicService::class.java)
            stopService(intent)
        }
    }
}