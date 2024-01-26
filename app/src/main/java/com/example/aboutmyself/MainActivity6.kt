package com.example.aboutmyself

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView


class MainActivity6 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val backButton4 = findViewById<Button>(R.id.btnBack4)
        backButton4.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val textView= findViewById<TextView>(R.id.linkSp)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.setLinkTextColor(Color.BLUE)

        val textView2= findViewById<TextView>(R.id.linkFb)
        textView2.movementMethod = LinkMovementMethod.getInstance()
        textView2.setLinkTextColor(Color.BLUE)

        val textView3= findViewById<TextView>(R.id.linkIg)
        textView3.movementMethod = LinkMovementMethod.getInstance()
        textView3.setLinkTextColor(Color.BLUE)

    }
}