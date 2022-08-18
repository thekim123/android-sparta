package com.thekim12.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emailEditText = findViewById(R.id.editTextTextEmail)
        titleTextView = findViewById(R.id.appTitle)
    }

    fun clickLogin(view: View){
        var email = emailEditText.text
        var message:String = email.toString()
        if(!email.contains("@")|| email.isEmpty()){
           message = "이메일을 제대로 쳐라 샛귀야!!@@@"
        }
        titleTextView.text = email
        Toast.makeText(view.context, message, Toast.LENGTH_LONG).show()

    }
}