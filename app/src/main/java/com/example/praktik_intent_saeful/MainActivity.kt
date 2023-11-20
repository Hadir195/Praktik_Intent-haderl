package com.example.praktik_intent_saeful

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button1 = findViewById<Button>(R.id.btn1)
        button1.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btn2)
        button2.setOnClickListener {
            val intent = Intent(this, NextActivity2::class.java)
            startActivity(intent)
        }
    }
}