package com.example.ejemplolayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayoutButton = findViewById<Button>(R.id.linear_layout_button)
        val constraintLayoutButton = findViewById<Button>(R.id.constraint_layout_button)
        val tableLayoutButton = findViewById<Button>(R.id.table_layout_button)
        val absoluteLayoutButton =findViewById<Button>(R.id.absolute_layout_button)

        linearLayoutButton.setOnClickListener{
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }
        constraintLayoutButton.setOnClickListener{
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }
        tableLayoutButton.setOnClickListener{
            val intent = Intent(this, TableLayoutActivity::class.java)
            startActivity(intent)
        }
        absoluteLayoutButton.setOnClickListener{
            val intent = Intent(this, AbsoluteLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}