package com.tugas_passingyuni

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

      private lateinit var eUser : EditText
      private lateinit var ePassword : EditText
      private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        eUser = findViewById(R.id.eUser)
        ePassword = findViewById(R.id.ePassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            var nUsername = eUser.text.toString()
            val nPassword = ePassword.text.toString()

            val  intentPassingData = Intent(this@MainActivity,Welcomepageactivity::class.java)
            intentPassingData.putExtra("username", nUsername)
            intentPassingData.putExtra("password", nPassword)
            Log.d("cek data username", nUsername)
            Log.d("cek data password", nPassword)

            startActivity(intentPassingData)}


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}