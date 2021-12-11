package com.example.carbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class newpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newpassword)

        var actionbar = supportActionBar
        actionbar!!.title = "New Password"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val cpass:Button=findViewById(R.id.btncpass)
        val current_pass:EditText=findViewById(R.id.currentpass)
        val new_pass:EditText=findViewById(R.id.newpass)
        val confirm_pass:EditText=findViewById(R.id.confirmPassword)
        cpass.setOnClickListener {

            if (current_pass.text.isNullOrEmpty() || new_pass.text.isNullOrEmpty() || confirm_pass.text.isNullOrEmpty()){
                Toast.makeText(this, "Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else if(pass_info.newconfirm_pass!=pass_info.newpassword)
            {
                Toast.makeText(this,"Confirm Password don't Match",Toast.LENGTH_SHORT).show()
            }else{
                pass_info.currentpassword = current_pass.text.toString()
                pass_info.newpassword = new_pass.text.toString()
                pass_info.newconfirm_pass = confirm_pass.text.toString()
                Intent(this,MainActivity::class.java).apply {
                startActivity(this)
                }
            }
            Toast.makeText(this,"Password Change",Toast.LENGTH_SHORT).show()
        }
    }
}