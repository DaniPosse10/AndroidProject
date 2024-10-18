package com.example.teamateapplication.login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.teamateapplication.R

class LoginHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_login)


        val textViewRegistrati = findViewById<TextView>(R.id.textViewRegistrati)


        textViewRegistrati.setOnClickListener {

            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.example.com/registered"))
            startActivity(browserIntent)
        }
    }
}

