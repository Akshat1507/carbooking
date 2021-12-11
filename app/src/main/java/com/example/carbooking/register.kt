package com.example.carbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class register : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var firstname:EditText=findViewById(R.id.enterFirstname)
        var lastname:EditText=findViewById(R.id.enterLastname)
        var enter_email:EditText=findViewById(R.id.enterEmail)
        var mobileno:EditText=findViewById(R.id.enterMobile)
        var pass_word:EditText=findViewById(R.id.enterPass)
        var confirm:EditText=findViewById(R.id.enterConfirmpass)
        var regbtn:Button=findViewById(R.id.btnRegister)

        var actionbar = supportActionBar
        actionbar!!.title = "Registration Page"
        actionbar.setDisplayHomeAsUpEnabled(true)

        regbtn.setOnClickListener {


            if (firstname.text.isNullOrEmpty())
            {
                firstname.setError("Enter First Name")
            }
            else if (lastname.text.isNullOrEmpty())
            {
                lastname.setError("Enter Last Name")
            }
            else if (enter_email.text.isNullOrEmpty())
            {
                enter_email.setError("Enter Email")
            }
            else if (mobileno.text.isNullOrEmpty() || mobileno.length()<10)
            {
                mobileno.setError("Must be 10 Degits")
            }
            else if (pass_word.text.isNullOrEmpty())
            {
                pass_word.setError("Enter Password")
            }
            else if (confirm.text.isNullOrEmpty())
            {
                confirm.setError("Enter Confirm Password")
            }
            else if(login_info.password!=login_info.confirm_pass)
            {
                Toast.makeText(this, "Passwords don't match", Toast.LENGTH_SHORT).show()
            }
            else{
                login_info.firstname = firstname.text.toString()
                login_info.lastname = lastname.text.toString()
                login_info.email = enter_email.text.toString()
                login_info.mobileno = mobileno.text.toString()
                login_info.password = pass_word.text.toString()
                login_info.confirm_pass = confirm.text.toString()
                Intent(this, MainActivity::class.java).apply {
                    startActivity(this)

                }
                Toast.makeText(this, "Registration Successfull ", Toast.LENGTH_SHORT).show()
            }

        }

    }
}