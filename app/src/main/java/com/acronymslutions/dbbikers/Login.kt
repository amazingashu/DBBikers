package com.acronymslutions.dbbikers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Email=etEmail.text.toString().trim()
        val Password=etNewPassword.text.toString().trim()

        btnSignIn.setOnClickListener {


        }
    }
}
