package com.example.carbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var actionbar = supportActionBar
        actionbar!!.title = "Home Page"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var imagebtn:ImageButton=findViewById(R.id.imageButton)
        imagebtn.setOnClickListener {
            val intent = Intent(this, car1::class.java)
            startActivity(intent)
        }

        var imagebtn2:ImageButton=findViewById(R.id.imageButton2)
        imagebtn2.setOnClickListener {
            val intent = Intent(this, car2::class.java)
            startActivity(intent)
        }

        var imagebtn3:ImageButton=findViewById(R.id.imageButton3)
        imagebtn3.setOnClickListener {
            val intent = Intent(this, car3::class.java)
            startActivity(intent)
        }

        var imagebtn4:ImageButton=findViewById(R.id.imageButton4)
        imagebtn4.setOnClickListener {
            val intent = Intent(this, car4::class.java)
            startActivity(intent)
        }

        var imagebtn5:ImageButton=findViewById(R.id.imageButton5)
        imagebtn5.setOnClickListener {
            val intent = Intent(this, car5::class.java)
            startActivity(intent)
        }
    }
}