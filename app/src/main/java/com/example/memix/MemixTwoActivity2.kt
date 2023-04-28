package com.example.memix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemixTwoActivity2 : AppCompatActivity() {
    lateinit var btnPrev1: Button
    lateinit var btnNext1: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memix_two2)
        btnPrev1 = findViewById(R.id.btnPrev1)
        btnPrev1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        btnNext1 = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent = Intent(this, MemixThreeActivity3::class.java)
            startActivity(intent)
        }
    }
}