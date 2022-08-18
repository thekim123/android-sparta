package com.thekim12.personalitytype

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TypeTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_test)
    }

    fun clickSubmit(view: View) {
        var seekbar: SeekBar = findViewById(R.id.seekbarQ1)
        Toast.makeText(view.context, seekbar.progress, Toast.LENGTH_LONG).show()
    }
}