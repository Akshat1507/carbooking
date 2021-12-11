package com.example.carbooking

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class book_registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_registration)

        var fullname: EditText = findViewById(R.id.enterFullname)
        var enter_email2: EditText = findViewById(R.id.enterEmail2)
        var mobileno2: EditText = findViewById(R.id.enterMobile2)
        var add: EditText = findViewById(R.id.enteraddress)
        var city: EditText = findViewById(R.id.entercity)
        var regbtn2: Button = findViewById(R.id.btnRegister2)
        var cancel_btn:Button=findViewById(R.id.btncancel)


        regbtn2.setOnClickListener {

            if (fullname.text.isNullOrEmpty())
            {
                fullname.setError("Enter Full Name")
            } else if (enter_email2.text.isNullOrEmpty()) {
                enter_email2.setError("Enter Email")
            } else if (mobileno2.text.isNullOrEmpty() || mobileno2.length() < 10) {
                mobileno2.setError("Must be 10 Degits")
            } else if (add.text.isNullOrEmpty()) {
                add.setError("Enter your Address")
            } else if (city.text.isNullOrEmpty()) {
                city.setError("Enter Your City")
            }
            else {
                    login_info2.Fullname = fullname.text.toString()
                    login_info2.email2 = enter_email2.text.toString()
                    login_info2.mobileno2 = mobileno2.text.toString()
                    login_info2.Address = add.text.toString()
                    login_info2.City = city.text.toString()

                    Intent(this, dashboard::class.java).apply {
                        startActivity(this)

                    }

                Toast.makeText(this, "Hurry!! Booking Successfull", Toast.LENGTH_SHORT).show()
                }
        }
            cancel_btn.setOnClickListener {
                val intent = Intent(this,dashboard::class.java)
                startActivity(intent)
            }
    }
}