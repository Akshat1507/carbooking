package com.example.carbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class car1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car1)

        var actionbar = supportActionBar
        actionbar!!.title = "Mahindra XUV 700"

        val book_btn:Button=findViewById(R.id.btnbook)
        book_btn.setOnClickListener {
        val intent=Intent(this,book_registration::class.java)
        startActivity(intent)
        }
    }
}