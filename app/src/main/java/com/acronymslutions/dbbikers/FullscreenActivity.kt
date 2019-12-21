package com.acronymslutions.dbbikers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fullscreen.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {

    lateinit var cd: ConnectionDetector
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fullscreen)

        cd = ConnectionDetector()
        cd.isConnectingToInternet(this@FullscreenActivity)

        if (cd.isConnectingToInternet(this@FullscreenActivity)) {
            Handler().postDelayed(object:Runnable {
                public override fun run() {
                    val i = Intent(this@FullscreenActivity, Registration::class.java)
                    startActivity(i)
                    finish()
                }
            }, 4000)

        } else {
            Toast.makeText(applicationContext,
                "Please check your internet Connection", Toast.LENGTH_LONG).show()
        }

    }


}
