package dev.francisco.pharmacycardviewrecycler

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashcreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashcreen);


        Handler(Looper.getMainLooper()).postDelayed({
            val i = intent
            val j = Intent(this, MainActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        },10000)
    }
}