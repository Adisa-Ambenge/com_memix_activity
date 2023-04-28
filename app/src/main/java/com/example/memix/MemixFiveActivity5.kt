package com.example.memix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemixFiveActivity5 : AppCompatActivity() {
    lateinit var btnPrev4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memix_five5)
        btnPrev4 = findViewById(R.id.btnPrev4)
        btnPrev4.setOnClickListener {
            val intent = Intent(this, MemixFourActivity4::class.java)
            startActivity(intent)
        }
    }
}