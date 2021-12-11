package com.example.carbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class car5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car5)

        var actionbar = supportActionBar
        actionbar!!.title = "Porsche 911"

        val book_btn: Button =findViewById(R.id.btnbook5)
        book_btn.setOnClickListener {
            val intent= Intent(this,book_registration::class.java)
            startActivity(intent)
        }
    }
}