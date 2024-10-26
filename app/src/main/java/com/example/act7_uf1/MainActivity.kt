package com.example.act7_uf1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText: EditText = findViewById(R.id.editTextUsername)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val confirmButton: Button = findViewById(R.id.buttonConfirm)

        confirmButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            Toast.makeText(this, "Usuari: $username, Contrasenya: $password", Toast.LENGTH_SHORT).show()
            Log.d("LoginInfo", "Usuari: $username, Contrasenya: $password")
        }
    }
}
