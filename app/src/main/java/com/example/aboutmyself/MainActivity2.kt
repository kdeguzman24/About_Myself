package com.example.aboutmyself

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val backButton = findViewById<Button>(R.id.btnExit)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val nextButton1 = findViewById<Button>(R.id.btnNext1)
        nextButton1.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val nextButton2 = findViewById<Button>(R.id.btnNext2)
        nextButton2.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        val nextButton3 = findViewById<Button>(R.id.btnNext3)
        nextButton3.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        val nextButton4 = findViewById<Button>(R.id.btnNext4)
        nextButton4.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        val nextButton5 = findViewById<Button>(R.id.btnNext5)
        nextButton5.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
    }
}