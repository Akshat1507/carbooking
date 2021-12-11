package com.example.carbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var actionbar = supportActionBar
        actionbar!!.title = "Login Page"


        var login:Button=findViewById(R.id.btnLogin)
        val reg:TextView=findViewById(R.id.gotoRegister)
        val fpass:TextView=findViewById(R.id.forgotPassword)
        val u_email:EditText=findViewById(R.id.inputemail)
        val u_pass:EditText=findViewById(R.id.inputPassword)

        login.setOnClickListener{
            val email_input = u_email.text.toString()
            val pass_input = u_pass.text.toString()
            if (u_email.text.isNullOrEmpty() || u_pass.text.isNullOrEmpty()) {
                Toast.makeText(this, "Please input required fields!", Toast.LENGTH_SHORT).show()
            }
            else if (email_input != login_info.email || pass_input != login_info.password) {
                Toast.makeText(this, "Please check your credentials!", Toast.LENGTH_SHORT).show()
            }
            else {
                Intent(this, dashboard::class.java).apply {
                    startActivity(this)
                }
            }

        reg.setOnClickListener{
            val intent=Intent(this,register::class.java)
            startActivity(intent)
        }

        fpass.setOnClickListener{
            val intent=Intent(this,newpassword::class.java)
            startActivity(intent)
        }
    }
}
}