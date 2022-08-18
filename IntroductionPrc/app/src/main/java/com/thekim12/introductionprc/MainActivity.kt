package com.thekim12.introductionprc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var rhannThink: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rhannThink = findViewById(R.id.rthannThinkEditText)
    }

    fun showThink(view :View){
        var message = rhannThink.text
        Toast.makeText(view.context, message, Toast.LENGTH_LONG).show()
    }
}