package com.example.aboutmyself

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val backButton3 = findViewById<Button>(R.id.btnBack3)
        backButton3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val textView= findViewById<TextView>(R.id.linkPl)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.setLinkTextColor(Color.BLUE)

    }
}