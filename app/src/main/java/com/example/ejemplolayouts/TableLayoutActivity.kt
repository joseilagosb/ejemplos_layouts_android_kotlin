package com.example.ejemplolayouts

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TableLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)

        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener{
            Toast.makeText(applicationContext, "Hola!!!", Toast.LENGTH_LONG)
                .show() // display a toast message
        }
    }
}