package com.thekim12.introductionprc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {
    private lateinit var printTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        printTextView =findViewById(R.id.thinkTextView)
        var think = intent.getStringExtra("think")
        printTextView.text = think

    }


}