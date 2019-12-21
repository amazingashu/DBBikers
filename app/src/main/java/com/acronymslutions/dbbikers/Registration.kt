package com.acronymslutions.dbbikers

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*
import kotlinx.android.synthetic.main.content_registration.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Registration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        setSupportActionBar(toolbar)

        val Name=etName.text.toString().trim()
        val Email=etEmail.text.toString().trim()
        val Phone=etPhone.text.toString().trim()
        val Password=etNewPassword.text.toString().trim()

        btnSignUp.setOnClickListener{

            /*if (Name.isEmpty()) {
                etName.setError("Name is required");
                etName.requestFocus();
                return@setOnClickListener;
            }

            if (Email.isEmpty()) {
                etEmail.setError("Email is required");
                etEmail.requestFocus();
                return@setOnClickListener;
            }

            if (Phone.isEmpty()) {
                etPhone.setError("Phone Number is required");
                etPhone.requestFocus();
                return@setOnClickListener;
            }
            if (Password.isEmpty()) {
                etNewPassword.setError("Password is required");
                etNewPassword.requestFocus();
                return@setOnClickListener;
            }
*/
                   ApplicationRClient.instance.createUser(Name, Email, Phone, Password)
               .enqueue(object : Callback<DefaultResponse>{
                   override fun onFailure(call: Call<DefaultResponse>, t: Throwable) {
                     Toast.makeText(applicationContext,t.message,Toast.LENGTH_LONG).show()
                   }

                   override fun onResponse(
                       call: Call<DefaultResponse>,
                       response: Response<DefaultResponse>
                   ) {
                       Toast.makeText(applicationContext,response.body()?.message,Toast.LENGTH_LONG).show()
                   }

               })



        }
    }

}
