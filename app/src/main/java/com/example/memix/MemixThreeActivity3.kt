package com.example.memix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnPrev2: Button
lateinit var btnNext2: Button

class MemixThreeActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memix_three3)
        btnPrev2 = findViewById(R.id.btnPrev2)
        btnPrev2.setOnClickListener {
            val intent = Intent(this, MemixTwoActivity2::class.java)
            startActivity(intent)

            }
        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent = Intent(this, MemixFourActivity4::class.java)
            startActivity(intent)
        }
    }
}