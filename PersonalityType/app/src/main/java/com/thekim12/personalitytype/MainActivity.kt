package com.thekim12.personalitytype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickPersonalityButton(view: View){
        var button = view as Button
        var intent = Intent(this@MainActivity, ResultActivity::class.java)
        intent.putExtra("PersonalKey", button.text)
        startActivity(intent)
    }

    fun clickTypeTest(view: View){
        var intent = Intent(this@MainActivity, TypeTestActivity::class.java)
        startActivity(intent)
    }

    
}